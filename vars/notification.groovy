def call() {
    stage('notify') {
          emailext body: 'success', subject: 'Status', to: 'wpraveshgangwar04@gmail.com'
          slackSend channel: '#jenkins-notification', message: 'successfull '
    }
}
