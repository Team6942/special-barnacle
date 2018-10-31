pipeline {
  agent any
  stages {
    stage('error') {
      steps {
        sh ' ./gradlew assembleRelease '
      }
    }
  }
}