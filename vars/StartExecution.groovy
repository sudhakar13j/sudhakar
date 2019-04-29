def call()
{
 node
 {
  stage('Sample')
  {
   def obj = new Scripts.testgroovy()
   echo "Welcome to Jenkins"
  }
  stage('SendEmail')
  {
   echo "Email Sent successfully"
  }
 }
}
