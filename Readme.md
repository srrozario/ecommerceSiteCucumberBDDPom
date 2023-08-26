# Cucumber behavior driven development (BDD) test automation framework using Selenium with Java and Gradle
## Introduction
This project aims to automate the end-to-end product purchase journey on the Magento website using Selenium WebDriver for browser automation and Cucumber for Behavior-Driven Development (BDD). The Page Object Model (POM) framework is employed for efficient test maintenance and reusability.
## Prerequisite software
- [Download & Install JDK](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
- [Download & Install IntelliJ IDEA Community Version](https://www.jetbrains.com/idea/download/#section=windows)

## Installation
1. Clone this repository to your local machine using the following command:

| bash                                                                       |
|----------------------------------------------------------------------------|
| **git clone** https://github.com/your-username/magento-automated-tests.git |

2. Import the project into your IDE (e.g., IntelliJ) as a Gradle project.

## Usage
To run the automated test suite, navigate to the project root directory and execute the following Gradle command:

|bash|
|--------------|
|gradle clean test|
The tests will be executed, and you can view the test results in the console or test report.

## Create a new or open an existing Java(gradle) project
- [Please visit this link to know about how to open a new Java(gradle) project using IntelliJ IDEA](https://www.jetbrains.com/help/idea/getting-started-with-gradle.html#create_project)

## Setting the JAVA_HOME Variable in Windows
- [Setting the JAVA_HOME Variable in Windows](https://confluence.atlassian.com/doc/setting-the-java_home-variable-in-windows-8895.html)

## Dependencies
#### Gradle Dependencies - This framework has been designed with following maven dependencies as defined further in the build.gradle
| Dependency            | Version |  Purpose   |
|-----------------------|---------|-----|
| Selenium WebDriver    | 6.14.3   | It automates the testing of web application.    |
| TestNG                | 6.14.3     |  To run the tests as a suite.   |
| Webdrivermanager      |   5.1.0      |  WebDriverManager is a library which allows to automate the management of the drivers (e.g. chromedriver, geckodriver, etc.) required by Selenium WebDriver.   |
| Cucumber JVM: Java	   | 6.10.0  | Enables support for Behaviour-Driven Development (BDD) by the execution of scenarios written in plain text and validates that the software does what those scenarios say    |
| Cucumber JVM: TestNG	 | 6.10.0  | Cucumber-TestNG is an integration between Cucumber and TestNG frameworks that allows users to leverage the benefits of both frameworks simultaneously.   |
## Test Scenario
The automated test suite covers the full product purchase journey on the Magento website, including the following steps:
1. Navigate to the Magento website.
2. Search for a specific product.
3. Add the product to the shopping cart.
4. Proceed to checkout.
5. Enter shipping and billing information.
6. Complete the purchase.
## Test Results
Test report automatically generated on **reports** folder after finished the test execution.
See test report from **build/reports/featureReport.html**