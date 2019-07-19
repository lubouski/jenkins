echo 'common loaded'

def exec_bash(input_word, id, isBootstrap, credencials) {
    withCredentials([file(credentialsId: "$credencials", variable: 'KUBE_CONFIG')]) {
    sh """ 
       echo $input_word $id 
       cat $KUBE_CONFIG
       if [ "${isBootstrap}" = "true" ]
       then
         echo "Bootstrap true ${isBootstrap}"
       elif [ "${isBootstrap}" = "false" ]
       then
         echo "Bootstrap is false"
       else
         echo "please provide valid value"; exit 1
       fi
       """
    }
}
// important to not forget "return this"
return this
