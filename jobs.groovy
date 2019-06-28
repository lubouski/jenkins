pipeline {
    agent any

    parameters {
        string(defaultValue: "TEST-ENV", description: 'What environment?', name: 'userFlag')
        choice(choices: ['US-EAST-1', 'US-WEST-2', 'ALL'], description: 'What AWS region?', name: 'region')
    }
    stages {
        stage("executing echo command") {
            steps {
                script {
                    if (params.region != "ALL") {
                       sh "echo ${params.region}"
                    } else {
                       sh "echo ALL"
                    }
                 }
            }
        }
    }
}
