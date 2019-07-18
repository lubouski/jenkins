node {
         stage("test") {
             checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/lubouski/jenkins.git']]])
}   
             sh "ls"
         }

   
         stage("execution function") {
             sh "echo win-win-win!"
         }
}
