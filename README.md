# Lab Assignment 20

In this lab you will practice working with polymorphism.

Unlike previous labs, your class has already been created for you. 

## Let's get started!

Now let's begin!

### Polymorphism

When inheriting attributes and methods from other classes it's inevitable to run into a situation where an member with the same name is inherited.

When a class has access to multiple members with the same name (identifier), this is known as **polymorphism**.

**For Example:**
```java
// Super-Class
class Car {
	public String model;

	public void info() {
		System.out.print("This is a car.");
	}
}

// Sub-Class
class Truck extends Car {
	public int weight_limit;

	public void info() {
		System.out.print("This is a truck.");
	}
}
``` 

To learn more about polymorphism in Java visit: https://www.w3schools.com/java/java_polymorphism.asp


### Overriding

When a member from the **Super-Class** is inherited into the **Sub-Class** the **Sub-Class**' members takes precedence, this is known as **overriding**.

Overriding only occurs in the following scenarious:

* Attributes have the same identifier.
* Methods have the same identifier & parameters.

**For Example:**
```java
Truck truck1 = new Truck();
truck1.info(); // This will output "This is a truck."
```

To learn more about overriding in Java visit: https://www.geeksforgeeks.org/overriding-in-java/

## Your Assignment

For this assignment you will be working with the following classes: `Machine`, `Bulldozer` and `Excavator`.

`Bulldozer`'s and `Excavator`'s are both `Machine`s, so have them **inherit** the `Machine` class.

Next, **override** the `about()` method so when called upon it will output the information of the **Sub-Class**.

**Test Your Code:**

```
./build.sh
./test.sh
```

## Submit your assignment

To submit your lab assignment click on the **Source Control** icon (3 circles with 2 lines) on your leftside navbar. Next, click on the **+** symbol next to **Changes** to stage your changes. Lastly, add a commit message (ex: "First commit") and click **Commit** then **Sync Changes**. And you're done!