# Chapter00-Introduction
### Class
- A class is a blueprint or template for creating objects in a programming language.
- It defines a set of attributes (fields or properties) and methods (functions or procedures) that characterize an object's behavior.
- A class serves as a blueprint for creating instances of objects with common characteristics and behaviors.
- It encapsulates the properties and behaviors that objects of that class will have.

### Object
- An object is an instance of a class, created based on the blueprint defined by the class.
- It represents a real-world entity with properties (attributes) and behaviors (methods).
- Objects are the runtime entities that interact with each other in an object-oriented system.
- Each object has its own unique state, but it shares the structure and behavior defined by its class.

### Inheritance
Inheritance is a fundamental concept in object-oriented programming (OOP) 
that allows a new class to inherit the characteristics and behaviors (fields and methods)
of an existing class. In Java, inheritance enables the creation of a new class, 
known as the subclass or child class, based on an existing class, called the superclass or parent class.

### Abstract
 - An abstract class is a class that cannot be instantiated on its own.
 - It may have both abstract (unimplemented) and concrete (implemented) methods.
 - It can have instance variables (fields).
 - Abstract classes may extend other classes (abstract or concrete) and implement interfaces.
### Interface
 - An interface is a collection of abstract methods (methods without a body) and constant declarations.
 - All methods in an interface are implicitly public and abstract (prior to Java 8), or they can be explicitly declared as such (Java 8 and later).
 - Interfaces can only contain constant (static final) fields, not instance variables.

## When to Use Abstract Class vs. Interface:
Use Abstract Class When:
- There is shared/common code among related classes.
- You want to provide a default implementation for some methods.
- You need to declare non-public members (fields or methods).

Use Interface When:
- There is no shared/common code among classes, and they just need to conform to a contract.
- You want to achieve multiple inheritance.
- You want to create a lightweight, unifying contract for unrelated classes.
- In practice, you might also use a combination of abstract classes and interfaces based on the specific needs of your design.