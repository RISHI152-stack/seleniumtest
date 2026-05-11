pipeline {
    agent any
    tools {
        maven 'Maven' // Make sure 'Maven' is configured in Jenkins Global Tools
        jdk 'Java'    // Make sure a JDK is configured
    }
    environment {
        // Optional: path to ChromeDriver if not in system PATH
        CHROMEDRIVER = '/usr/bin/chromedriver'
        PATH = "${env.CHROMEDRIVER}:${env.PATH}"
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
                // Run Selenium headless app
                sh 'mvn compile exec:java -Dexec.mainClass="com.example.App"'
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
