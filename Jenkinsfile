node  {
  def extraPackages = [
    'kazoo',
    'jmespath',
    'grampg',
    'hvac',
    'dnspython',
    'pywinrm',
    'passlib'
  ]

  stage('execute shell') {
      ansiColor('xterm') {
          sh ("echo ${extraPackages.join(' ')}")
      }
 }
}


