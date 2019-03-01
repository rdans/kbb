# kbb_WebTesting
This is an end to end testing project example that was build in Java from scratch using multiple framework such as :
 - Selenium Web Driver
 - Cucumber
 - TestNG
 - JUnit
 - Maven
 - ExtentReport
## Run this file
1. Make sure you have maven and selenium webdriver installed in your computer.
2. cd to the directory of the project (that contains pom.xml)
3. Run command:
    ```sh
    $ mvn test
    ```

## Testing Scenario
This project is an example of end to end testing a website called Kelley Blue Book or KBB. 
It tests the following feature:
1. Trade in value of a used car.
2. Invalid Login scenario when users enter a wrong authentication.
3. Invalid Login scenario when users leave the password and email field empty.

## File Description
Cucumber feature : src/test/java/features
Step Devinition : src/test/java/stepDefinition
Extent Report : test-output/ExtentReportsTestNG.html




