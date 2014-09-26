package de.appdynamics.ace.tutorial.customagent.simple;

import com.singularity.ee.agent.systemagent.api.AManagedMonitor;
import com.singularity.ee.agent.systemagent.api.MetricWriter;
import com.singularity.ee.agent.systemagent.api.TaskExecutionContext;
import com.singularity.ee.agent.systemagent.api.TaskOutput;
import com.singularity.ee.agent.systemagent.api.exception.TaskExecutionException;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

import java.util.Map;
import java.util.Random;

/**
 * Createdkjj with IntelliJ IDEA.
 * User: stefan.marx
 * Date: 09.10.13
 * Time: 14:53
 * To change this template use File | Settings | File Templates.
 */
public class SimpleAgent extends AManagedMonitor {

    private static Logger logger = Logger.getLogger(SimpleAgent.class);


    private final static String metricPrefix = "Custom Metrics|MySimpleAgent|MyShelter|";


    public SimpleAgent() {
        logger.log(Level.INFO," LOADED !!!!");


    }

    public TaskOutput execute(Map<String, String> stringStringMap, TaskExecutionContext taskExecutionContext) throws TaskExecutionException {
        MetricWriter mw = getMetricWriter(metricPrefix + "Base Metric",
                MetricWriter.METRIC_AGGREGATION_TYPE_AVERAGE,
                MetricWriter.METRIC_TIME_ROLLUP_TYPE_AVERAGE,
                MetricWriter.METRIC_CLUSTER_ROLLUP_TYPE_INDIVIDUAL);

        mw.printMetric("765215");


        mw = getMetricWriter(metricPrefix + "Nope",
                MetricWriter.METRIC_AGGREGATION_TYPE_AVERAGE,
                MetricWriter.METRIC_TIME_ROLLUP_TYPE_AVERAGE,
                MetricWriter.METRIC_CLUSTER_ROLLUP_TYPE_INDIVIDUAL);


        Random r = new Random(System.currentTimeMillis());
        long l = r.nextInt(1000);

        mw.printMetric(String.valueOf( (int) Math.sqrt(l)) );


        System.out.println(" ------------->>>>>> MONITORED <<<<<<<<<-------------------");
        return new TaskOutput("Metric Upload Complete");

    }


}

