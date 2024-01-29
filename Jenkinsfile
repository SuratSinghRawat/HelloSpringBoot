pipeline{   
	agent any
      stages{           
          stage('Compile'){             
              steps{
                  bat 'mvn compile'
	               }
          }
          stage('Package'){		  
              steps{		  
                  bat 'mvn package'
              }
          }
          stage('Upload-Nexus-Artifact'){		  
              steps{		  
                  nexusArtifactUploader artifacts: [
                    [
                        artifactId: 'HelloSpringBoot', 
                        classifier: '', 
                        file: 'D:\\data\\jenkins_home\\workspace\\maven-spring-nexus\\HelloSpringBoot-0.0.1-SNAPSHOT.jar', 
                        type: 'jar'
                    ]], 
                        credentialsId: 'Nexus-Cred', 
                        groupId: 'com.example', 
                        nexusUrl: '65.0.23.242:8081', 
                        nexusVersion: 'nexus3', 
                        protocol: 'http', 
                        repository: 'Rawat-Maven-Repo', 
                        version: '0.0.1-SNAPSHOT'
              }
          }
      }
}