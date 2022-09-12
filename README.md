# Creator: Rasandeep Singh Panag

## General Concept:
Created the concept of ATM machine by using the Java language. After running this code the user will have to add your ATM # and pin; if the given information is correct than it will let show the user the multiple selections where you can view your statement, deposit money, withdraw money, or view mini-statement. It is following concept of Object-Oriented Programming i.e. **Data abstraction**

**There are two arrays used to store ATM # and pin #. Without correct ATM number and PIN, the code will not executed completely. The ATM # and PIN stored are given below: **

| ATM NUMBER | PIN |
| --- | --- |
| 406417 | 5555 |
| 656668 | 7777 |
| 86689853 | 6666 |
| 989898 | 8888 |
| 5656656 | 9999 |
| 575859 | 1313 |
| 607080 | 4444 |
| 9090100 | 1111 |


## Java features used:

- **HashMap**: class which is used to perform operations such as inserting, deleting and locating elements in a map.
- **Map**: an object that maps keys to values. A map cannot contain duplicate keys: Each key can map to at most one value. It models the mathematical function abstraction.  
- **if else loop**: Use if to specify a block of code to be executed, if a specified condition is true. Use else to specify a block of code to be executed, if the same condition is false. Use else if to specify a new condition to test, if the first condition is false.  
- **while loop**: a control flow statement that allows code to be executed repeatedly based on a given Boolean condition. The while loop can be thought of as a repeating if statement. While loop in Java comes into use when we need to repeatedly execute a block of statements.  
- **break**: used to break out a for loop, a while loop or a switch block.  
- **for loop**: a repetition control structure that allows you to efficiently write a loop that needs to be executed a specific number of times. A for loop is useful when you know how many times a task is to be repeated.  
- **interface**: an abstract type used to specify the behavior of a class. An interface in Java is a blueprint of a class. A Java interface contains static constants and abstract methods. The interface in Java is a mechanism to achieve abstraction.
- **object**: a member (also called an instance) of a Java class.  
- **class**: a user-defined type that describes what a certain type of object will look like
- **implement**: keyword is used to implement an interface.  
- **Scanner**: class is used to get user input, and it is found in the java.util package.  
- **arrays**: a container object that holds a fixed number of values of a single type.
- **Constructor**: a special method that is used to initialize objects. The constructor is called when an object of a class is created.  
- **getter-setter method**: are used to protect your data, particularly when creating classes. For each instance variable, a getter method returns its value while a setter method sets or updates its value.  
- **Data Abstraction**: hiding the unnecessary details from the users. Abstraction is selecting data from a larger pool to show only relevant details of the object to the user. It helps in reducing programming complexity and efforts.
- **static constants**: there will be only one copy of the constant for that class (i.e., one copy per class). Therefore, if the constant has only one value, it should declared static.  

## Repository Contains:
- **Main.java** is main class that is getting input and showing the output to the user by running code in all the other classes.
- **theinterface.java** is the interface class which contains static constants and abstract methods.
- **implementation.java** is the class that is used to implement the interface and where all mathematical calculations of deposit and withdraw of money is done. It also contains Map that is used to get and set the transaction in the account of user.
- **MainAtmClass.java** contains constructor and all getter setter methods.
- **ScreenShotOfCodeRunning** contains screen shot of all running code with correct ATM # and pin #

## Other Relevant information:
- All the classes are created by using Java programming language.
- Software used is *Eclipse* to create and implement the code.
