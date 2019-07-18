node {
    def pipeline = load 'Jenkinsfile.common.groovy'  
   
    stage("execution function") {
        pipeline.exec_bash(hello, chubakka-333)
    }
}
