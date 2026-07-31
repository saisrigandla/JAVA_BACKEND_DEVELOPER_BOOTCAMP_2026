## Programs of Conditional Statements with boundary test cases
Problem 1 : Leap Year
Testcases:
|   Year | Expected        |
| -----: | --------------- |
| `2024` | Leap Year       |
| `2023` | Not a Leap Year |
| `2000` | Leap Year       |
| `1900` | Not a Leap Year |
| `2100` | Not a Leap Year |
| `2400` | Leap Year       |

problem 2 : Login Validation
First check whether the username is correct.
Only if the username is correct, check whether the password is correct.
Print:
Login Successful
Incorrect Password
Username Not Found
For this problem, don’t use Scanner yet. Use direct values first:
String username = "Sai";
String password = "Java123";

Problem 3: Employee Bonus Eligibility
An employee gets a bonus if:
Their salary is ₹50,000 or less
Their years of experience are 2 years or more
Otherwise, they are not eligible.
Test cases
Salary: 45,000
Experience: 3
Expected: Eligible for Bonus
Salary: 60,000
Experience: 5
Expected: Not Eligible for Bonus
Salary: 40,000
Experience: 1
Expected: Not Eligible for Bonus
Salary: 50,000
Experience: 2
Expected: Eligible for Bonus

Problem 4 : Loan Eligibility
A person is eligible for a loan only if:
Age is 21 or above
Monthly salary is ₹25,000 or above
Credit score is 700 or above
Otherwise, print:
Not Eligible for Loan
If all conditions are satisfied, print:
Eligible for Loan
| Age | Salary | Credit Score | Expected              |
| --: | -----: | -----------: | --------------------- |
|  25 |  30000 |          750 | Eligible for Loan     |
|  20 |  50000 |          800 | Not Eligible for Loan |
|  30 |  20000 |          750 | Not Eligible for Loan |
|  28 |  40000 |          650 | Not Eligible for Loan |
|  21 |  25000 |          700 | Eligible for Loan     |

problem 5 : Scholarship Eligibility
A student is eligible for a scholarship if:
The student’s marks are 90 or above
OR
The student’s marks are 75 or above AND the family income is ₹2,00,000 or less
Otherwise, print:
Not Eligible for Scholarship
If eligible, print:
Eligible for Scholarship
| Marks | Family Income | Expected     |
| ----: | ------------: | ------------ |
|    95 |        500000 | Eligible     |
|    80 |        150000 | Eligible     |
|    80 |        250000 | Not Eligible |
|    70 |        100000 | Not Eligible |
|    90 |       1000000 | Eligible     |
|    75 |        200000 | Eligible     |

problem 6 : Electricity Bill Category
Based on the number of electricity units consumed, print the category:
0–100 units → Low Usage
101–200 units → Medium Usage
201–300 units → High Usage
More than 300 units → Very High Usage
If the user enters a negative number, print:
Invalid Units
| Units | Expected Output |
| ----: | --------------- |
|  `-5` | Invalid Units   |
|   `0` | Low Usage       |
| `100` | Low Usage       |
| `101` | Medium Usage    |
| `200` | Medium Usage    |
| `201` | High Usage      |
| `300` | High Usage      |
| `301` | Very High Usage |

problem 7 : College Admission Eligibility
A student is eligible for admission if:
Marks are between 0 and 100
Age is at least 17
The student is eligible if either:
Marks are 75 or above
OR
Marks are 60 or above and the student has a sports quota
Otherwise, print:
Not Eligible for Admission
If the age is below 17, print:
Age Not Eligible
If marks are below 0 or above 100, print:
Invalid Marks
If all requirements are satisfied, print:
Eligible for Admission
|  Age | Marks | Sports Quota | Expected                   |
| ---: | ----: | ------------ | -------------------------- |
| `18` |  `80` | `false`      | Eligible for Admission     |
| `18` |  `65` | `true`       | Eligible for Admission     |
| `18` |  `65` | `false`      | Not Eligible for Admission |
| `16` |  `90` | `true`       | Age Not Eligible           |
| `20` |  `55` | `true`       | Not Eligible for Admission |
| `17` |  `75` | `false`      | Eligible for Admission     |
| `17` |  `60` | `true`       | Eligible for Admission     |
| `18` | `101` | `true`       | Invalid Marks              |
| `18` |  `-1` | `false`      | Invalid Marks              |
