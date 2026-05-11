pipeline {
    agent any
    tools {
        maven 'Maven' 
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/RISHI152-stack/seleniumtest.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Run Application') {
            steps {
                sh 'java -jar target/MavenSelenium-1.0-SNAPSHOT.jar'
            }
        }
    }
    post {
        success {
            echo 'Build, tests, and application ran successfully!'
        }
        failure {
            echo ' Something failed in the pipeline. Check the console output.'
        }
    }
}
