#  Pricing & Discount Engine

##  Lab Assignment: Outils Libres Pour le développement logiciel

---

##  Project Overview

A comprehensive pricing engine that calculates final order prices with discounts, taxes, and customer-specific pricing rules.

### Features
- Calculate subtotal based on item prices and quantities
- Apply discount codes (SAVE10, SAVE20)
- Special VIP customer discounts (additional 5%)
- Tax calculation (15%)
- Clean, refactored code structure

---

## Architecture (After Refactoring)
PricingLab/
├── src/
│ ├── PricingEngine.java # Main entry point
│ └── com/example/
│ ├── CustomerType.java # Enum (REGULAR, VIP)
│ ├── DiscountCode.java # Enum (SAVE10, SAVE20, NONE)
│ ├── Item.java # Product representation
│ ├── Order.java # Order structure
│ └── PricingCalculator.java # Business logic
├── test/
│ └── java/com/example/
│ └── PricingEngineTest.java # JUnit tests
├── integration_test.py # Python integration tests
└── README.md # This file

---

## How to Run

### Method 1: IntelliJ IDEA (Recommended)
1. Open src/PricingEngine.java
2. Click the green button next to main method
3. Enter test data:
4. Enter number of items: 2
Enter price for item 1: 10
Enter quantity: 2
Enter price for item 2: 20
Enter quantity: 1
Customer type (REGULAR/VIP): REGULAR
Discount code (SAVE10/SAVE20/NONE): SAVE10

### Method 2: Command Line (Gradle)
```bash
./gradlew run

Running Tests
JUnit Tests (Java)
./gradlew test
Or right-click PricingEngineTest.java → Run

Integration Tests (Python)
python integration_test.py

Expected Output
Subtotal: 40.0
Discount: 4.0
Tax: 5.4
Final Price: 41.4

Technologies Used:
Technology   Purpose
Java 17    Main programming language
IntelliJ IDEA   IDE
Git & GitHub   Version control
JUnit 5   Unit testing
Python 3   Integration testing

What Was Accomplished:

Initial Bad Design → Started with monolithic code

 Refactoring → Separated concerns with Enums and multiple classes

 Testing → Comprehensive JUnit tests

 Integration Testing → Python-based end-to-end testing

 Version Control → Complete Git history on GitHub


Learning Outcomes:

Understanding poor code design and its problems

Applying refactoring techniques (Separation of Concerns)

Using Enums instead of Strings for type safety

Writing unit tests with JUnit

Integration testing with Python

Professional Git/GitHub workflow

Repository Structure
pricing-engine-lab/
├── .idea/              # IntelliJ IDEA configuration
├── src/                # Java source files
│   ├── PricingEngine.java
│   └── com/example/    # All supporting classes
├── test/               # JUnit test files
├── .gitignore          # Git ignore rules
├── integration_test.py # Python integration tests
├── PricingLab.iml      # IntelliJ module file
└── README.md           # Project documentation

Author
GHRIBI ACHOIK

