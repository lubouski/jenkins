node {
// checkout is mandatory without it we can't load another groovy script with our functions
         stage("test") {
             checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/lubouski/jenkins.git']]])   
             sh "ls"
         }
         
         def pipeline = load 'jenkinsfile.function.groovy'
         def isBootstrap = "true"
   
        stage('Deploy promotion: test execution') {
            timeout(time:1, unit:'DAYS') {
                test_approve = input(
                    message: "Deploy to TEST?",
                    submitterParameter: 'approved_by',
                    parameters: [
                        [$class: 'TextParameterDefinition', defaultValue: "NO", description: 'Please type YES to continue with TEST', name: 'exchange']
                    ]
                )
            }
            if (test_approve.exchange != "YES") {
                currentBuild.result = 'ABORTED'
                error ("Build was aborted")
            }
        }

         stage("execution function") {
             pipeline.exec_bash('hello', "$BUILD_ID", "$isBootstrap", "fsn1-1-kube-currency-exchange-test.config")
         }
}
