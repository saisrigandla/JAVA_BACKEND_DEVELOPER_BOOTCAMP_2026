# 🗄️ SQL & Database — Java Backend Developer Roadmap

> **Goal:** Master SQL and database concepts required for an entry-level Java Backend Developer role.
>
> **Primary Database:** MySQL
>
> **Used With:** Java → JDBC → Spring Boot → JPA → Hibernate → REST APIs

---

# 🎯 Learning Objective

By completing this roadmap, I should be able to:

* [ ] Create and manage databases
* [ ] Create and modify tables
* [ ] Insert, update and delete data
* [ ] Write complex SELECT queries
* [ ] Use filtering and grouping
* [ ] Use aggregate functions
* [ ] Write JOIN queries confidently
* [ ] Write subqueries
* [ ] Use CTEs
* [ ] Use window functions
* [ ] Understand primary and foreign keys
* [ ] Understand database normalization
* [ ] Design relational databases
* [ ] Understand indexes
* [ ] Understand transactions
* [ ] Understand SQL injection
* [ ] Optimize basic SQL queries
* [ ] Connect MySQL with Java
* [ ] Use SQL with Spring Boot + JPA/Hibernate
* [ ] Solve SQL interview problems without tutorials

---

# 📊 Priority System

| Priority | Meaning                           |
| -------- | --------------------------------- |
| 🔴 P0    | Must Master for Placement         |
| 🟠 P1    | Important for Backend Development |
| 🟡 P2    | Interview / Advanced Knowledge    |
| 🟢 P3    | Learn Later                       |

---

# 1. 🧱 SQL Basics — 🔴 P0

## Topics

* [ ] Introduction to SQL
* [ ] SQL vs Database
* [ ] DBMS vs RDBMS
* [ ] SQL Data Types
* [ ] SQL Operators
* [ ] SQL Commands
* [ ] SQL Comments
* [ ] Wildcards
* [ ] Applications of SQL
* [ ] SQL Career Path

### Resources

