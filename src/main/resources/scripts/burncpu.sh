#!/bin/bash
# Script for BurnCpu Chaos Monkey

cat << EOF > /tmp/infiniteburn.sh
#!/bin/bash
while true;
    do openssl speed;
done
EOF

echo 'burncpu' > /tmp/test.log
sleep 120

# 32 parallel 100% CPU tasks should hit even the biggest EC2 instances
for i in {1..32}
do
    nohup /bin/bash /tmp/infiniteburn.sh > /tmp/nohup.log 2>&1 &
done
