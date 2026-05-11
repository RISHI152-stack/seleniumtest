pipeline{
  agent any
  tools{
    maven'Maven'
  }
  stages{
    stage('Check-Out'){
      steps{
        git branch:'main',url=""
      }
    }
    stage('Build'){
      steps{
        sh'mvn clean package'
      }
    }
    stage('Test'){
      steps{
        sh'mvn test'
      }
    }
    stage('Run-application'){
      steps{
        sh'mvn clean install'
      }
    }
  }
  post{
    success{
      echo'Build and implementation success'
    }
    failure{
      echo'failed'
    }
  }
}
