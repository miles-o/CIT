# WHERE clause
- restricts information
```SQL
SELECT *|{[DISTINCT] column | expression alias]..}
FROM table
[WHERE condition(s)];
```
- contains a condition that must be met
- use comparison operators
- is case sensitive
	- other operators can be used to fix this, will be learnt in future sessions
# Comparison operators
- SQL has more than just the regular comparison operators
- you can use: BETWEEN ... AND, IN, LIKE, etc.
## BETWEEN ... AND
BETWEEN ... AND example:
```SQL
SELECT last_name, salary
FROM employees
WHERE salary BETWEEN 9000 AND 11000;
```
- acts at <=, includes upper and  lower values
## IN
- known as the membership condition
- test if value is in a specified set of values
Example:
```SQL
SELECT city, state_province, country_id
FROM locations
WHERE country_id IN ('UK', 'CA');
```
## LIKE
- allows you to retrieve data from incomplete information
- you can use % for a variable number of characters
- or _ for a fixed single character
Example showing all employees whos last names begin with K:
```SQL
SELECT last_name
FROM employees
WHERE last_name LIKE 'K%';
```
- if you want to search for % or _ you can use ESCAPE
Example
```SQL
SELECT last_name, job_id
FROM employees
WHERE job_id LIKE '%\_R%' ESCAPE '\';
```
- does not have to be backslash, any character can be used
## IS NULL, IS NOT NULL
- IS NULL tests for null
- IS NOT NULL tests for not null
```SQL
SELECT last_name, commission_pct
FROM employees
WHERE commission_pct IS NOT NULL;
```
# Logical operators
- AND, OR, NOT
	- you can guess what these do
## Order of operations in SQL
![[Pasted image 20240808094402.png]]
# Sorting rows
## ORDER BY
- default order is ascending
- null will be last by default
- can use NULL FIRST, or NULL LAST to override
- to sort descending order use DESC
```SQL
SELECT last_name, hire_date
FROM employees
ORDER BY hire_date DESC;
```
- aliases can be used to order data
- you can order by data not specified in the select statement
```SQL
SELECT employee_id, first_name
FROM employees
WHERE employee_id < 105
ORDER BY last_name;
```
![[Pasted image 20240808094935.png]]
- can order by more than one column
You want sorted by department, and departments sorted alphabetically:
```SQL
SELECT department_id, last_name
FROM employees
WHERE department_id <= 50
ORDER BY department_id, last_name;
```
