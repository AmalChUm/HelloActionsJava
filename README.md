# HelloActionsJava

A beginner-friendly first GitHub Actions example using Java. The workflow checks out this project, configures Java 17 on a GitHub-hosted runner, compiles `Hello.java`, and runs it.

## What this example demonstrates

GitHub Actions can automate steps that would otherwise be run locally. In this example, a workflow runs a small Java program whenever code is pushed to `main`, or whenever a student starts the workflow manually.

## Repository structure

```text
.github/
└── workflows/
    └── hello-java.yml  # Defines the GitHub Actions workflow
Hello.java              # The Java source program
.gitignore              # Files Git should ignore
README.md               # This guide
```

## Run the workflow on GitHub

1. Open the **Actions** tab in this repository.
2. Select **Hello World with Java**.
3. Select **Run workflow**, or push a change to `main`.
4. Open the created workflow run.
5. Expand **Run the Java program**.
6. Confirm that the log contains:

   ```text
   Hello GitHub Actions Student!
   The Java program is running inside GitHub Actions.
   ```

## Key concepts

- `hello-java.yml` defines the workflow and the steps GitHub should perform.
- `actions/checkout@v4` makes the repository files available to the workflow.
- `actions/setup-java@v4` installs or configures Java 17 on the runner, using the Temurin distribution.
- `javac Hello.java` compiles the Java source code into a class file.
- `java Hello` runs the compiled `Hello` class.
- `WHO_TO_GREET` is an environment variable passed to the Java program. The program uses it for the greeting and falls back to `GitHub Actions Student` when it is not set.
- `workflow_dispatch` allows a user to start the workflow manually from GitHub.

## Run locally (optional)

If Java 17 or a compatible JDK is installed, run:

```bash
javac Hello.java
java Hello
```
