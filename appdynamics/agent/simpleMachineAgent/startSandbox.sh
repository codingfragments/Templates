#!/bin/bash
JAVA_OPTIONS='-Dappdynamics.agent.applicationName=APPDEX_LBG_test
-Dappdynamics.controller.hostName=localhost
-Dappdynamics.controller.port=8080
-Dappdynamics.agent.tierName=APPDEX
-Dappdynamics.agent.nodeName=NodeUTIL
-Dappdynamics.agent.uniqueHostId=TESTER123
-Dcom.appdynamics.machineAgent.ignoreEmptyMetrics=true
-Dappdynamics.agent.accountAccessKey=SJ5b2m7d1$354
-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005'

java $JAVA_OPTIONS -jar ./build/sandbox/agent/machineagent.jar
#34178a39-50e2-4e7e-bbd9-b5c83c737299