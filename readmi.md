Project Overview.

This project is a transportation management system. Written in Java, it utilizes core object-oriented programming concepts such as inheritance, abstraction, composition, and aggregation.

The system includes various vehicles, such as cars, motorcycles, and trucks, modeled using an abstract superclass, Vehicle. All vehicles share common properties such as make and year, but each also has its own unique properties.

Furthermore, vehicles are associated with drivers, demonstrating object relationships in OOP.



Class Hierarchy and Design
Abstract Superclass — Vehicle
Vehicle is an abstract class that represents a general vehicle.
Fields:
brand (String)
year (int)
These fields are declared as protected so they can be accessed by subclasses but not directly from outside the class.

Methods:
startEngine() — abstract
stopEngine() — abstract
displayInfo() — concrete method that prints the brand and year
The abstract methods force all subclasses to provide their own engine behavior, while displayInfo() is shared by all vehicles.

Subclasses:

Car. Inherits from Vehicle.
Additional fields: doors, fuelType
Overrides startEngine() and stopEngine()

Motorcycle. Inherits from Vehicle
Additional field: hasSidecar
Overrides startEngine() and stopEngine()

Truck. Inherits from Vehicle
Additional fields: capacity, numAxles
Overrides startEngine() and stopEngine()

Each subclass uses constructor chaining with the super keyword to initialize common fields from the Vehicle class.

Driver Class (Composition & Aggregation)
The Driver class represents a vehicle driver.

Fields:
name and licenseNumber.

Method:
displayDriverInfo()

Object Relationships
Each Vehicle has a Driver → this is composition
One Driver can be assigned to multiple vehicles → this demonstrates aggregation



Main Program Logic
In Main.java:
Objects of Car, Motorcycle, and Truck are created
One or more Driver objects are created
Drivers are assigned to vehicles
All vehicles are stored in an array of type Vehicle[]
A loop is used to:
Start the engine
Display vehicle information
Display driver information
Stop the engine


How to Compile and Run
javac *.java
java Main


Reflection

Using inheritance significantly simplified the design, as data was duplicated in each Vehicle class.
This reduced code repetition and improved readability.

Overriding methods allowed each vehicle type to have its own engine behavior while using the same interface.
One of the challenges was understanding the difference between protected and default access modifiers. Understand abstractions and inheritance in general.