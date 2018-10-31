pipeline {
  agent any
  stages {
    stage('error') {
      steps {
        sh 'sudo ./gradlew assembleRelease '
      }
    }
  }
}