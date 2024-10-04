pipeline {
    agent any

    environment {
        DOCKERHUB_CREDENTIALS_ID = 'dockerhub-credentials'
        DOCKERHUB_REPO = 'jesperss/calulcator'
        DOCKER_IMAGE_TAG = 'ver2'
    }

    stages {
        stage('Checkout') {
            steps {
                git ''
            }
        }
        stage('Run Tests') {
            steps {
                sh 'mvn clean test' // Uncomment if on a Linux agent
            }
        }
        stage('Code Coverage') {
            steps {
                // Generate Jacoco report after the tests have run
                sh 'mvn jacoco:report'
            }
        }
        stage('Publish Test Results') {
            steps {
                // Publish JUnit test results
                junit '**/target/surefire-reports/*.xml'
            }
        }
        stage('Publish Coverage Report') {
            steps {
                // Publish Jacoco coverage report
                jacoco()
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    docker.build("${env.DOCKERHUB_REPO}:${env.DOCKER_IMAGE_TAG}")
                }
            }
        }
        stage('Push Docker Image to Docker Hub') {
            steps {
                script {
                    docker.withRegistry('https://index.docker.io/v1/', env.DOCKERHUB_CREDENTIALS_ID) {
                        docker.image("${env.DOCKERHUB_REPO}:${env.DOCKER_IMAGE_TAG}").push()
                    }
                }
            }
        }
    }
}