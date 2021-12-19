# Employee-Service

Employee and Product service record  using Spring Boot and internal mock DB along with REST APIs

## Techs used

- IntellIJ
- Spring Boot
- Maven
- Google Guava
- Postman

## Installation

- Install Java (minimum requirement is Java 8)
- Setup environment variables for Java configuration
- Install IntellIJ
- Clone this repository and then refresh maven
- Start the server

## API calls

- localhost:8080/products/{id}
- localhost:8080/employees/{id}

## Requirement

To optimize time for each API call irrespective of it's id. ( Note : Intentionally API calls are made to response after 7 secs and 5 secs at service layer for both Employee and Product respectively )

## Demo Result

<div style='width: 130px; text-align: center;'>First time uncached result</div>
<br>
<img src = "/src/main/resources/Achieved Result/First time.png">
<br>
<br>

<div style='width: 130px; text-align: center;'>Second time cached result</div>
<br>
<img src = "/src/main/resources/Achieved Result/Second time.png">
