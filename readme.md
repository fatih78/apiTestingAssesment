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
`gradle clean regressionTests`

### Report output
target/site/serenity/index.html
target/cucumber-reports/cucumber.html  
