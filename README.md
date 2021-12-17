# Employee-Service

Employee and Product service record  using Spring Boot and H2 along with REST APIs

## Techs used

- IntellIJ
- Spring Boot + JPA
- Maven
- H2 Database
- JUnit + Mockito
- Log4J2
- Basic Authentication
- Postman

## Installation

- Install Java (minimum requirement is Java 8)
- Setup environment variables for Java configuration
- Install IntellIJ
- Clone this repository and then refresh maven
- Start the server

## API calls working

localhost:8080/products/{id}
localhost:8080/employees/{id}

## Requirement

To optimize time for each API call irrespective of it's id. ( Note : Intentionally API calls are made to response after 7 secs and 5 secs at service layer)
