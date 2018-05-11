//sample Jenkinsfile 
node('master'){
    stage('build'){
        sh 'mvn clean install'
               
    }
    stage('static code analysis'){
        sh 'mvn verify sonar:sonar'
    }
}






