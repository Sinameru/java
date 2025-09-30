# Maven Basic Commands

---

*Compiles the source code of the project.*

```bash
mvn compile
```

*Runs the unit tests for the project.*

```bash
mvn test
```

*Packages the compiled code into a JAR or WAR file.*

```bash
mvn package
```

*Removes previously generated files (like target directory).*

```bash
mvn clean
```

*Installs the packaged JAR/WAR into the local repository.*

```bash
mvn install
```

*Deploys the package to a remote repository.*

```bash
mvn deploy
```

*Shows the dependency tree of the project.*

```bash
mvn dependency:tree
```

*Validates the project’s POM file and configuration.*

```bash
mvn validate
```

*Runs the default build lifecycle up to a specified phase (like compile, test, package, install).*

```bash
mvn {phase}
```
