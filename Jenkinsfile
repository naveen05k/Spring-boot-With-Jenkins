pipeline {
    agent any

    tools {
        maven 'Maven 3.8.1'  // Make sure this matches your Jenkins global tool config
        jdk 'Java 21'        // Make sure this JDK is configured in Jenkins
    }

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/naveen05k/Spring-boot-With-Jenkins.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying... (Add your deployment logic here)'
            }
        }
    }
}
