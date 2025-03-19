# MRI Detection Web Project - Automation Testing Report
## Overview
This repository contains the automation testing report for the MRI Detection Web Project. The testing was conducted to ensure the core functionalities of the website work correctly across multiple scenarios. The primary goal of this report is to provide a clear understanding of the testing process, tools used, and results for anyone reviewing this repository.

## Project Details
Project Title: MRI Detection Web Project

URL: https://mridetection.netlify.app/

Date of Testing: 15th February 2025

## Test Environment
The automation testing was performed using the following tools and technologies:

Testing Framework: Selenium WebDriver with Java.

Browser: Chrome (latest stable version).

Operating System: Windows 10.

IDE: Eclipse.

## Scope of Testing
The testing focused on the following aspects of the MRI Detection website:

## UI Elements:

Validation of buttons, forms, and navigation menus.

Ensuring proper rendering of images and text.

## Workflows:

Testing user registration and login functionality.

Validating the MRI image upload and processing workflow.

## Data Integrity:

Ensuring accurate data submission and retrieval.

Verifying error handling for invalid inputs.

## Test results:
All core functionalities were validated successfully, and the website performed as expected across all test scenarios.

## Tools and Technologies Used
1. Selenium WebDriver: For browser automation.

2. Java: Programming language for writing test scripts.

3. TestNG: For test case management and reporting.

4. Maven: For dependency management.

5. ChromeDriver: For interacting with the Chrome browser.

Repository Structure
mri-detection-web-project/
├── src/                            
│   ├── main/                      
│   └── test/                      
│       ├── RegistrationTest.java   
│       ├── LoginTest.java        
│       ├── ImageUploadTest.java    
│       └── ErrorHandlingTest.java  
├── reports/                       
│   └── test-report.html           
├── README.md                       
├── pom.xml                        
└── resources/                    
    └── chromedriver.exe           

## Conclusion
The automation testing for the MRI Detection Web Project was successfully completed, validating all core functionalities of the website. The test results confirm that the website performs as expected, providing a seamless user experience. This report serves as a reference for future testing and development efforts.

## Future Work
1. Expand test coverage to include additional edge cases.

2. Integrate with CI/CD pipelines for automated testing during deployment.

3. Add cross-browser testing (e.g., Firefox, Edge).
