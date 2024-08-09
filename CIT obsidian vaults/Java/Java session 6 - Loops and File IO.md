# Loops
## For loops
Syntax:
```java
for (statement1; statement2; statement3) {
	//code
}
```
- Statement 1 is executed 1 time before the execution of the code block
- Statement 2 defines the condition of executing the code block
- Statement 3 is executed every time after the code block is executed
Example:
```java
int sum = 0;
for (int i=0; i<=9; i++) {
	sum += numbers[i]; 
}
```
![[Diagram.svg]]
### For-each loop
- Used specifically to loop through an array
```java
for (datatype variableName : arrayName) {
	//code
}
```
Example calculating sum of int array:
```java
int sum = 0;
for (int num: numbers) {
	sum += num;
}
```
## While loops
Syntax:
```java
while (statement) {
	// code
}
```
- statement defines a condition for executing the code block
Another way to calculate the sum of numbers array:
```java
int i = 0;
int sum = 0;

while (i<=9) {
	sum += numbers[i];
	i++;
}
```
![[Diagram 1.svg]]
# File Input/Output
## FileWriter class
Syntax:
``` java
FileWriter writer = new FileWriter("output.txt");
writer.write(data);
writer.close
```
- Will create a file if it does not exist
## try/catch blocks
- put file I/O in try/catch blocks
- code in try part is run
- if an exception is triggered, instead of the program crashing, the catch part is run
```java
try {
	// file I/O statements
} catch (Exception ex) {
	System.out.println("error writing to file" + ex);
}
```
## BufferedWriter
- generally you want to use BufferedWriter
- it is faster because it buffered the FileWriter output and only writes it out when it needs to instead of every time you use writer.write()
- if you need to save to the file rse writer.flush()
Syntax:
```java
BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))
```
## BufferedReader
- Can read text file line by line
```java
BufferedReader reader = new BufferedReader(new FileReader("input.txt"))
```
- use a loop to read all the lines
```java
String inLine = reader.readLine();

while (inLine != null)

{

  //process the record

  inLine = reader.readLine();

}

reader.close();
```
## String.Split
- splits a string by the search character into an array of strings
```java
String[] lineArray = inLine.split(";");
String name = lineArray[0];
String[] bowlerScores = lineArray[1].split(",");             

Bowler player = new Bowler(name, bowlerScores);
```
# Exercises
[[Java Session 6 - Exercise 1]]
[[Java Session 6 - Exercise 2]]
