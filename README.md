# java-spring-boot-api
## Overview
This little project creates an API using Java 11 and the Spring Boot framework that persists 'student' data in a local Postgres database. 
Spring Data JPA is used as a helpful abstraction for easy querying methods.

## Data
Students have an 
- ID
- name 
- email address 
- date of birth  
- age 

The ID is automatically generated and a running number. 
The age is calculated instead of being hard-coded.

## Architecture
The main idea is to have three layers:
1. API layer with the request methods GET, PUT, POST and DELETE
2. Service layer for business logic
3. Data Access layer to connect to a database

## Usage
An executable .jar file is provided, however, it is dependent on a running (and correctly set up) Postgres DB.

## Helpful Tools
[Spring Initializr](https://start.spring.io/) was used to bootstrap the Maven Spring Boot application.
