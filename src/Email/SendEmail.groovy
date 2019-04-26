package Email
def SendEmail(String from, String  to, String subject)
{
mail bcc: '', body: 'Demo', cc: from, from: from , replyTo: '', subject: subject, to: to
echo 'email sent successfully'
}
