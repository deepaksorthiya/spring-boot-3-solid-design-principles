# Getting Started
## Requirements:
```
Spring Boot: 3.3.2
Maven: 3.9+
Java: 17
```

### Clone this repository:

```bash
git clone https://github.com/deepaksorthiya/spring-boot-3-solid-design-principles.git
```
```bash
cd spring-boot-3-solid-design-principles
```

### Build Project:

```bash
./mvnw clean package
```

### Run Project:

```bash
./mvnw spring-boot:run
```

### Sample API Request:
```
POST http://localhost:8080/send-notification
{
    "message": "hello",
    "recipient": "9111111111",
    "type": "SMS"
}

{
    "message": "hello",
    "recipient": "ssffsf@abc.com",
    "type": "EMAIL"
}

{
    "message": "hello",
    "recipient": "mobile push",
    "type": "PUSH"
}
```

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.4/reference/htmlsingle/index.html#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)