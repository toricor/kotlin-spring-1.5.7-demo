# kotlin-spring-1.5.7-demo
Spring Boot Kotlin and MyBatis(O/R Mapper) Tutorial

## Run the application
i) create database, create table and insert data (see the below section)  
ii)`./gradlew bootRun`

## API Endpoint
port: 8080 (defined in resources/application.properties)
### Hello world
- GET /hello/string
- GET /hello/service
- GET /hello/data
### Get Customer(s)
- GET /api/customers
- GET /api/customers/:id
- GET /api/customers/search?firstName=hogehoge
- POST /api/customers 
- POST /api/customers/:id
- DELETE /api/customers/:id

#### RDBMS
MySQL 5.7
#### DDL
```
CREATE DATABASE db_example
```
```
CREATE TABLE customers IF NOT EXISTS customers(
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    address VARCHAR(100)
);
```
and insert some data

#### POST EXAMPLE
```
curl -H "Content-type: application/json" -X POST -d '{"id":8, "firstName": "John", "lastName": "Great", "address": "hogehoge@gmail.com"}' http://localhost:8080/api/customers/8
```

## References
### Hello World
https://medium.com/@crsandeep/creating-and-testing-a-kotlin-restful-web-services-using-spring-boot-1a11aeda279e
### Customers (MyBatis tutorial)
http://blog.enjoyxstudy.com/entry/2016/12/26/000000
