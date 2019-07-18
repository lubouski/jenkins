node {
         stage("test") {
             checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/lubouski/jenkins.git']]])   
             sh "ls"
         }
         
         def pipeline = load 'Jenkinsfile.common.groovy'
   
         stage("execution function") {
             pipeline.exec_bash(hello, chubakka333)
         }
}
