# Maven Basics

---

## What is Maven?

* Maven is a **build automation and project management tool** primarily for Java projects.
* It simplifies **compiling, testing, packaging, and dependency management**.

## Key Concepts

### Project Object Model (POM)

* The **POM file (`pom.xml`)** is the core of a Maven project.
* It defines **project dependencies, plugins, and configuration**.

### Dependency Management

* Maven automatically **downloads required libraries** from remote repositories.
* Dependencies are specified in the `pom.xml` with **group ID, artifact ID, and version**.

### Lifecycle Phases

* Maven has a **defined build lifecycle** with phases such as:

    * `validate` – checks project structure
    * `compile` – compiles source code
    * `test` – runs unit tests
    * `package` – creates JAR/WAR
    * `install` – installs package to local repository
    * `deploy` – deploys to remote repository

### Plugins

* Plugins extend Maven’s functionality for tasks like **compilation, testing, reporting, and deployment**.
* Examples: `maven-compiler-plugin`, `maven-surefire-plugin`.

### Repositories

* **Local repository** – stored on your machine, caches downloaded dependencies.
* **Remote repository** – online repositories (like Maven Central) to fetch dependencies.

## Summary

Maven helps developers **automate builds, manage dependencies, and standardize project structure**, making Java project development more efficient and consistent.
