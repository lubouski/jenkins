def function_call = load 'Jenkinsfile.common.groovy'

pipeline {
    agent any

    stages {
        stage("execution function") {
        function_call.exec_bash(hello, chubakka-333)
        }
    }
}
