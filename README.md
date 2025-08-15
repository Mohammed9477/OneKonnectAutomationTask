# OneKonnect Automation Task – Selenium with Java  

## 📌 Overview  
This project automates the following scenario on the **OneKonnect Partner Portal**:  

1. **Login** with valid credentials.  
2. **Create a new order** by filling out only the mandatory fields.  
3. **Search and verify** that the created order is displayed successfully.  

The automation is built using **Java (v21)**, **Selenium WebDriver**, **TestNG**, and the **Page Object Model (POM)** design pattern.  
It also implements **data-driven testing** via TestNG `@DataProvider`, a custom **ElementHelper** for web interactions, and **AssertionsHelper** for validations.  

---

## 🛠 Tech Stack  
- **Java:** 21  
- **Selenium WebDriver:** Latest stable version  
- **TestNG:** For test execution & reporting  
- **Maven:** For build and dependency management  
- **Page Object Model (POM):** For better maintainability  
- **Custom Helpers:**  
  - `ElementHelper` – Handles element interactions and waits  
  - `AssertionsHelper` – Handles assertions with descriptive messages  
- **Data Provider:** Reads test data (username, password, order data) from a structured source  

---

## 📂 Project Structure  
src
 └── main
     └── java
         ├── pages           # Page Object classes (LoginPage, DashboardPage, OrderPage, etc.)
         └── utilities           # (DataProvider,ElementHelper,AssertionsHelper,DriverManager
 └── test
     └── java
         └── tests           # Test classes
