def call(String repoUrl){
   sh "git clone ${repoUrl}"
   // sh "git checkout ${branch}"
   // return workingDir
}
def callname(name){
  echo "Hey ${name}, How are you!!.."
}
