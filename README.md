# Java learning workspace

Open this whole folder in VS Code. Work through `module1` in number order. The numbered **folders** give the lessons an order while each Java filename still matches its public class.

| Order | Module 1 lesson | Main idea |
| --- | --- | --- |
| 01 | [ClassesAndObjects.java](module1/01-classes-and-objects/ClassesAndObjects.java) | Fields, methods, and objects |
| 02 | [Constructors.java](module1/02-constructors/Constructors.java) | Giving an object starting values |
| 03 | [Encapsulation.java](module1/03-encapsulation/Encapsulation.java) | Private fields, getters, and setters |
| 04 | [ShapeAreas.java](module1/04-constructor-overloading/ShapeAreas.java) | Multiple constructors for different inputs |
| 05 | [Inheritance.java](module1/05-inheritance/Inheritance.java) | A subclass using a parent class |
| 06 | [CompileTimePolymorphism.java](module1/06-compile-time-polymorphism/CompileTimePolymorphism.java) | Method overloading with different parameter lists |

The shape example is mainly **constructor overloading**. It also hides calculation details from the caller, but it does not use Java's `abstract` keyword yet.

`practice-questions` keeps the original `problem1` to `problem7` sequence. `problem7.java` is an empty draft. `extra-practice` contains the smaller independent exercises, with numbered folders for their suggested order. `EvenOrOdd.java` currently prints “Hello, world!” and `LargestOfTwo.java` has an empty main method; they are still works in progress. `Swap.java` is empty. `lab-exercises` is ready for future class exercises.

## Run a program

With a `.java` file open, use **Run Code** in VS Code. This workspace configures Code Runner to compile into `.build` and open a terminal, so programs using `Scanner` can accept input. `*.class` and `.build` are ignored by Git.

You can also run a file from PowerShell at the workspace root:

```powershell
.\run-java.ps1 .\module1\01-classes-and-objects\ClassesAndObjects.java
.\run-java.ps1 .\practice-questions\problem1.java
```

The output for each file gets its own folder under `.build`, so helper classes with similar names cannot clash. If you use `javac File.java` directly, Java will put `.class` files beside that source file; use `run-java.ps1` or **Run Code** to keep them separate.
