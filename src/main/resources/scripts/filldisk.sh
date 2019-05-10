#!/bin/bash
# Script for FillDisk Chaos Monkey

# 65 GB should be enough to fill up all EC2 root disks!
nohup dd if=/dev/urandom of=/burn bs=1M count=65536 iflag=fullblock > /tmp/nohup.log 2>&1 & disown
pid=$!
echo $pid > /tmp/test.log
grep Sig /proc/$pid/status >> /tmp/test.log
pstree -p $pid >> /tmp/test.log
