# OneKonnect Automation Task – Selenium with Java  


## 📌 Overview
This project automates the **Login → Create Order → Search & Verify Order** flow for the OneKonnect web application.  
It uses a **Page Object Model (POM)** structure with reusable helpers for clean, maintainable, and scalable test code.

---

## 🚀 Features
- **Java 21** based automation framework.
- **Selenium WebDriver** for UI interaction.
- **TestNG** for test orchestration.
- **Page Object Model (POM)** for maintainability.
- **ElementHelper** for safe element interactions with waits.
- **AssertionsHelper** for clean, reusable assertions.
- **DataProvider** for parameterized testing (JSON/CSV supported).
- **Extent Reports** for rich HTML reporting.
- **Reusable business flow methods** to keep test cases short and readable.

---

## 📂 Project Structure
src
├── main
│ ├── java
│ │ ├── pages # Page classes for each screen
│ │ ├── utils # Helpers & utilities (ElementHelper, AssertionsHelper, DriverManager)
│ │ └── resources # Config files (URL, Browser, Test Data)
│ └── resources
│ └── testdata # Test data in JSON/CSV format
└── test
└── java
└── tests # Test classes using TestNG

pgsql
Copy
Edit

---

## 🧪 Test Flow
1. **Login** to the application using valid credentials.
2. **Create a new order** by filling out the required form fields.
3. **Submit the order** and confirm the action.
4. **Navigate to Order History**.
5. **Search for the created order**.
6. **Verify** that the order is listed with correct details.

---

## ⚙️ Technology Stack
| Tool/Library | Purpose |
|--------------|---------|
| Java 21 | Programming language |
| Selenium WebDriver | UI automation |
| TestNG | Test framework |
| WebDriverManager | Automatic driver setup |
| Extent Reports | HTML reporting |
| JSON / CSV | Test data storage |
| Maven | Dependency management |

---

## ⚙️ How to Run the Tests

1. **Clone the Repository**
   ```bash
   git clone https://github.com/Mohammed9477/OneKonnectAutomationTask.git
   ```

2. **Open in Your IDE**
   - Recommended: IntelliJ IDEA or Eclipse.
   - Ensure **Java 21** is installed and set as your project SDK.

3. **Install Dependencies**
   - This project uses **Maven** for dependency management.
   ```bash
   mvn clean install
   ```

4. **Run the Tests**
   - **Option 1: Using Maven Command**
     ```bash
     mvn test
     ```
   - **Option 2: Using TestNG XML**
     - In your IDE, right-click on `testng.xml` inside the `xmlRunners` folder → **Run**.

5. **View Test Reports**
   - After test execution, open:
     ```
     test-output/ExtentReport.html
     ```
     in your browser to see the detailed results.

👨‍💻 Author
Mohammed Samy
Automation QA Engineer
