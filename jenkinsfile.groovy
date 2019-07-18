def pipeline = load 'Jenkinsfile.common.groovy'

pipeline {
    agent any
    stages {
         stage("test") {
             sh cat Jenkinsfile.common.groovy
         }

   
         stage("execution function") {
             pipeline.exec_bash(hello, chubakka-333)
         }
  }
}
