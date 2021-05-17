# hystrix-consumer

Requirement:
1. Java 11

Dependency: 
hystrix-producer

App Port: 8889, which can be changed inside application.properties

Start the server and hit below URL:
http://localhost:8889/user/{any name}

Response:
Hello {any name}

Make sure you are running hystrix-prodcer as well

In case hystrix-prodcer is down Hystrix will return default message

Hystrix dashboard:
http://localhost:8889/hystrix/monitor
