node {
    def pipeline = load 'Jenkinsfile.common.groovy'  
    stages {
        stage("execution function") {
        pipeline.exec_bash(hello, chubakka-333)
        }
    }
}
