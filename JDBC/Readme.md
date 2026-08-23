# JDBC — Java Database Connectivity

JDBC (Java Database Connectivity) is a standard Java API used to connect Java applications with relational databases such as MySQL and PostgreSQL.

---

## 1. JDBC Architecture

JDBC Architecture defines how Java applications communicate with databases through the JDBC API and JDBC drivers.

### JDBC Architecture consists of two main layers

**1. JDBC API (Application Layer)**

- Provides Java applications with interfaces to interact with databases.
- Main packages: `java.sql`, `javax.sql`
- Important interfaces:
  - `Connection`
  - `Statement`
  - `PreparedStatement`
  - `ResultSet`

**2. JDBC Driver API (Driver Layer)**

- Acts as a bridge between the JDBC API and the database.
- Converts Java JDBC calls into database-specific operations.

📚 **Learn:**
- [JDBC Introduction](https://www.geeksforgeeks.org/java/introduction-to-jdbc/)

---

## 2. Real-World Example of JDBC

Think of JDBC as a communication system between a Java application and a database.

```text
Java Application
       |
       | SQL Query
       v
 JDBC API
       |
       v
 JDBC Driver
       |
       v
   Database
       |
       | Result
       v
 ResultSet
       |
       v
Java Application

3. Types of JDBC Drivers

JDBC drivers act as mediators between Java applications and databases.

Type	Name	Description
Type 1	JDBC-ODBC Bridge	Uses ODBC; deprecated
Type 2	Native-API Driver	Uses database-specific native API
Type 3	Network Protocol Driver	Uses middleware server
Type 4	Thin Driver	Directly communicates with database

Most commonly used: Type 4 JDBC Driver.

📚 Learn:

JDBC Drivers
Type 1 Driver
Type 2 Driver
Type 3 Driver
Type 4 Driver
4. JDBC Classes and Interfaces
Important Interfaces
Interface	Purpose
Driver	Represents a database driver
Connection	Represents a database connection
Statement	Executes simple SQL queries
PreparedStatement	Executes parameterized/precompiled SQL queries
CallableStatement	Calls stored procedures
ResultSet	Stores results returned by SELECT
ResultSetMetaData	Provides information about ResultSet columns
DatabaseMetaData	Provides information about the database
RowSet	Provides a scrollable/updatable representation of data
Important Classes
Class	Purpose
DriverManager	Manages JDBC drivers and establishes connections
Blob	Represents binary large objects
Clob	Represents character large objects
Types	Defines constants for SQL data types

📚 Learn:

Driver Interface
Connection Interface
Statement
PreparedStatement
CallableStatement
ResultSet
ResultSetMetaData
DatabaseMetaData
RowSet
5. Establishing JDBC Connection

Standard steps for connecting Java with a database:

Import JDBC packages.
Load/register the JDBC driver.
Establish connection using DriverManager.
Create Statement or PreparedStatement.
Execute SQL query.
Process the ResultSet.
Close database resources.

Import JDBC
     ↓
Load Driver
     ↓
Create Connection
     ↓
Create Statement
     ↓
Execute SQL
     ↓
Process ResultSet
     ↓
Close Resources

📚 Learn:

Establishing JDBC Connection
6. JDBC Example
SQL Setup

CREATE DATABASE school;

USE school;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT
);

INSERT INTO students VALUES
(1, 'Amit', 21),
(2, 'Riya', 22);

Java Code
import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "your_password";

        try {

            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish Connection
            Connection con =
                    DriverManager.getConnection(url, user, password);

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. Execute Query
            ResultSet rs =
                    stmt.executeQuery("SELECT * FROM students");

            // 5. Process Results
            while (rs.next()) {

                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("age")
                );
            }

            // 6. Close Resources
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

Note: Explicit Class.forName() is generally unnecessary with modern JDBC drivers because JDBC 4+ supports automatic driver loading.

7. CRUD Operations with JDBC

CRUD represents the four fundamental database operations.

Operation	SQL	Purpose
Create	INSERT	Add new records
Read	SELECT	Retrieve records
Update	UPDATE	Modify existing records
Delete	DELETE	Remove records

📚 Learn:

CRUD Operations with JDBC

8. JDBC Exception Handling

JDBC operations can fail because of:

Invalid SQL syntax
Database connection problems
Incorrect data types
Missing JDBC drivers
Authentication errors
Constraint violations

Use SQLException to handle database-related exceptions.
catch (SQLException e) {

    System.out.println("Error: " + e.getMessage());
    System.out.println("SQL State: " + e.getSQLState());
    System.out.println("Error Code: " + e.getErrorCode());
}

📚 Learn:

JDBC Exception Handling


9. Transactions in JDBC

A transaction is a sequence of SQL operations treated as a single unit of work.

Important Methods
Method	Purpose
setAutoCommit(false)	Disables automatic commit
commit()	Permanently saves changes
rollback()	Reverts changes
Example
con.setAutoCommit(false);

try {

    PreparedStatement ps1 =
        con.prepareStatement(
            "UPDATE accounts SET balance = balance - 100 WHERE id = 1"
        );

    PreparedStatement ps2 =
        con.prepareStatement(
            "UPDATE accounts SET balance = balance + 100 WHERE id = 2"
        );

    ps1.executeUpdate();
    ps2.executeUpdate();

    con.commit();

} catch (SQLException e) {

    con.rollback();

}

📚 Learn:

Transactions in JDBC
JDBC Learning Checklist
 Understand JDBC architecture
 Understand JDBC API and Driver API
 Learn JDBC Driver types
 Understand Type-4 Driver
 Learn DriverManager
 Learn Connection
 Learn Statement
 Learn PreparedStatement
 Learn CallableStatement
 Learn ResultSet
 Learn ResultSetMetaData
 Learn DatabaseMetaData
 Learn JDBC connection steps
 Connect Java with MySQL
 Execute SELECT
 Execute INSERT
 Execute UPDATE
 Execute DELETE
 Implement JDBC CRUD
 Handle SQLException
 Understand transactions
 Practice commit()
 Practice rollback()
 Close JDBC resources properly
JDBC Practice Project
Student Management System using JDBC

Technologies:

Java
JDBC
MySQL
Features
 Add Student
 View Student
 View All Students
 Update Student
 Delete Student
 Search Student
 Handle SQL exceptions
 Use PreparedStatement
 Implement transactions
 Store SQL scripts in GitHub
Suggested Project Structure


JDBC-Student-Management-System/
│
├── src/
│   ├── model/
│   │   └── Student.java
│   │
│   ├── dao/
│   │   └── StudentDAO.java
│   │
│   ├── util/
│   │   └── DBConnection.java
│   │
│   └── Main.java
│
├── sql/
│   └── student_database.sql
│
└── README.md


JDBC Interview Focus

Before moving to Spring JDBC / Spring Data JPA, make sure you can explain:

What is JDBC?
How does JDBC work?
Explain JDBC architecture.
What are JDBC driver types?
Why is Type-4 driver commonly used?
Difference between Statement and PreparedStatement.
Difference between executeQuery() and executeUpdate().
What is ResultSet?
What is Connection?
What is DriverManager?
What is SQLException?
What is a transaction?
What is auto-commit?
Difference between commit() and rollback().
How do you prevent SQL Injection?
Why should JDBC resources be closed?
How would you implement CRUD using JDBC?
JDBC → Spring JDBC → Spring Data JPA

JDBC
 ↓
Manual database connection
 ↓
SQL + Statement/PreparedStatement
 ↓
Manual resource handling
 ↓
Spring JDBC
 ↓
JdbcTemplate
 ↓
Less boilerplate
 ↓
Spring Data JPA
 ↓
Repository abstraction
 ↓
Hibernate/JPA
 ↓
Production-level database development

Goal: Understand JDBC fundamentals first, then use Spring JDBC and Spring Data JPA to build maintainable Spring Boot applications.



### Important change I made

I **didn't remove your syllabus**, but I compressed it into **one JDBC module**:

**JDBC**
→ Architecture  
→ Real-world flow  
→ Drivers  
→ Classes & Interfaces  
→ Connection  
→ Example  
→ CRUD  
→ Exception Handling  
→ Transactions  
→ Checklist  
→ Project  
→ Interview Questions  

So in your main Java Backend README, you can simply have:

```markdown
## JDBC

- [ ] JDBC Architecture
- [ ] JDBC Drivers
- [ ] JDBC Classes & Interfaces
- [ ] JDBC Connection
- [ ] JDBC CRUD
- [ ] Exception Handling
- [ ] Transactions
- [ ] JDBC Student Management Project
- [ ] JDBC Interview Questions




