# E-Commerce Site Automation project:

This project is meant for testing the major functionalities of Best Buy web site. I have used Data-Driven testing for testing Sign In functionality with Data provider. Also, this project covers the main features like Adding item to cart and searching and adding item to cart.

## Motivation:
The reason behind creating this project is that automating this site is because of the Sign In and Sign Up functionality is quite challenging. Another challenge is that the Survey add popping in the middle of the test case execution.

## Coding Style:
- I have used Java language with POM(Page Object Model) design pattern with Selenium framework in this project.

## IDE/Language:
- IDE : Eclipse
- Language : Java

## Technology/Frameworks used:
- TestNG framework - Used for various purposes like Data provider and the prioritization of tests and suites.
- Extent reports library - Used for the detailed reporting the test cases status with various information like screenshots.
- Maven project - For the ease of handling the dependencies in one place.
- Selenium Java library - Selenium provides support for the automation of web browsers. It provides extensions to emulate user interaction with browsers, a distribution server for scaling browser allocation, and the infrastructure for implementations of the W3C WebDriver specification.
- Apache POI library- For the reading and writing the data in  Excel sheet.
- Maven Surefire plugin- For the building a Maven build in order to use it for Jenkins CI/CD implementation for invoking the build by local host or remotely.
- Jenkins tool - For triggering the build eventually executing the tasks locally or remotely.
- WebDriverManager library - Automated driver management and other helper features for Selenium WebDriver in Java.

## Test case Code Example:
- I have used constructor chaining here in order to access the methods of pages with single object creation.
- We are using try/catch to handle the exception that occurs in between the process of executing a test case.
- Finally, based on the validation if the test case is passed we report that test case as Pass/Fail in extent report.

## Test Scenarios covered:
- URL is broken or not
- Top links are redirecting properly
- Bottom links are redirecting properly 
- Login scenarios(Positive and Negative)
- SignUp scenarios(Positive and Negative)
- Shopping an item by Brand is done properly
- Shopping an item by Department is done properly
- Searching and add an item to cart is done properly
- Order is added to cart and moved till the payment screen properly.

## Scenarios having issues while testing:
- The Sign Up process sometimes ends up with this error ```Sorry, Something went wrong. Please try again later``` even if the details are correct during the Sign Up process.	
- The Sign In process face the same issue ```An account with this Email ID already exist``` while creating a new user.
- The order placement scenario also faced issue before moving to payment screen as ```Network error. Please retry with stable Internet connection```.


## People worked on this project
```Supriya```
