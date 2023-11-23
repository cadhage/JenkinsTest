pipeline{
    agent any{
        stages{
            stage("Clean Up"){
                steps{
                    deleteDir();
                }
            }
            stage("Clone Repo"){
                steps{
                    step{
                        sh "git clone https://github.com/cadhage/JenkinsTest.git"
                    }
                }
            }
            stage("Build"){
                steps{
                     dir("simple-java-maven-app"){
                        sh "mvn clean install"
                     }
                }
            }
            stage("Test"){
                step{
                    dir("simple-java-maven-app"){
                        sh "mvn test"
                    }
                }
            }
        }
    }
}