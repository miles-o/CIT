**Part A.**  Write a Car class using the class diagram provided below.  You might like to use the code from the lecture to help you write it. Test your class by creating two car objects using IntelliJ, calling the get methods to check the values in the attributes, calling set methods to change the attribute values and checking that they have been updated correctly by calling the get methods again.

                                                    ![[Car UML.png]]

  
```java
public class Car {  
    private String rego;  
    private String model;  
    private int year;  
    private double price;  
  
    public Car(String inRego, String inModel, int inYear, double inPrice) {  
        this.rego = inRego;  
        this.model = inModel;  
        this.year = inYear;  
        this.price = inPrice;  
    }  
  
    public String toString() {  
        return "Model: " + model + "\nYear: " + year + "\nRego: " + rego + "\nPrice: " + price;  
    }  
  
    public String getRego() {  
        return rego;  
    }  
  
    public void setRego(String newRego) {  
        rego = newRego;  
    }  
  
    public String getModel() {  
        return model;  
    }  
  
    public void setModel(String newModel) {  
        model = newModel;  
    }  
  
    public int getYear() {  
        return year;  
    }  
  
    public void setYear(int newYear) {  
        year = newYear;  
    }  
  
    public double getPrice() {  
        return price;  
    }  
  
    public void setPrice(double newPrice) {  
        price = newPrice;  
    }  
}
```

```java
public class App {  
    public static void main(String[] args) {  
        Car newCar = new Car("yrh564", "ford f150", 2014, 10000);  
        System.out.println(newCar);  
  
        newCar.setRego("yur765");  
        System.out.println(newCar.getRego());  
  
        newCar.setPrice(12000);  
        System.out.println(newCar.getPrice());  
  
        newCar.setModel("ford ranger");  
        System.out.println(newCar.getModel());  
  
        newCar.setYear(2016);  
        System.out.println(newCar.getYear());  
  
        System.out.println(newCar);  
    }  
}
```


**Part B.**  Identify which are the names of the following:

1. The class name
	- Car 
2. The attribute names
	-  rego
	- model
	- year
	- price
3. The name of the constructor method
	- Car 
4. Names of the other methods
	- toString
	- getRego
	- getModel
	- setModel
	- getYear
	- setYear
	- getPrice
	- setPrice
5. The name of the parameter used in the setPrice() method
	- newPrice 
6. The return type of the getPrice() method
	- double



**Part C.**  Make a few deliberate errors (one at a time) in your code and see what error message you get when you try to compile – this will hopefully help you in the future when you accidentally make an error and try to find the problem using the error message.
***have not done this*** 