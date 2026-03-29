Classes used Under this program:
--------------------------------
📌Address → It is a dependency class. It provides data or functionality that another class needs.
In our project, it is used by the Student class, so Spring creates its object and injects it where required.

📌Student → It is a main class(bean) that uses Address class as a dependency. Instead of creating Address manually, it receives it through constructor injection. 
This shows Dependency Injection, where Spring provides the required object (Address) to Student.

📌AppConfig → AppConfig is the configuration class that tells Spring how to set up the project. It uses @Configuration and @ComponentScan to tell Spring where to 
find components. Spring reads this class first and uses it to scan packages and create all required beans.

📌MainApp → MainApp is the starting point of the application. It contains the main() method. It creates the Spring container using AnnotationConfigApplicationContext.
From this container, we get the required bean (Student) and run the program.

    [Connection Flow]
    -----------------
MainApp (starts Spring container)
            |
AppConfig (provides configuration)
            |
ComponentScan (scans classes)
            |
Spring creates beans
            |
Spring injects dependencies
            |
Student runs using Address

==========================================================================================================================================================================

**[Under the 📌 MainApp.java class this coded line exist]

ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
--------------------------------------------------------------------------------------
"ApplicationContext" -> Means Spring Container / Spring's Brain.
"context" -> This is just a variable name, we can change it with any kind of names. it holds spring container. 
"new" -> It is used to create new objects. this time it is used to create spring container object.
"AnnotationConfigApplicationContext" -> This is a spring class. Create container using annotation-based configuration. 
                                       it tells spring works with annotation-based configuration like::
                                       @Component
                                       @ComponentScan
"(AppConfig.Class)" -> This is configuration class reference. It means, Read the configuration from this class (AppConfig.Class).
    Open 'AppConfig.Class'
            |
    check '@ComponentScan' 
            |
    Scan packages '(org.example)'
            |
    create 'beans' for that 



        📌Full meaning :
        ApplicationContext is the Spring container. 
        We create it using AnnotationConfigApplicationContext and 
        pass the configuration class so that Spring can scan and create all required beans.
