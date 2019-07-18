pipeline {
    agent any
    def function_call = load 'Jenkinsfile.common.groovy' 
    stages {
        stage("execution function") {
        function_call.exec_bash(hello, chubakka-333)
        }
    }
}
