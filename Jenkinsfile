node {
 try  {
 notify('Job Started') 

     
  stage('Git-Checkout') {
   git 'https://github.com/Sandeepkr93/DockerImage201.git'
  }
    
 def project_path=""
 
 dir(project_path) {
    
  stage('Maven-Clean') {
   sh label: '', script: 'mvn clean'
  }
    
 stage('Maven-Compile') {
   sh label: '', script: 'mvn compile'
  }
 stage('SonarQube Analysis') {
    
              withSonarQubeEnv('Sonarqube') {
                 sh 'mvn sonar:sonar'
            }    
    }
  
  stage('Maven-Test') {
   sh label: '', script: 'mvn test'
  }
 
   stage('Maven-Package') {
   sh label: '', script: 'mvn package'
  }
  stage('Archive Package in jfrog') {
def server= Artifactory.server 'jfrog'
                    def uploadSpec= """{
                        "files": [{
                        "pattern": "target/*.jar",
                        "target": "DevOps301Test"}]
                    }"""
                    server.upload (uploadSpec)
}  
    stage('Jfrog Artifactory download'){
    def server= Artifactory.server 'jfrog'
    def downloadSpec = """{
    "files": [
    {
      "pattern": "target/*.jar",
      "target": "/home/mtadminnuvepro/jFrogArtifacte/"
      
    }
    ]
    }"""
    server.download(downloadSpec)
}
   stage('Input for deploy in test server') {  
   input('Do you want to test server proceed?')      
    }
   stage('Docker-Stage-Deployment') {
   sh label: '', script: 'docker-compose up -d --build'
  }
 
  stage('Geting Ready For Ansible') {
  sh label: 'Docker', script: 'cp -rf target/*.war Terraform/Ansible/ansible/04-Tomcat/templates/'
  
}  
   
 }

def project_terra="Terraform/Ansible"
dir(project_terra) {
   stage('Prod Deployment on AWS'){
   sh label: 'terraform', script: '/bin/terraform  init'
   sh label: 'terraform', script: '/bin/terraform  apply -input=false -auto-approve'
   }
}

notify('Job Completed')   
} catch (err) {
  notify("Error ${err}")
  currentBuild.result = 'FAILURE'
}
}



def notify(status){
    emailext (
	to: "sandeepkumar.kiit@gmail.com",
	subject: "${status}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
	 body: """<p>${status}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
	<p>Check console output at <a href='${env.BUILD_URL}'>${env.JOB_NAME} [${env.BUILD_NUMBER}]</a></p>""",
		)
	}
