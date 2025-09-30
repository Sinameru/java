# Maven Workflow Example

---

## Introduction

This document illustrates a **default Maven workflow** for Java projects, guiding developers on how to structure, build, test, and manage dependencies.

---

## 1. Create or Import a Maven Project

### Create a new project

```bash
mvn archetype:generate -DgroupId=com.example -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

### Import an existing Maven project

*Open the project in your IDE and ensure it recognizes the `pom.xml` file.*

---

## 2. Understand Project Structure

* `src/main/java` – application source code
* `src/test/java` – test code
* `pom.xml` – project configuration and dependencies

---

## 3. Add Dependencies

* Edit `pom.xml` to include necessary libraries.

```xml
<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

---

## 4. Build the Project

### Compile Source Code

```bash
mvn compile
```

### Run Tests

```bash
mvn test
```

### Package the Application

```bash
mvn package
```

---

## 5. Install to Local Repository

```bash
mvn install
```

*Installs the package into your local Maven repository for reuse.*

---

## 6. Deploy to Remote Repository

```bash
mvn deploy
```

*Optional: deploys the package to a remote repository for sharing.*

---

## 7. Clean Project

```bash
mvn clean
```

*Removes previously generated files like the `target` directory.*

---

## 8. Update Dependencies

```bash
mvn dependency:resolve
```

*Ensures all dependencies specified in `pom.xml` are downloaded and available.*

---

## Summary Workflow Diagram

```text
create/import project → edit pom.xml → compile → test → package → install → deploy → clean → update dependencies
```

---

## Notes

* Keep `pom.xml` well organized.
* Run tests frequently.
* Use Maven plugins for additional tasks like code coverage, reporting, and static analysis.
