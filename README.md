# Task REST API

## Description

A personal and simple REST API written using Java, Spring Boot and Maven. The API manages different tasks that are stored in a MySQL database, and is capable of all the standard GET, DELETE, POST, PUT requests. The API also implements a barebone authentication and authorization process with Spring Security.

WARNING: the project is not meant to be used by those unfamiliar with the technologies mentioned throughout this README.

## Prerequisites
1. Your development environment should be able to support Java and Spring Boot. This project was developed using IntelliJ IDEA and Java 17, so it is preferred that you do the same.
2. Your environment should have MySQL installed. The version that this project interacts with is 8.0.5.


## Instructions
1. Open the project folder using your preferred IDE or editor. Wait until all the imports are complete.
2. Create your own MySQL schema that follows the Task.java model. In application.properties, configure username and password details that suits your environment. The project is written to be run in localhost at the moment.
3. Run the project using the TaskApplication.java class.
4. When you send a request, fill out the configured credentials prompted by the browser.
5. Continue using the API.