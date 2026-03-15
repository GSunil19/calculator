pipeline {
    agent { label 'built-in' }

    environment {
        IMAGE_NAME = "gsunil123/calculator"
    }

    stages {

        stage('1: Cloning Repository from GitHub') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/GSunil19/calculator.git'
            }
        }

        stage('2: Maven Build') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }

        stage('3: Unit Testing') {
            steps {
                sh 'mvn test'
            }
        }

        stage('4: Building Docker Image') {
            steps {
                script {
                    docker_image = docker.build("${IMAGE_NAME}:latest")
                }
            }
        }

        stage('5: Pushing Docker image to DockerHub') {
            steps {
                withCredentials([usernamePassword(
                        credentialsId: 'DockerPwd',
                        usernameVariable: 'USER',
                        passwordVariable: 'PASS')]) {

                    sh '''
                        echo $PASS | docker login -u $USER --password-stdin
                        docker push $IMAGE_NAME:latest
                    '''
                }
            }
        }

        stage('6: Clean Docker Images') {
            steps {
                sh 'docker container prune -f'
                sh 'docker image prune -f'
            }
        }

        stage('7: Ansible Deployment') {
            steps {
                sh 'ansible-playbook ansible/deploy.yml -i ansible/inventory.ini'
            }
        }
    }

    post {
        always {
            mail(
                to: 'sunilgumpu200@gmail.com',
                subject: "Build ${currentBuild.currentResult}",
                body: "Build URL: ${env.BUILD_URL}"
            )
        }
    }
}