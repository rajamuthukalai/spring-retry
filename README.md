# spring-retry

http://localhost:8080/app/{username}

http://localhost:8080/app/raja
Output:
Welcome raja! have a nice day!!!


http://localhost:8080/app/null
When username is passed as null, it retries 3 times then calls the callback method returns user as default.
Output:
Welcome default! have a nice day!!!
