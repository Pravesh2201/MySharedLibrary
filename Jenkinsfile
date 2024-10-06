@Library("MySharedLibrary") _
pipeline {
    agent any
    stages {
        stage('clone repository') {
            steps {
                ansible_check()
            }
        }
        stage('approval_user') {
            steps {
                approval_user()
            }
        }
        stage('playbook execution') {
            steps {
                Playbook_Execution()
            }
        }
        stage('notify') {
            steps {
                notification()
            }
        }
    }
}
