def cloneRepo(String repoUrl){
   sh "git clone ${repoUrl}"
   // sh "git checkout ${branch}"
   // return workingDir
}
// def callname(name){
//   echo "Hey ${name}, How are you!!.."
// }
def callCompile(targetDir) {
    // Your build logic here
    dir(targetDir) {
        sh "mvn compile"
    }
}
def callTest(targetDir) {
    // Your build logic here
    dir(targetDir) {
        sh "mvn test"
    }
}
def callBuild(targetDir) {
    // Your build logic here
    dir(targetDir) {
        sh "mvn clean install"
    }
}


