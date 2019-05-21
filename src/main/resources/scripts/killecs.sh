#!/bin/bash

docker ps|grep test|awk -F '{print $1}' > /tmp/container-id
killid=`shuf -n 1 /tmp/container-id`
docker kill $killid