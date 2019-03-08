#!/bin/bash
PID=$(netstat -tnpl | grep :7200 | awk '{print $7}' | awk -F '/' '{print $1}')
kill -9 $PID
echo "kill process at pid = [$PID]"
nohup java -jar /test_dir/test_jenkins/test_jenkins.jar &
echo 'spring boot reload success'