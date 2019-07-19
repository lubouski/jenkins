echo 'common loaded'

def exec_bash(input_word, id) {
    withCredentials([file(credentialsId: "fsn1-1-kube-currency-exchange-test.config", variable: 'KUBE_CONFIG')]) {
    sh "echo $input_word $id $KUBE_CONFIG"
    }
}
// important to not forget "return this"
return this
