def caller(from, to, subject)
{
println "Welcome. mail"
mail bcc: '', body: 'Demo', cc: from, from: from , replyTo: '', subject: subject, to: to
println "email sent successfully"
}
