def call() {
    stage('Clone Repository') {
        git branch: 'main', url: 'https://github.com/pravesh2201/Ansible.git'
    }
}
