Object Oriented Programming Concept Questions

As you should know by now, there are 4 pillars of Object Oriented Programming.

********************
1. Encapsulation

Encapsulation is the idea of surrounding something, not just to keep the contents together but also to protect them. In OOP, this refers to the idea of taking our attributes and our operations and bundling them together in the same unit. We also want to restrict access to the inner working of that class or any instance of it, this is referred to as information hiding. The encapsulation principal is that an object should not reveal anything about itself except what is absolute necessary for others parts of application to work. For instance if we are creating a banking application in Java, we don’t want some other part of our application to be able to reach in and change the balance of any object without going through the deposit or the withdrawal behaviors, so we hide that attribute and control access to it so that it can only be accessed from inside the object itself.

abstract class BankAccount {
    String accountName;
    int accountNumber;
    private double accountBalance;

    public double withdraw(double withdrawalAmount) {
        return this.accountBalance -= withdrawalAmount;
    }
}

********************
2. Inheritance

Code inheritance is a great form of code reuse. It allows you to create multiple classes/objects with similar code, while still allowing you to change small amounts of the code for each class/object. For instance, we can create an employee class with attributes that every employee has, and then create classes for specific types of employees, sales people, designers, accountants, etc. All of these classes would inherit all of the attributes and operations that an employee has, and then would have some of their own, without having to rewrite every attribute and operation that every employee has.

class Employee {
    public String name;
    public String title;
    public double salary;

    public Employee(String name, String title, double salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }
}

class Designer extends Employee {
    public String[] adobeApplicationsSubscriptions;

    public Designer(String name, String title, double salary, String[] adobeApplicationsSubscriptions) {
        super(name, title, salary);
        this.adobeApplicationsSubscriptions = adobeApplicationsSubscriptions;
    }
}

********************
3. Abstraction

Abstraction is the process of showing only essential/necessary features of an entity/object to the outside world and hiding the other irrelevant information. It means to focus on the essential qualities of something rather than one specific example, to automatically discard what’s unimportant or irrelevant. For instance if we are creating a banking application in Java, instead of creating bank account classes for every customer and creating name, account number, and balance attributes for every class, you create an abstract bank account class that creates those attributes and then create classes for each customer that inherits those attributes.

abstract class BankAccount {
    String accountName;
    int accountNumber;
    double accountBalance;
}

class BobsAccount {
    private BobsAccount(String accountName, int accountNumber, double accountBalance) {
        super();
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    BobsAccount bobsAccount = new BobsAccount("Bob Driver's Checking", 02834899, 2876.19);
}

class KatsAccount {
    private BobsAccount(String accountName, int accountNumber, double accountBalance) {
        super();
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    KatsAccount katsAccount = new BobsAccount("Kat Adam's Checking", 68279304, 92809.28);
}

********************
4. Polymorphism
   
Polymorphism means “many forms”, it lets us automatically do the correct behavior even if what we’re working with could take one of many different forms. For example, method overriding. A method can be defined in a parent class and then redefined in the child class if the child needs slightly different behavior. Another form of polymorphism is method overloading, instead of defining multiple methods that do the same thing but take in or return different types, you can overload a single method.

static int addition(int x, int y) {
  return x + y;
}

static double addition(double x, double y) {
  return x + y;
}

The above code allows the user to use the addition method regardless of whether they are passing in ints or doubles as the arguments. It is one of the many forms of Polymorphism.

********************
Please write a 1-3 paragraphs explaining these 4 concepts further.  Please provide a sufficient enough explanation about these pillars, as well as some examples to illustrate the practical use cases of these principles.  



