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
