pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/tejapulicharla/jenkins.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Hello Jenkins! Build is running...'
            }
        }
    }    
}








