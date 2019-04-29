def call()
{
 node
 {
  stage('Sample')
  {
   def SampleObj = new Scripts.testgroovy()
   SampleObj.testgroovy()
   echo "Welcome to Jenkins"
  }
 }
}
