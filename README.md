# WinAppDriver Desktop Java POM Framework

This repository contains a Java-based Page Object Model (POM) framework for automating desktop applications using WinAppDriver. The framework provides a structured approach for developing and maintaining test automation scripts for desktop applications, making it easier to create robust and maintainable automation tests.

## Project Structure

The project structure follows the standard Maven project structure, which promotes modularity and organization. Here is an overview of the key directories and files:

- `src/main/java`: Contains the main source code for the framework.
  - `com.example.framework`: Root package for the framework.
    - `config`: Configuration files and utilities.
    - `pages`: Page object classes representing different application pages/screens.
    - `tests`: Test classes containing test scenarios.
    - `utils`: Utility classes and helper methods.
- `src/test/java`: Contains the test code for the framework.
  - `com.example.framework.tests`: Test classes with test scenarios.
- `src/test/resources`: Contains resources such as test data files, properties files, etc.
- `pom.xml`: Maven project configuration file.

## Prerequisites

Before using this framework, make sure you have the following prerequisites installed:

1. Java Development Kit (JDK) version 8 or above.
2. Apache Maven.
3. WinAppDriver.
4. Desktop application under test.

## Getting Started

To start using this framework, follow these steps:

1. Clone the repository to your local machine.
   ```
   git clone https://github.com/rudrasurti/WinAppDriver-Desktop-Java-POM-Framework.git
   ```

2. Import the project into your preferred IDE (e.g., IntelliJ, Eclipse, etc.).
3. Install the required dependencies by running Maven commands:
   ```
   cd WinAppDriver-Desktop-Java-POM-Framework
   mvn clean install
   ```

4. Update the configuration files (`config.properties`) with the appropriate settings for your test environment.
5. Implement your page object classes under the `pages` package.
6. Write your test scenarios using the POM framework in the `tests` package.
7. Run the tests using Maven commands:
   ```
   mvn test
   ```

## Contributing

Contributions to this framework are welcome. If you find any issues or have suggestions for improvements, please open an issue or submit a pull request on the GitHub repository.

## License

This project is licensed under the [MIT License](https://github.com/rudrasurti/WinAppDriver-Desktop-Java-POM-Framework/blob/main/LICENSE).

## Acknowledgments

This framework was inspired by the concepts of the Page Object Model (POM) and aims to provide an efficient and scalable solution for automating desktop applications using WinAppDriver.

## Contact

If you have any questions or need further assistance, feel free to contact the project owner at rudrasurti98@gmail(mailto:rudrasurti98@gmail.com).

Thank you for your interest in the WinAppDriver Desktop Java POM Framework
