### Week 06 exercise

You work for an IT company that has been engaged by a local environmental rubbish collection club to create an application to read Collector names and the weight of rubbish they have collected in a week from a file and to write out the collector names & calculated total weight collected to an output file. Your boss has met with the CEO of the club to determine requirements and he has done analysis on the project and come up with a design for the solution. 

The task your boss has given to you is to code two classes matching the URL diagrams she provides you. The classes that she wants you to create are a Collector class (which will store a collector name & an array of weights) and a ProcessCollectors class which will read data from the input file, create Collector objects and then call a method of each collector to enable the collector name and a calculated total to be written out to a file.

You should run the tests provided by your boss and ensure  your output produces the expected output.

The class diagram that you are provided with, for the development of the Collector class is:

![[CollectorClass.png]]

There are two constructors that must both be coded.

#### Detailed Information

1. A Collector can be created from either of two constructors. The String array is useful when the weights are read from a file, the double array when the weights are provided as double already.
2. The calculateTotal() method of a Collector needs to add up all the weights in the array to get a total and then return the collector name followed by a comma followed by the total weight.

#### The ProcessCollectorFile class

The ProcessStudentFile class needs to have a public static void main method.   

1. It should open and then read all the records in a file called collectors.txt. It should open and write a date heading to a file called totalCollection.txt. The heading should be something like Report dated Thu Aug 15 12:51:45 AEST 2019. 
2. Each line in scores.txt will contain a collector name followed by a semi-colon followed by four comma-separated weights
3. The program needs to create a collector object from each line of data, call the calculateTotal() method & write out a line to totalCollection.txt with the collector name followed by a comma followed by the total weight.

The test file that your boss provides to you (collectors.txt) is:  
```
Chris Cleaner;5.0,5.1,5.2,5.3  
Peter Picker;3.0,4.0,5.0,6.0  
Larry Lazzy;0,0,0,0,0
```
The output file it creates (should be something like the following (you should check to make sure you get similar results and if you don’t then work out why & fix before submitting):  

The output file (totalCollection.txt) should be produced something like this:  
```
Report dated Tue Aug 27 10:48:44 AEST 2019  
Chris Cleaner,20.6  
Peter Picker,18.0  
Larry Lazzy,0.0
```
