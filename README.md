# Lab Assignment 22

In this lab you will practice working with polymorphism.

Unlike previous labs, your class has already been created for you. 

## Let's get started!

Now let's begin!

### Polymorphism

When a class is inheriting members from another class it's inevitable to run into a situation where we end up with duplicate members that have the same name.

When a class has access to multiple members with the same identifiers or signatures, this is known as **Polymorphism**.

**For Example:**
```java
// Super/Parent Class
class Car {
	public String model;

	public void info() {
		System.out.print("This is a car.");
	}

	public void attributes() {
		System.out.print(model);
	}
}

// Sub/Child Class
class Truck extends Car {
	public String model; // Same name as Car attribute
	public int weight_limit;

	// Same name as Car methods.
	public void info() {
		System.out.print("This is a truck.");
	}

	public void attributes() {
		System.out.print(model);
		System.out.print(weight_limit);
	}
}
```

To learn more about polymorphism in Java visit: https://www.w3schools.com/java/java_polymorphism.asp


### Overriding

When the **Sub-Class** inherits a method from the **Super-Class** that has the exact same name and parameters, the **Sub-Class**' method takes precedence, this is known as **overriding**.

Overriding only occurs in the following scenario:

* **Methods** have the same signature (identifier & parameters).

**For Example:**
```java
Truck truck1 = new Truck();
truck1.info(); // This will output "This is a truck."
```

When overriding occurs in our code it's important to use the proper annotation. 
* Use the `@Override` annotation above all methods that will override a method from the super-class.
* Use the `this` keyword to differentiate attributes from the sub-class.
* Use the `super` keyword to differentiate attributes from the super-class.

**For Example:**
```java
// Super/Parent Class
class Car {
	public String model;

	public void info() {
		System.out.print("This is a car.");
	}
	public void attributes() {
		System.out.print(model);
	}
}

// Sub/Child Class
class Truck extends Car {
	public String model; // Same name as Car attribute. NOT Overriding.
	public int weight_limit;

	// Same name as Car methods.
	@Override
	public void info() {
		System.out.print("This is a truck.");
	}
	@Override
	public void attributes() {
		System.out.print(super.model); // Using super to distinguish from sub-class attribute.
		System.out.print(this.model);
		System.out.print(this.weight_limit);
	}
}
```

To learn more about overriding in Java visit: https://www.geeksforgeeks.org/overriding-in-java/

## Your Assignment

For this assignment you will be working with the following classes: `Machine`, `Bulldozer` and `Excavator`.

`Bulldozer`'s and `Excavator`'s are both `Machine`s, so have them **inherit** the `Machine` class.

Next, create constructors for `Bulldozer` and `Excavator`. Remeber, use the `this` and `super` keywords.

Lastly, **override** the `about()` method so when called upon it will output the information of the **Sub-Class**. Use the correct annotation to indicate when you are overriding a method.

**Test Your Code:**

```
./test.sh
```

## Submit your assignment

[Grading Criteria](https://joselitoguardado.dev/3326/labs/Lab_21.pdf)

[How to Submit Assignments to GitHub](https://joselitoguardado.dev/3326/How_to_Submit_Assignments_to_GitHub.pdf)
