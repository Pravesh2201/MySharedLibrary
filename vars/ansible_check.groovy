def call() {
    stage('Clone Repository') {
        git branch: 'main', url: 'https://github.com/Pravesh2201/ElasticSearch.git'
    }
}
