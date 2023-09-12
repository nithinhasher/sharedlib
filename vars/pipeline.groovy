// package org.example

// class Pipeline {
// def abc(string repoUrl) {
//     // Your clone logic here
//     git url: ${repoUrl}
// }
def call(String repoUrl, String branch){
   def workingDir = "${env.WORKSPACE}"
   sh "git clone ${repoUrl} ${workingDir}"
   sh "git checkout ${branch}"
   return workingDir
}

// def callBuild(targetDir) {
//     // Your build logic here
//     dir(targetDir) {
//         sh "mvn clean install"
//     }
// }

// def callRunTests(targetDir) {
//     // Your test logic here
//     dir(targetDir) {
//         sh "mvn test"
//     }
// }

    // def callPushChanges(targetDir) {
    //     // Your push changes logic here
    //     dir(targetDir) {
    //         sh "git add ."
    //         sh "git commit -m 'Automated build and test'"
    //         sh "git push"
    //     }
    // }
// }
