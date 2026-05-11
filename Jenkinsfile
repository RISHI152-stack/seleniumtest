pipeline {
  agent any
  tools {
    maven 'Maven'
  }
  stages {
    stage('Checkout') {
      steps {
        git branch: 'main', url: "https://github.com/RISHI152-stack/seleniumtest.git"
      }
    }
    stage('Build') {
      steps {
        sh 'mvn clean install'
      }
    }
    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }
    stage('Run-application') {
      steps {
        sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
      }
    }
  }
  post {
    success {
      echo 'Build and implementation success'
    }
    failure {
      echo 'Build failed'
    }
  }
}
