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
                sh 'mvn clean compile exec:java -Dexec.mainClass="com.example.App"'
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
