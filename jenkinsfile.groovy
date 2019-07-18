node {
         stage("test") {
             sh "cat ${WORKSPACE}/Jenkinsfile.common.groovy"
         }

   
         stage("execution function") {
             sh "echo win-win-win!"
         }
}
