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
          sh ("echo ${extraPackages.join(' ')}")
 }
}


