pipeline {
    agent any  // Runs the pipeline on any available agent

    environment {
//         // Optional: Define any environment variables here
        MAVEN_HOME = '/opt/maven'
        JAVA_HOME = '/opt/java'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from your repository
                echo "Fetching from github"
                git 'https://github.com/akashshukla-ring/calculator'
            }
        }

        stage('Build') {
            steps {
                script {
                    // Run Maven build (adjust this based on your actual Maven setup)
                    echo "Building using maven"
                    sh "${MAVEN_HOME}/bin/mvn clean install -DskipTests=true"
//                        sh "mvn clean install -DskipTests=true"
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Run tests using Maven (change command to fit your needs)

                    echo "Testing using maven"
                    sh "${MAVEN_HOME}/bin/mvn tests"
//                     sh "mvn test"
                }
            }
        }

//         stage('Package') {
//             steps {
//                 script {
//                     // Package the application (if you need a JAR or WAR file)
//                     sh "${MAVEN_HOME}/bin/mvn package"
//                 }
//             }
//         }

        stage('Publish Test Results') {
            steps {
                junit '**/target/test-*.xml'  // Publish test results in JUnit format
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Example deployment step, adjust to fit your needs (e.g., Docker, AWS, etc.)
                    echo "Deploying the application..."
                    // You can add your deployment commands here (e.g., Docker, Kubernetes, etc.)
                }
            }
        }
    }

//     post {
//         always {
//             // Clean up workspace or notify build status
//             cleanWs()
//         }
//
//         success {
//             // Send success notification (e.g., email, Slack)
//             echo "Build and deployment completed successfully!"
//         }
//
//         failure {
//             // Send failure notification
//             echo "Build or deployment failed."
//         }
//     }
}
