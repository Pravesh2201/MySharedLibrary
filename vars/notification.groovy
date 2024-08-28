def call() {
    stage('notify') {
          emailext body: 'success', subject: 'Status', to: 'wangchuklepcha801@gmail.com'
          slackSend channel: '#assignment', message: 'successfull '
    }
}
