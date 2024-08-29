# Intro to functions
## Purpose
- when you put money in a vending machine it:
	- counts your money
	- selects your product
	- returns change, if nessecary
- in SQL there are many types functions you can use to transform an input into an output
## Functions
- input is referred to as the argument
- there are two distinct types of functions
	- single row
	- multi row
![[Pasted image 20240810190737.png]]
### Single row functions
- operate on single rows and only return one result per row
- can be used to:
	- perform calculations, like rounding numbers
	- modify data items, like converting character case
	- format dates and numbers for display
	- convert column data types, like converting string to date
- can accept one or more arguments, but only returns one output per row
- output of one function can be the input for another
### Multi row functions
- can manipulate groups of rows to give one result per group of rows
- also known as group functions
- take many rows as input
# Case and character manipulation
## Purpose
- being able to change the way data is presented is important
## DUAL table
- has one row called x
- good for testing
## Functions that convert the case of character string
- good for searching for values
- can be used in most parts of a SQL statement
- LOWER() converts to lower case
- UPPER() converts to upper case
- INITCAP() gives the first character of each word a capital
## Functions that can join, extract, show, find, pad, and trim character strings
- used to alter a character string in some way
- CONCAT() joins two values
- SUBSTR(characterString, startingPosition, length)
	- returns string of a determined length
	- length argument is optioinal, if omitted returns all characters in the string
![[Screenshot 2024-08-12 at 9.42.34 am.jpg]]
- LENGTH() returns length of string
- INSTR(string, substring) returns the first occurence of a substring within a string
	- if substring not in string returns 0
- LPAD(String, totalChars, paddingChar) returns the string with the paddingChar to the left, total length will be totalChars
- RPAD is LPAD but reversed
- TRIM removes leading or trailing characters from a string
![[Screenshot 2024-08-12 at 9.47.30 am.jpg]]
- REPLACE replaces a sequence of characters with another set of characters\
```SQL
REPLACE(string1, string_to_replace, [replacemene_string])
```
![[Screenshot 2024-08-12 at 9.48.59 am.jpg]]
## Number functions
- the three number functions are
	- ROUND
	- TRUNC
	- MOD
### ROUND
- can be used with both numbers and dates
```
ROUND(column|expression, decimal places)
```
- will round to no decimal places if none are given
- is decimal places is positive it will round to that many decimal places
- if the number is negative it will move the decimal place that many places left
### TRUNC
- trunc will truncate the value
```
TRUNC(column|expression, decimal places)
```
- works very similar to ROUND
### MOD
- MOD finds the remainder after one value is divided by another
- good to determine whether a value is odd or even
```
SELECT country_name, MOD(airports, 2)
	AS "Mod Demo"
FROM wf_countries;
```
![[Screenshot 2024-08-12 at 9.57.36 am.jpg]]
# Date functions
## SYSDATE
- returns current date
## Working with dates
![[Screenshot 2024-08-12 at 10.00.11 am.jpg]]
## Date functions
- all return a DATE datatype, except for months between which returns a number
![[Screenshot 2024-08-12 at 10.01.40 am.jpg]]\
### MONTHS_BETWEEN
- takes two DATE arguments and returns the months between
- can return negative
### ADD_MONTHS
- adds months to a date
- can accept a negative argument
### NEXT_DAY
- takes two arguments, date and weekday and returns the date of the next occurrence of the weekday after the date argument
![[Screenshot 2024-08-12 at 10.04.41 am.jpg]]
### LAST_DAY
- takes a DATE argument and returns the last day of the month of that date
### ROUND
- returns a DATE rounded to unit specified in the argument
![[Screenshot 2024-08-12 at 10.06.11 am.jpg]]
### TRUNC
- returns truncated date
- similar to round
![[Screenshot 2024-08-12 at 10.07.15 am.jpg]]
