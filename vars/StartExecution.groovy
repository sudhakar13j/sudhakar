def call()
{
 node
 {
  stage('Sample')
  {
   echo "Welcome to Jenkins"
  }
  stage('SendEmail')
  {
   echo "Email Sent successfully"
  }
 }
}
