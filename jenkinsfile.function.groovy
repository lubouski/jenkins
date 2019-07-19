echo 'common loaded'

def exec_bash(input_word, id, isBootstrap) {
    withCredentials([file(credentialsId: "fsn1-1-kube-currency-exchange-test.config", variable: 'KUBE_CONFIG')]) {
    sh """ 
       echo $input_word $id 
       cat $KUBE_CONFIG
       if [ "${isBootstrap}" = "true" ]
       then
         echo "Bootstrap true"
       else
         echo "Bootstrap is false"
       fi
       """
    }
}
// important to not forget "return this"
return this
