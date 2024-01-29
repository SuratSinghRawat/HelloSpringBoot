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
      }
}