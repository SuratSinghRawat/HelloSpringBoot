pipeline{   
	agent any
    environment {
        imageName = "mvn-hello-spring"
        registryCredentials = "Nexus-Cred" 
        registry="ec2-65-0-23-242.ap-south-1.compute.amazonaws.com:8082/"
        dockerImage = ''
            }
      stages{           
        stage('Package'){		  
              steps{		  
                  bat 'mvn package'
              }
        }
        stage("building Image"){
            steps{
                script{
                   dockerImage = docker.build imageName
                }
            }
        }
      /*  stage("Deploy Image"){
            steps{
                script{
                    docker.withRegistry('http://'+registry, registryCredentials){
                    dockerImage.push("${env.BUILD_NUMBER}")
                    
                    }
                }
            }
        } */  
      }
}