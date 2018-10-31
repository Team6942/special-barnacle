pipeline {
  agent {
    node {
      label 'aaa'
    }

  }
  stages {
    stage('error') {
      steps {
        sh ' ./gradlew assembleRelease '
      }
    }
  }
}