* [Introduction](https://www.geeksforgeeks.org/sql/what-is-sql/)
* [Data Types](https://www.geeksforgeeks.org/sql/sql-data-types/)
* [Operators](https://www.geeksforgeeks.org/sql/sql-operators/)
* [SQL Commands](https://www.geeksforgeeks.org/sql/sql-ddl-dql-dml-dcl-tcl-commands/)
* [Comments](https://www.geeksforgeeks.org/sql/sql-comments/)
* [Wildcards](https://www.geeksforgeeks.org/sql/sql-wildcard-operators/)
* [Applications](https://www.geeksforgeeks.org/sql/applications-of-sql/)
* [Career Path](https://www.geeksforgeeks.org/sql/sql-career-path-roles-skills-salaries/)

### 🧠 Must Know

```text
DDL → CREATE, ALTER, DROP, TRUNCATE

DML → INSERT, UPDATE, DELETE

DQL → SELECT

DCL → GRANT, REVOKE

TCL → COMMIT, ROLLBACK, SAVEPOINT
```

### 🛠️ Practice

* [ ] Create a database
* [ ] Create 3 tables
* [ ] Insert 20+ records
* [ ] Update records
* [ ] Delete records
* [ ] Experiment with different data types

---

# 2. 🗃️ SQL Database Management — 🔴 P0

## Topics

* [ ] CREATE DATABASE
* [ ] SELECT DATABASE
* [ ] RENAME DATABASE awareness
* [ ] DROP DATABASE
* [ ] `USE database_name`

### Resources

* [CREATE DATABASE](https://www.geeksforgeeks.org/sql/sql-create-database/)
* [SELECT Database](https://www.geeksforgeeks.org/sql/sql-select-database/)
* [Rename Database](https://www.geeksforgeeks.org/sql/sql-query-to-rename-database/)
* [DROP DATABASE](https://www.geeksforgeeks.org/sql/sql-drop-database/)

### 🛠️ Practice Database

Create:

```text
company_db
```

Tables:

```text
employees
departments
projects
```

---

# 3. 📋 SQL Tables — 🔴 P0

## Topics

* [ ] CREATE TABLE
* [ ] DROP TABLE
* [ ] ALTER TABLE
* [ ] RENAME TABLE
* [ ] TRUNCATE TABLE
* [ ] COPY TABLE
* [ ] Temporary Tables
* [ ] AUTO_INCREMENT
* [ ] Sequences — awareness

### Resources

* [CREATE TABLE](https://www.geeksforgeeks.org/sql/sql-create-table/)
* [DROP TABLE](https://www.geeksforgeeks.org/sql/sql-drop-table-statement/)
* [RENAME](https://www.geeksforgeeks.org/sql/sql-alter-rename/)
* [TRUNCATE](https://www.geeksforgeeks.org/sql/sql-truncate/)
* [Copy Table](https://www.geeksforgeeks.org/sql/sql-cloning-or-copying-a-table/)
* [Temporary Table](https://www.geeksforgeeks.org/sql/what-is-temporary-table-in-sql/)
* [ALTER](https://www.geeksforgeeks.org/sql/sql-alter-add-drop-modify/)
* [AUTO_INCREMENT](https://www.geeksforgeeks.org/sql/sql-auto-increment/)
* [Sequences](https://www.geeksforgeeks.org/sql/sql-sequences/)

### 🧠 Important Difference

```text
DELETE
→ Removes selected rows
→ Can use WHERE

TRUNCATE
→ Removes all rows
→ Faster
→ No WHERE

DROP
→ Removes complete table structure
```

---

# 4. ✍️ SQL Queries — 🔴 P0

## CRUD

* [ ] SELECT
* [ ] INSERT
* [ ] INSERT Multiple Rows
* [ ] UPDATE
* [ ] DELETE
* [ ] Delete Duplicate Rows
* [ ] Dynamic SQL — awareness

### Resources

* [SELECT](https://www.geeksforgeeks.org/sql/sql-select-query/)
* [INSERT](https://www.geeksforgeeks.org/sql/sql-insert-statement/)
* [Multiple Row INSERT](https://www.geeksforgeeks.org/sql/sql-query-to-insert-multiple-rows/)
* [UPDATE](https://www.geeksforgeeks.org/sql/sql-update-statement/)
* [DELETE](https://www.geeksforgeeks.org/sql/sql-delete-statement/)
* [Delete Duplicates](https://www.geeksforgeeks.org/sql/sql-query-to-delete-duplicate-rows/)
* [Dynamic SQL](https://www.geeksforgeeks.org/sql/dynamic-sql/)

### 🛠️ Mandatory Practice

Write queries for:

* [ ] Find all employees
* [ ] Find employees with salary > 50,000
* [ ] Update employee salary
* [ ] Delete employee
* [ ] Insert 10 employees
* [ ] Find duplicate records
* [ ] Remove duplicate records

---

# 5. 🔎 SQL Clauses — 🔴 P0

## Topics

* [ ] WHERE
* [ ] GROUP BY
* [ ] HAVING
* [ ] ORDER BY
* [ ] LIMIT
* [ ] DISTINCT
* [ ] WITH
* [ ] Row Limiting
* [ ] Aliases

### Resources

* [WHERE](https://www.geeksforgeeks.org/sql/sql-where-clause/)
* [WITH](https://www.geeksforgeeks.org/sql/sql-with-clause/)
* [HAVING](https://www.geeksforgeeks.org/sql/sql-having-clause-with-examples/)
* [ORDER BY](https://www.geeksforgeeks.org/sql/sql-order-by/)
* [GROUP BY](https://www.geeksforgeeks.org/sql/sql-group-by/)
* [LIMIT](https://www.geeksforgeeks.org/sql/sql-limit-clause/)
* [DISTINCT](https://www.geeksforgeeks.org/sql/sql-distinct-clause/)
* [Row Limiting](https://www.geeksforgeeks.org/sql/sql-top-limit-fetch-first-clause/)
* [Aliases](https://www.geeksforgeeks.org/sql/sql-aliases/)

### ⭐ Query Execution Order

Understand this properly:

```text
FROM
 ↓
WHERE
 ↓
GROUP BY
 ↓
HAVING
 ↓
SELECT
 ↓
DISTINCT
 ↓
ORDER BY
 ↓
LIMIT
```

This is a **high-value interview concept**.

---

# 6. ⚙️ SQL Operators — 🔴 P0

## Topics

* [ ] AND
* [ ] OR
* [ ] NOT
* [ ] LIKE
* [ ] IN
* [ ] NOT IN
* [ ] NOT EQUAL
* [ ] IS NULL
* [ ] IS NOT NULL
* [ ] BETWEEN
* [ ] CASE
* [ ] EXISTS
* [ ] UNION
* [ ] UNION ALL
* [ ] INTERSECT — awareness
* [ ] EXCEPT — awareness
* [ ] ALL
* [ ] ANY

### Resources

* [Logical Operators](https://www.geeksforgeeks.org/sql/sql-logical-operators/)
* [LIKE](https://www.geeksforgeeks.org/sql/sql-like/)
* [IN](https://www.geeksforgeeks.org/sql/sql-in-operator/)
* [NOT](https://www.geeksforgeeks.org/sql/sql-not-operator/)
* [NOT Equal](https://www.geeksforgeeks.org/sql/sql-not-equal-operator/)
* [IS NULL](https://www.geeksforgeeks.org/sql/sql-is-null-operator/)
* [UNION](https://www.geeksforgeeks.org/sql/sql-union-operator/)
* [UNION ALL](https://www.geeksforgeeks.org/sql/sql-union-all/)
* [EXCEPT](https://www.geeksforgeeks.org/sql/sql-except-clause/)
* [BETWEEN](https://www.geeksforgeeks.org/sql/sql-between/)
* [ALL & ANY](https://www.geeksforgeeks.org/sql/sql-all-and-any/)
* [INTERSECT](https://www.geeksforgeeks.org/sql/sql-intersect-clause/)
* [EXISTS](https://www.geeksforgeeks.org/sql/sql-exists/)
* [CASE](https://www.geeksforgeeks.org/sql/sql-case-statement/)

### 🛠️ Practice

Write queries using:

* [ ] LIKE
* [ ] IN
* [ ] BETWEEN
* [ ] CASE
* [ ] EXISTS
* [ ] IS NULL
* [ ] UNION
* [ ] UNION ALL

---

# 7. 🔢 SQL Functions — 🔴 P0

## Aggregate Functions

* [ ] COUNT()
* [ ] SUM()
* [ ] AVG()
* [ ] MIN()
* [ ] MAX()

## String Functions

* [ ] UPPER()
* [ ] LOWER()
* [ ] LENGTH()
* [ ] CONCAT()
* [ ] SUBSTRING()
* [ ] TRIM()
* [ ] LTRIM()
* [ ] RTRIM()

## Numeric Functions

* [ ] ROUND()
* [ ] CEIL()
* [ ] FLOOR()
* [ ] ABS()

## Date Functions

* [ ] CURRENT_DATE
* [ ] CURRENT_TIME
* [ ] NOW()
* [ ] Date difference
* [ ] Date extraction

## Other

* [ ] Conversion Functions
* [ ] JSON Functions — awareness
* [ ] Regular Expressions — awareness

### Resources

* [Date Functions](https://www.geeksforgeeks.org/sql/date-functions-in-sql/)
* [String Functions](https://www.geeksforgeeks.org/sql/sql-string-functions/)
* [Numeric Functions](https://www.geeksforgeeks.org/sql/sql-numeric-functions/)
* [Aggregate Functions](https://www.geeksforgeeks.org/sql/statistical-functions-in-sql/)
* [JSON](https://www.geeksforgeeks.org/sql/working-with-json-in-sql/)
* [Conversion](https://www.geeksforgeeks.org/sql/sql-conversion-function/)
* [LTRIM](https://www.geeksforgeeks.org/sql/ltrim-function-in-sql/)
* [UPPER](https://www.geeksforgeeks.org/sql/upper-function-in-sql/)
* [RTRIM](https://www.geeksforgeeks.org/sql/rtrim-function-in-sql/)
* [Regular Expressions](https://www.geeksforgeeks.org/sql/regular-expressions-in-sql/)

---

# 8. 🔐 Data Constraints — 🔴 P0

## Topics

* [ ] NOT NULL
* [ ] PRIMARY KEY
* [ ] FOREIGN KEY
* [ ] UNIQUE
* [ ] CHECK
* [ ] DEFAULT
* [ ] Composite Key
* [ ] Alternate Key

### Resources

* [NOT NULL](https://www.geeksforgeeks.org/sql/sql-not-null-constraint/)
* [Primary Key](https://www.geeksforgeeks.org/sql/primary-key-constraint-in-sql/)
* [Foreign Key](https://www.geeksforgeeks.org/sql/foreign-key-constraint-in-sql/)
* [Composite Key](https://www.geeksforgeeks.org/sql/composite-key-in-sql/)
* [UNIQUE](https://www.geeksforgeeks.org/sql/sql-unique-constraint/)
* [Alternate Key](https://www.geeksforgeeks.org/sql/sql-alternate-key/)
* [CHECK](https://www.geeksforgeeks.org/sql/sql-check-constraint/)
* [DEFAULT](https://www.geeksforgeeks.org/sql/sql-default-constraint/)

### 🧠 Must Understand

```text
PRIMARY KEY
→ Uniquely identifies a row

FOREIGN KEY
→ Creates relationship between tables

UNIQUE
→ Prevents duplicate values

NOT NULL
→ Prevents NULL values

CHECK
→ Enforces a condition

DEFAULT
→ Provides default value
```

---

# 9. 🔗 SQL Joins — 🔴 P0

This is one of the **most important SQL topics for interviews**.

## Topics

* [ ] INNER JOIN
* [ ] LEFT JOIN
* [ ] RIGHT JOIN
* [ ] FULL JOIN
* [ ] CROSS JOIN
* [ ] SELF JOIN
* [ ] UPDATE with JOIN
* [ ] DELETE with JOIN
* [ ] Recursive Join — awareness

### Resources

* [Join Introduction](https://www.geeksforgeeks.org/sql/sql-join-set-1-inner-left-right-and-full-joins/)
* [Outer Join](https://www.geeksforgeeks.org/sql/sql-outer-join/)
* [LEFT JOIN](https://www.geeksforgeeks.org/sql/sql-left-join/)
* [RIGHT JOIN](https://www.geeksforgeeks.org/sql/sql-right-join/)
* [FULL JOIN](https://www.geeksforgeeks.org/sql/sql-full-join/)
* [CROSS JOIN](https://www.geeksforgeeks.org/sql/sql-cross-join/)
* [SELF JOIN](https://www.geeksforgeeks.org/sql/sql-self-join/)
* [UPDATE JOIN](https://www.geeksforgeeks.org/sql/sql-update-with-join/)
* [DELETE JOIN](https://www.geeksforgeeks.org/sql/sql-delete-join/)
* [Recursive Join](https://www.geeksforgeeks.org/sql/recursive-join-in-sql/)

### 🧠 Visual Understanding

```text
INNER JOIN
A ∩ B

LEFT JOIN
All A + matching B

RIGHT JOIN
All B + matching A

FULL JOIN
Everything from A + B
```

### 🛠️ Mandatory Practice

Create:

```text
employees
departments
```

Then solve:

* [ ] Employees with departments
* [ ] Employees without departments
* [ ] Departments without employees
* [ ] Highest salary per department
* [ ] Employee + manager information using SELF JOIN

---

# 10. 👁️ SQL Views — 🟠 P1

* [ ] CREATE VIEW
* [ ] UPDATE VIEW
* [ ] RENAME VIEW
* [ ] DROP VIEW
* [ ] Why use Views?
* [ ] Views vs Tables

### Resources

* [CREATE VIEW](https://www.geeksforgeeks.org/sql/sql-create-view-statement/)
* [UPDATE VIEW](https://www.geeksforgeeks.org/sql/update-view-in-sql/)
* [RENAME VIEW](https://www.geeksforgeeks.org/sql/rename-view-in-sql/)
* [DROP VIEW](https://www.geeksforgeeks.org/sql/drop-view-sql/)

---

# 11. ⚡ SQL Indexes — 🟠 P1

## Topics

* [ ] What is an Index?
* [ ] Why Indexes?
* [ ] CREATE INDEX
* [ ] DROP INDEX
* [ ] SHOW INDEX
* [ ] UNIQUE INDEX
* [ ] Clustered Index
* [ ] Non-Clustered Index

### Resources

* [Indexes](https://www.geeksforgeeks.org/sql/sql-indexes/)
* [CREATE INDEX](https://www.geeksforgeeks.org/sql/sql-create-index/)
* [DROP INDEX](https://www.geeksforgeeks.org/sql/sql-drop-index/)
* [SHOW INDEX](https://www.geeksforgeeks.org/sql/sql-show-indexes/)
* [Unique Index](https://www.geeksforgeeks.org/sql/sql-unique-index/)
* [Clustered vs Non-Clustered](https://www.geeksforgeeks.org/sql/clustered-and-non-clustered-indexing/)

### 🧠 Interview Questions

* [ ] What is an index?
* [ ] Why does an index improve SELECT performance?
* [ ] Can indexes slow down INSERT/UPDATE?
* [ ] Clustered vs Non-Clustered?
* [ ] When should you NOT create an index?

---

# 12. 🔍 SQL Subqueries — 🔴 P0

## Topics

* [ ] Subquery
* [ ] Nested Query
* [ ] Correlated Subquery
* [ ] Subquery with SELECT
* [ ] Subquery with WHERE
* [ ] Subquery with FROM
* [ ] Subquery with EXISTS

### Resources

* [Subquery](https://www.geeksforgeeks.org/sql/sql-subquery/)
* [Correlated Subquery](https://www.geeksforgeeks.org/sql/sql-correlated-subqueries/)
* [Nested Queries](https://www.geeksforgeeks.org/sql/nested-queries-in-sql/)

### 🛠️ Practice

Solve:

* [ ] Second highest salary
* [ ] Employees earning above average salary
* [ ] Employees earning highest salary
* [ ] Department with highest average salary
* [ ] Employees who have never submitted an application

---

# 13. 🧩 CTE — 🟠 P1

* [ ] Common Table Expressions
* [ ] `WITH`
* [ ] Multiple CTEs
* [ ] Recursive CTE — awareness

### Resource

* [CTE](https://www.geeksforgeeks.org/sql/cte-in-sql/)

### Example Pattern

```text
WITH department_salary AS (...)
SELECT ...
FROM department_salary;
```

---

# 14. 🪟 Window Functions — 🟠 P1

## Topics

* [ ] Window Function Concept
* [ ] OVER()
* [ ] PARTITION BY
* [ ] ORDER BY inside Window
* [ ] ROW_NUMBER()
* [ ] RANK()
* [ ] DENSE_RANK()
* [ ] LAG()
* [ ] LEAD()

### Resource

* [Window Functions](https://www.geeksforgeeks.org/sql/window-functions/)

### 🛠️ Practice

Solve:

* [ ] Rank employees by salary
* [ ] Find top 3 salaries per department
* [ ] Find second highest salary per department
* [ ] Compare current salary with previous salary

---

# 15. 🏗️ Database Design & Modeling — 🟠 P1

## Topics

* [ ] ER Model
* [ ] Entity
* [ ] Attribute
* [ ] Relationship
* [ ] ER Diagram
* [ ] Relational Model
* [ ] Mapping ER → Relational Model
* [ ] Functional Dependency
* [ ] Attribute Closure
* [ ] Normalization
* [ ] 1NF
* [ ] 2NF
* [ ] 3NF
* [ ] BCNF — awareness
* [ ] Denormalization
* [ ] Database Design

### Resources

* [ER Model](https://www.geeksforgeeks.org/dbms/introduction-of-er-model/)
* [ER Diagrams](https://www.geeksforgeeks.org/sql/how-to-draw-entity-relationship-diagrams/)
* [ER to Relational Model](https://www.geeksforgeeks.org/dbms/mapping-from-er-model-to-relational-model/)
* [Normalization](https://www.geeksforgeeks.org/dbms/introduction-of-database-normalization/)
* [Functional Dependency](https://www.geeksforgeeks.org/dbms/functional-dependency-and-attribute-closure/)
* [Types of Functional Dependencies](https://www.geeksforgeeks.org/dbms/types-of-functional-dependencies-in-dbms/)
* [Normal Forms](https://www.geeksforgeeks.org/dbms/normal-forms-in-dbms/)
* [Denormalization](https://www.geeksforgeeks.org/dbms/denormalization-in-databases/)
* [Database Design](https://www.geeksforgeeks.org/dbms/database-design-in-dbms/)

### 🎯 Project Application

Design an ER diagram for:

```text
Job Portal
```

Entities:

```text
User
Candidate
Recruiter
Company
Job
Application
```

---

# 16. 🔐 Database Security — 🟠 P1

## Topics

* [ ] SQL Injection
* [ ] Types of SQL Injection — awareness
* [ ] Prepared Statements
* [ ] Parameterized Queries
* [ ] Data Encryption — awareness
* [ ] Backup
* [ ] Restore
* [ ] Recovery Techniques

### Resources

* [SQL Injection](https://www.geeksforgeeks.org/sql/sql-injection/)
* [Types of SQL Injection](https://www.geeksforgeeks.org/ethical-hacking/types-of-sql-injection-sqli/)
* [Data Encryption](https://www.geeksforgeeks.org/sql/sql-data-encryption/)
* [Database Recovery](https://www.geeksforgeeks.org/dbms/database-recovery-techniques-in-dbms/)
* [SQL Backup](https://www.geeksforgeeks.org/sql/sql-backup/)
* [SQL Restore](https://www.geeksforgeeks.org/sql/how-to-restore-sql-server-database-from-backup/)

### 🔥 Java Backend Connection

Understand why this is dangerous:

```text
User Input
    ↓
String concatenation
    ↓
SQL Query
    ↓
SQL Injection
```

Prefer:

```text
User Input
    ↓
Parameterized Query
    ↓
Database
```

---

# 17. 🔌 Database Connectivity — 🟠 P1

## Topics

* [ ] JDBC
* [ ] ORM
* [ ] ODM — awareness
* [ ] ODBC — awareness
* [ ] JDBC Driver
* [ ] Connection
* [ ] PreparedStatement
* [ ] ResultSet

### Resources

* [ORM](https://www.geeksforgeeks.org/dbms/what-is-object-relational-mapping-orm-in-dbms/)
* [ORM vs ODM](https://www.geeksforgeeks.org/dbms/comparison-between-orm-and-odm/)
* [ODBC](https://www.geeksforgeeks.org/dbms/odbc-full-form/)

### Java Backend Flow

```text
Java
 ↓
JDBC
 ↓
MySQL

OR

Java
 ↓
Spring Data JPA
 ↓
Hibernate
 ↓
JDBC
 ↓
MySQL
```

---

# 18. 💳 SQL Transactions — 🔴 P0

## Topics

* [ ] Transaction
* [ ] COMMIT
* [ ] ROLLBACK
* [ ] SAVEPOINT
* [ ] ACID Properties
* [ ] Atomicity
* [ ] Consistency
* [ ] Isolation
* [ ] Durability
* [ ] Transaction Isolation Levels — awareness

### Resource

* [SQL Transactions](https://www.geeksforgeeks.org/sql/sql-transactions/)

### 🧠 Must Know

```text
A → Money deducted
B → Money added

Both succeed
OR
Both rollback
```

This is extremely important for backend development.

---

# 19. ⚡ Performance Tuning — 🟠 P1

## Topics

* [ ] Query Performance
* [ ] Indexes
* [ ] EXPLAIN
* [ ] Query Optimization
* [ ] Avoid unnecessary SELECT *
* [ ] Filtering
* [ ] Join optimization
* [ ] Database indexing
* [ ] Pagination

### Resources

* [SQL Performance Tuning](https://www.geeksforgeeks.org/sql/sql-performance-tuning/)
* [Database Tuning](https://www.geeksforgeeks.org/sql/sql-database-tuning/)

### 🎯 Backend Goal

Understand:

```text
Slow Query
   ↓
EXPLAIN
   ↓
Execution Plan
   ↓
Identify Problem
   ↓
Index / Query Optimization
```

---

# 20. ⚙️ Stored Procedures & Triggers — 🟡 P2

## Topics

* [ ] Stored Procedures
* [ ] Parameters
* [ ] Trigger
* [ ] BEFORE Trigger
* [ ] AFTER Trigger
* [ ] Trigger Use Cases

### Resources

* [Stored Procedures](https://www.geeksforgeeks.org/sql/what-is-stored-procedures-in-sql/)
* [Triggers](https://www.geeksforgeeks.org/sql/sql-trigger-student-database/)

### Priority

Know what they are and where they are used.

Do not spend excessive preparation time here before mastering:

```text
SELECT
JOIN
GROUP BY
Subqueries
CTE
Window Functions
Transactions
Indexes
```

---

# 21. 🟡 Miscellaneous / Advanced SQL

Learn after the core SQL syllabus.

* [ ] Pivot
* [ ] Unpivot
* [ ] Cursors
* [ ] Recursive Queries
* [ ] Hosting
* [ ] Advanced JSON
* [ ] Advanced Regex
* [ ] Batch Processing
* [ ] Advanced Database Tuning

### Resources

* [Pivot & Unpivot](https://www.geeksforgeeks.org/sql/pivot-and-unpivot-in-sql/)
* [Cursors](https://www.geeksforgeeks.org/sql/what-is-cursor-in-sql/)
* [Hosting](https://www.geeksforgeeks.org/sql/sql-hosting/)

---

# 🧪 SQL Practice Roadmap

## Level 1 — Beginner

* [ ] SELECT
* [ ] WHERE
* [ ] ORDER BY
* [ ] LIMIT
* [ ] DISTINCT
* [ ] LIKE
* [ ] IN
* [ ] BETWEEN
* [ ] INSERT
* [ ] UPDATE
* [ ] DELETE

### Target

**50 queries**

---

# Level 2 — Intermediate

* [ ] GROUP BY
* [ ] HAVING
* [ ] Aggregate Functions
* [ ] INNER JOIN
* [ ] LEFT JOIN
* [ ] RIGHT JOIN
* [ ] Subqueries
* [ ] CASE
* [ ] EXISTS

### Target

**75 queries**

---

# Level 3 — Advanced

* [ ] CTE
* [ ] Window Functions
* [ ] Correlated Subqueries
* [ ] Self Join
* [ ] Complex JOINs
* [ ] Ranking
* [ ] Query Optimization

### Target

**75 queries**

---

# 🎯 Total SQL Practice Target

```text
Beginner     → 50
Intermediate → 75
Advanced     → 75
--------------------
TOTAL        → 200 SQL Queries
```

---

# 🏆 SQL Interview Problem Set

Solve these without looking at the solution:

* [ ] Find second highest salary
* [ ] Find Nth highest salary
* [ ] Find duplicate records
* [ ] Remove duplicate records
* [ ] Find employees without departments
* [ ] Find departments without employees
* [ ] Find highest salary in each department
* [ ] Find top 3 salaries in each department
* [ ] Find employees earning more than average salary
* [ ] Find employees earning more than their manager
* [ ] Find employees with same salary
* [ ] Find duplicate emails
* [ ] Find customers who never placed an order
* [ ] Find the second most recent order
* [ ] Find consecutive records
* [ ] Find department with highest average salary
* [ ] Find employees hired in the last N days
* [ ] Rank employees by salary
* [ ] Find running total
* [ ] Find previous/next record using LAG/LEAD

---

# 🧠 SQL Interview Theory

## Database Fundamentals

* [ ] DBMS vs RDBMS
* [ ] Primary Key
* [ ] Foreign Key
* [ ] Candidate Key
* [ ] Alternate Key
* [ ] Composite Key
* [ ] Constraints
* [ ] Normalization
* [ ] Denormalization

## SQL

* [ ] DELETE vs TRUNCATE vs DROP
* [ ] WHERE vs HAVING
* [ ] UNION vs UNION ALL
* [ ] JOIN types
* [ ] Subquery vs JOIN
* [ ] EXISTS vs IN
* [ ] GROUP BY
* [ ] Aggregate Functions
* [ ] Window Functions
* [ ] CTE

## Performance

* [ ] Index
* [ ] Clustered vs Non-Clustered
* [ ] Query Optimization
* [ ] EXPLAIN
* [ ] Pagination

## Transactions

* [ ] ACID
* [ ] COMMIT
* [ ] ROLLBACK
* [ ] SAVEPOINT
* [ ] Isolation

## Security

* [ ] SQL Injection
* [ ] PreparedStatement
* [ ] Parameterized Queries

---

# 🚀 SQL + Spring Boot Integration

SQL is not an isolated skill in this roadmap.

Your actual backend architecture should become:

```text
Frontend / Postman
        ↓
REST API
        ↓
Spring Boot Controller
        ↓
Service Layer
        ↓
Spring Data JPA
        ↓
Hibernate
        ↓
JDBC
        ↓
MySQL
```

Therefore, while learning SQL, simultaneously understand how your SQL knowledge maps to Spring Boot.

---

# 🏗️ SQL Projects

## Project 1 — Employee Database

### Database

```text
company_db
```

### Tables

```text
employees
departments
projects
```

### Features

* [ ] CRUD
* [ ] Primary Keys
* [ ] Foreign Keys
* [ ] Joins
* [ ] Aggregate Functions
* [ ] Subqueries
* [ ] Views

---

# Project 2 — E-Commerce Database

### Tables

```text
users
products
categories
orders
order_items
payments
```

### Practice

* [ ] Design ER diagram
* [ ] Create tables
* [ ] Add constraints
* [ ] Insert sample data
* [ ] Write JOIN queries
* [ ] Write subqueries
* [ ] Write aggregation queries
* [ ] Add indexes
* [ ] Create views
* [ ] Practice transactions

---

# 🔥 Project 3 — Job Portal Database

This database will later become the database layer for your **Spring Boot Job Portal Backend**.

### Tables

```text
users
candidates
recruiters
companies
jobs
applications
skills
candidate_skills
```

### Relationships

```text
Company
   ↓
Jobs
   ↓
Applications
   ↓
Candidates
```

### Features

* [ ] ER Diagram
* [ ] Normalization
* [ ] Primary Keys
* [ ] Foreign Keys
* [ ] Composite Keys
* [ ] Constraints
* [ ] Indexes
* [ ] Views
* [ ] Complex JOINs
* [ ] CTE
* [ ] Window Functions
* [ ] Transactions

---

# 📈 SQL Progress Tracker

| Topic              | Priority | Status |
| ------------------ | -------- | ------ |
| SQL Basics         | 🔴 P0    | ⬜      |
| Data Types         | 🔴 P0    | ⬜      |
| SQL Commands       | 🔴 P0    | ⬜      |
| Databases          | 🔴 P0    | ⬜      |
| Tables             | 🔴 P0    | ⬜      |
| CRUD Queries       | 🔴 P0    | ⬜      |
| Clauses            | 🔴 P0    | ⬜      |
| Operators          | 🔴 P0    | ⬜      |
| Functions          | 🔴 P0    | ⬜      |
| Constraints        | 🔴 P0    | ⬜      |
| Joins              | 🔴 P0    | ⬜      |
| Subqueries         | 🔴 P0    | ⬜      |
| Views              | 🟠 P1    | ⬜      |
| Indexes            | 🟠 P1    | ⬜      |
| CTE                | 🟠 P1    | ⬜      |
| Window Functions   | 🟠 P1    | ⬜      |
| ER Modeling        | 🟠 P1    | ⬜      |
| Normalization      | 🟠 P1    | ⬜      |
| SQL Injection      | 🟠 P1    | ⬜      |
| JDBC               | 🟠 P1    | ⬜      |
| Transactions       | 🔴 P0    | ⬜      |
| ACID               | 🔴 P0    | ⬜      |
| Performance Tuning | 🟠 P1    | ⬜      |
| Stored Procedures  | 🟡 P2    | ⬜      |
| Triggers           | 🟡 P2    | ⬜      |
| Cursors            | 🟡 P2    | ⬜      |
| Advanced SQL       | 🟡 P2    | ⬜      |

---

# 🧭 SQL Learning Strategy

For every topic:

```text
Understand
    ↓
Write Query
    ↓
Break Query
    ↓
Test Edge Cases
    ↓
Solve 5–10 Problems
    ↓
Use in Project
    ↓
Explain in Interview
```

### Example: JOIN

Don't stop at:

> "I know INNER JOIN."

You should be able to:

```text
1. Explain INNER JOIN
2. Write INNER JOIN
3. Explain LEFT JOIN
4. Write LEFT JOIN
5. Compare INNER vs LEFT
6. Solve multi-table JOIN
7. Debug incorrect JOIN
8. Use JOIN in Spring Boot project
```

---

# 🚫 Don't Waste Time

For your **entry-level Java Backend Developer** target, don't spend too much time initially on:

* [ ] SQL career/salary articles
* [ ] Rare SQL syntax
* [ ] Deep cursor concepts
* [ ] Advanced regex
* [ ] Advanced JSON
* [ ] Database hosting theory
* [ ] Vendor-specific features
* [ ] Memorizing every SQL function

Focus first on:

```text
SELECT
WHERE
GROUP BY
HAVING
ORDER BY
JOIN
Subquery
Functions
Constraints
Indexes
Transactions
CTE
Window Functions
```

---

# 🧠 80/20 SQL Mastery

If time is limited, master these first:

### 🔥 Tier 1

```text
SELECT
WHERE
ORDER BY
GROUP BY
HAVING
JOIN
Aggregate Functions
```

### 🔥 Tier 2

```text
Subqueries
CASE
EXISTS
Constraints
Primary Key
Foreign Key
```

### 🔥 Tier 3

```text
CTE
Window Functions
Indexes
Transactions
ACID
Normalization
```

### 🔥 Tier 4

```text
Views
Triggers
Stored Procedures
Cursors
Advanced Optimization
```

---

# 🏁 Definition of Done

I will consider SQL **placement-ready** only when I can:

* [ ] Create a relational database from scratch
* [ ] Design tables
* [ ] Apply constraints
* [ ] Insert realistic data
* [ ] Write CRUD queries
* [ ] Write complex JOIN queries
* [ ] Solve subquery problems
* [ ] Use aggregate functions
* [ ] Use GROUP BY + HAVING
* [ ] Use CTEs
* [ ] Use window functions
* [ ] Explain indexes
* [ ] Explain transactions and ACID
* [ ] Explain normalization
* [ ] Identify SQL injection risks
* [ ] Optimize a basic slow query
* [ ] Design an ER diagram
* [ ] Connect MySQL to Java
* [ ] Connect MySQL to Spring Boot
* [ ] Build a database for a real backend project
* [ ] Solve SQL interview questions without copying solutions

---

# 🔗 Practice & Revision

* [SQL Exercises](https://www.geeksforgeeks.org/sql/sql-exercises/)
* [SQL Quiz](https://www.geeksforgeeks.org/sql/sql-quiz/)
* [SQL Interview Questions](https://www.geeksforgeeks.org/sql/sql-interview-questions/)
* [SQL Query Interview Questions](https://www.geeksforgeeks.org/sql/sql-query-interview-questions/)
* [SQL Cheat Sheet](https://www.geeksforgeeks.org/sql/sql-cheat-sheet/)
* [30 Days of SQL](https://www.geeksforgeeks.org/sql/30-days-of-sql-from-basic-to-advanced-level/)
* [DBMS Interview Questions](https://www.geeksforgeeks.org/dbms/commonly-asked-dbms-interview-questions/)

---

# 🎯 Final Backend Stack

SQL should ultimately fit into this stack:

```text
                    JAVA BACKEND
                         │
          ┌──────────────┴──────────────┐
          │                             │
       Java                         SQL / MySQL
          │                             │
          └──────────────┬──────────────┘
                         │
                    JDBC Basics
                         │
                    Spring Boot
                         │
                    REST API
                         │
                 Spring Data JPA
                         │
                     Hibernate
                         │
                       MySQL
                         │
                 Production Project
```

---

# 🏆 Final Goal

> **Don't aim to "finish SQL." Aim to become someone who can design a database, write complex queries, debug SQL problems, and integrate that database into a Spring Boot backend.**

### Target

```text
200+ SQL Queries
        ↓
3 Database Projects
        ↓
MySQL Mastery
        ↓
JDBC Understanding
        ↓
Spring Data JPA
        ↓
Spring Boot Backend
```

**SQL → Database Design → Java/JDBC → JPA/Hibernate → Spring Boot → Real Projects → Placement**

