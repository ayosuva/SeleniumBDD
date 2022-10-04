# SeleniumBDD

### Import the project in eclipse as Maven project
### To run using IDE, Right-click on Runner class and select Run as JUnit
### To run using command line , use command ```mvn clean verify```
### Html report can be found under target/index.html
 
# Further Improvements:
### Parallel execution for distributed execution
### Multiple browsers handling for cross-browser testing
### Extent report for better reporting
### JIRA API integration to update the results in JIRA after the test execution

# Sample Cucumber Report
<img src="https://github.com/ayosuva/SeleniumBDD/blob/main/cucumber.png">

# Sample Extent Report
<img src="https://github.com/ayosuva/SeleniumBDD/blob/main/1.png">
<img src="https://github.com/ayosuva/SeleniumBDD/blob/main/2.png">
<img src="https://github.com/ayosuva/SeleniumBDD/blob/main/3.png">

# Jenkins Setup:

**Source Code Management:** Git : https://github.com/ayosuva/SeleniumBDD

**Branches to build:** */main

**Build Triggers:** Poll SCM : * * * * *

**Build :** Execute Windows batch command : mvn -Dtest=Runner test

**E-mail Notification :** 
Manage Jenkins -> Configure System
smtp.gmail.com
Use SMTP Authentication
Use SSL
Port:465
