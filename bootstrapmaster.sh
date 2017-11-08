#!/bin/bash

yum install -y net-tools
yum install -y git
yum install -y java-1.8.0-openjdk-devel.x86_64
yum install -y nginx 
sed -i ':a;$!{N;ba};s/location \/ {/location \/ { proxy_pass http:\/\/192.168.56.2:8080\/;/' /etc/nginx/nginx.conf
systemctl start nginx

cd /vagrant/
export JENKINS_HOME=/vagrant/.jenkins
nohup java -jar jenkins.war &


