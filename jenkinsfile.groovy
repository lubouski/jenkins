node {
         stage("test") {
             sh "ls"
         }

   
         stage("execution function") {
             sh "echo win-win-win!"
         }
}
