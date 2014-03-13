package com.appdynamics.ace.test.dynservice;

import com.singularity.ee.agent.appagent.services.bciengine.BCIEngineService;

import javax.management.ObjectName;

/**
 * Created by stefan.marx on 27.02.14.
 */
public class TestServiceController implements TestServiceControllerMBean {
    private final TestService _svc;
    private ObjectName _objectName;
    private boolean _enabled;

    public TestServiceController(TestService testService) {
        _svc = testService;
    }

    public String hello(String p1) {

        return p1.toUpperCase();
    }

    @Override
    public String analyzeClass(String classname) {

        BCIEngineService bci = (BCIEngineService) _svc.getCtx().getService(BCIEngineService.class);


        return bci.toString();
    }

    @Override
    public ObjectName getObjectName() {
        return _objectName;
    }

    @Override
    public boolean isEnabled() {
        return _enabled;
    }

    @Override
    public void setEnabled(boolean b) {
         _enabled = b;
    }

    @Override
    public void setObjectName(ObjectName objectName) {
        _objectName = objectName;
    }


}
