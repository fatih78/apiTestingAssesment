### Technologies
- Programming language: Java
- API Testing with the restAssured Library
- Test Framework: Cucumber
- Page Object Modelling
- Build: Gradle
- Reporting: Serenity

### Java SDK
Compatible with Java 11, please change it to Jdk11 in the project structure setting  
https://www.oracle.com/java/technologies/javase-jdk11-downloads.html  

### Structure
- Main code: src/main which includes:
	- utils/Enums
- Tests: src/test which includes:
	- Step definitions and Test Runner
	- Feature files: src/test/resources/features

### Plugins needed
- Cucumber for Java
- Gherkin
- Lombok

### Running the tests
Run from a single feature file
Run from the testRunner file
or commandLine >> `gradle clean test` or `gradle clean build`

### Report output
target/site/serenity/index.html
