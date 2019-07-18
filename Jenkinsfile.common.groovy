echo 'common loaded'

def exec_bash(input_word, id) {
    sh "echo $input_word $id"
}
// important to not forget "return this"
return this
