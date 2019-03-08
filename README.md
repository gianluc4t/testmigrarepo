# java authorization sample
____

This app is just a template base to develop Web service restfull , using 


____
 
** Prerequisites **

1. java 8
1. mvn 3.5
1. a http tool to perform  post (like POSTMAN ou SOAPui)

____
  
** Run local **
 
> mvn clean spring-boot:run

____

** Generate auth token **

to generate authentication token, execute a POST to localhost:8080/login, using as a body the follow
{"email" : "user","senha" : "password"}

____

** inject token **

to inject the token to authenticate the request: add to a header with the KEY "Authorization" and as a valeu the token returned by /login  ("Bearer eyJhbdasda....")


