def extraPackages = [
    'kazoo',
    'jmespath',
    'grampg',
    'hvac',
    'dnspython',
    'pywinrm',
    'passlib'
]

pipeline {
    agent any

    parameters {
        string(defaultValue: "dev-1", description: 'What version?', name: 'Version')
        choice(choices: ['US-EAST-1', 'US-WEST-2', 'ALL'], description: 'What AWS region?', name: 'region')
    }
    stages {
        stage("executing echo command") {
            steps {
                script {
                    if (params.region != "ALL") {
                       sh "echo ${params.region}"
                    } else {
                       sh "./build.sh ${params.Version} ${extraPackages.join(' ')}"
                    }
                 }
            }
        }
    }
}
