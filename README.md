# TEST-PIMS

## Overview
TEST-PIMS is a project designed to perform automated regression tests on the PIMS (Project Information Management System) using Playwright and Allure for reporting. The tests are written in Java and utilize JUnit 5 for test execution.

## Prerequisites
- Java 21
- Maven
- Node.js (for Playwright)
- Allure Commandline

## Setup
1. Clone the repository:
   ```sh
   git clone <repository-url>
   cd TEST-PIMS
   
2. Install dependencies:
   ```sh
   mvn install

3. Install Playwright browsers:
    ```sh
    npx playwright install

### Running Tests
To run the tests and generate an Allure report, use the following command:
```bash
mvn clean test allure:report
```
### Generating Allure Report
To generate a single file HTML report:
```bash
allure generate target/allure-results --single-file --clean
```

## CI/CD Integration
- This project uses GitHub Actions for CI/CD. The workflow is defined in regression-tests.yml. It runs the tests, generates the Allure report, and sends an email notification with the report.

## Contributing
We welcome contributions to enhance this framework. Please follow these steps:
1. Create a feature branch.
2. Commit your changes.
3. Push to the branch.
4. Create a Pull Request.
