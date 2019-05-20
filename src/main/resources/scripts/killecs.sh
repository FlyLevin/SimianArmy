#!/bin/bash

docker ps|grep shadow|awk -F '{print $1}' > /tmp/contaner-id
