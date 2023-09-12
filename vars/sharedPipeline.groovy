def cloneRepo(String repoUrl){
   sh "git clone ${repoUrl}"
}

def callCompile(targetDir) {
    // Your compile logic here
    dir(targetDir) {
        sh "mvn compile"
    }
}
def callTest(targetDir) {
    // Your test logic here
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


