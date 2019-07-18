node {
// checkout is mandatory without it we can't load another groovy script with our functions
         stage("test") {
             checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/lubouski/jenkins.git']]])   
             sh "ls"
         }
         
         def pipeline = load 'jenkinsfile.function.groovy'
   
         stage("execution function") {
             pipeline.exec_bash('hello', 'chubakka333')
         }
}
