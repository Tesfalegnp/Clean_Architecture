# Clean Architecture Java Spring Boot Project

This repository contains a simple **Clean Architecture** backend system implemented in **Java** using **Spring Boot**. The project demonstrates the principles of Clean Architecture with the focus on managing a **User** entity.

## Table of Contents
- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Setting Up the Project](#setting-up-the-project)
- [Running the Application](#running-the-application)
- [Project Dependencies](#project-dependencies)
- [Testing](#testing)
- [License](#license)

## Introduction

This project demonstrates the use of **Clean Architecture** to structure a backend system in Java. The goal is to maintain a clear separation of concerns between the different layers of the application:

1. **Entities** (Business models like `User`).
2. **Use Cases** (Business logic like creating a user).
3. **Interfaces/Controllers** (HTTP Layer).
4. **Repositories** (Data persistence).

The application is built using **Spring Boot** and follows best practices for **dependency injection**, **separation of concerns**, and **testability**.

## Prerequisites

Before you begin, ensure that you have the following installed on your local machine:

- **Java JDK** 11 or higher (recommended)
- **Maven** (for building and managing dependencies)
- **VS Code** (or your preferred IDE)
- **Spring Boot** dependencies are automatically managed by Maven.

To check if Java and Maven are installed, run the following commands in your terminal:

```bash
java -version
mvn -version
```
## Project Structure
- The project's directory structure looks like this:
```
CleanArchitectureJava/
├── pom.xml                # Maven configuration and dependencies
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── cleanarchitecture/
│   │   │               ├── controllers/  # API Controllers
│   │   │               ├── entities/     # Domain Models (e.g., User)
│   │   │               ├── repositories/ # Data Repositories
│   │   │               ├── usecases/     # Business Logic (e.g., CreateUser)
│   │   │               └── config/       # Spring Boot Configuration
│   │   └── resources/    # Configuration files
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── cleanarchitecture/
│                       └── usecases/     # Tests for use cases
└── target/                # Generated files (build output)

```

## Setting Up the Project
Clone the repository:
```
bash
git clone https://github.com/your-username/CleanArchitectureJava.git
```
1. Navigate into the project folder:
```
bash
cd CleanArchitectureJava
```

2. Open the project in your IDE (VS Code or NetBeans).
3. 
   Install the necessary dependencies:
        -If you are using VS Code, the Maven extension should automatically handle dependencies.
        -If not, run the following Maven command to download and install dependencies:

               ```
               bash
               mvn clean install
               ```
## Running the Application
- Open the UserApplication.java file in VS Code.

- Click the Run button (a green play icon) in the top-right corner of the editor.

   -Alternatively, press Ctrl + F5 to run the application.

- The application will start on http://localhost:8080.



