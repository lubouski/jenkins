node {
         stage("test") {
             sh "cat Jenkinsfile.common.groovy"
         }

   
         stage("execution function") {
             sh "echo win-win-win!"
         }
}
