node {
// pipeline {
//    agent any

    parameters {
        string(defaultValue: "TEST", description: 'What environment?', name: 'userFlag')
        choice(choices: ['US-EAST-1', 'US-WEST-2'], description: 'What AWS region?', name: 'region')
    }
//    stages {
        stage("executiong echo command") {
            steps {
                sh "echo ${params.region}"
            }
        }
//    }
}
