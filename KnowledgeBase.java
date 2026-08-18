import java.util.HashMap;
import java.util.Map;

// Manages predefined chatbot knowledge and responses.
public class KnowledgeBase {

    // Stores keywords and their corresponding responses.
    private Map<String, String> responses;

    // Initializes the chatbot knowledge base.
    public KnowledgeBase() {

        responses = new HashMap<>();

        // General conversation responses.

        responses.put(
            "hello",
            "Hello! I'm Nova, your Full Stack Java learning assistant. "
            + "How can I help you?"
        );

        responses.put(
            "hi",
            "Hi! Nice to meet you. What would you like to learn today?"
        );

        responses.put(
            "hey",
            "Hey! I'm Nova. Ready to learn Full Stack Java?"
        );

        responses.put(
            "nice to meet you",
            "Nice to meet you too! I'm excited to learn and build with you."
        );

        responses.put(
            "what are you doing",
            "I'm here helping you learn Java, web development, databases, "
            + "Git, and Full Stack development."
        );

        responses.put(
            "your name",
            "My name is Nova. I'm a rule-based Full Stack Java learning assistant."
        );

        responses.put(
            "who are you",
            "I'm Nova, a Java-based rule-driven chatbot designed to help "
            + "with Full Stack Java development."
        );

        responses.put(
            "help",
            "I can answer questions about Java, OOP, HTML, CSS, JavaScript, "
            + "Spring Boot, databases, Git, GitHub, REST APIs, and Full Stack development."
        );

        // Java programming concepts.

        responses.put(
            "java",
            "Java is a class-based, object-oriented programming language "
            + "widely used for application and backend development."
        );

        responses.put(
            "developed java",
            "Java was developed by James Gosling and his team at Sun Microsystems. "
            + "It was first released in 1995."
        );

        responses.put(
            "oop",
            "OOP stands for Object-Oriented Programming. Its four main "
            + "concepts are Encapsulation, Inheritance, Polymorphism, and Abstraction."
        );

        responses.put(
            "class",
            "A class is a blueprint used to create objects. It can contain "
            + "variables, constructors, and methods."
        );

        responses.put(
            "object",
            "An object is an instance of a class. It represents a real or "
            + "logical entity and contains state and behavior."
        );

        responses.put(
            "inheritance",
            "Inheritance allows one class to acquire properties and methods "
            + "from another class. In Java, it is commonly implemented using "
            + "the extends keyword."
        );

        responses.put(
            "polymorphism",
            "Polymorphism means one interface or method name can have "
            + "different behaviors. Java supports compile-time and runtime polymorphism."
        );

        responses.put(
            "encapsulation",
            "Encapsulation means bundling data and methods together and "
            + "controlling access to the data using access modifiers such as private."
        );

        responses.put(
            "abstraction",
            "Abstraction means hiding implementation details and exposing "
            + "only essential functionality. Java uses abstract classes and "
            + "interfaces for abstraction."
        );

        responses.put(
            "exception handling",
            "Exception handling manages runtime errors using mechanisms "
            + "such as try, catch, finally, throw, and throws."
        );

        responses.put(
            "arraylist",
            "ArrayList is a resizable array implementation in Java. "
            + "It belongs to the Java Collections Framework."
        );

        responses.put(
            "hashmap",
            "HashMap stores data as key-value pairs and provides efficient "
            + "lookup based on keys."
        );

        responses.put(
            "multithreading",
            "Multithreading allows multiple threads to execute tasks "
            + "concurrently within a program."
        );

        // Frontend development concepts.

        responses.put(
            "html",
            "HTML stands for HyperText Markup Language. It provides "
            + "the structure and content of web pages."
        );

        responses.put(
            "css",
            "CSS stands for Cascading Style Sheets. It controls the styling, "
            + "layout, and visual appearance of web pages."
        );

        responses.put(
            "javascript",
            "JavaScript is a programming language commonly used to add "
            + "interactivity and dynamic behavior to web pages."
        );

        responses.put(
            "frontend",
            "Frontend development focuses on the part of an application "
            + "that users see and interact with, commonly using HTML, CSS, "
            + "and JavaScript."
        );

        responses.put(
            "dom",
            "DOM stands for Document Object Model. It represents an HTML "
            + "document as a tree of objects that JavaScript can access and modify."
        );

        // Backend development concepts.

        responses.put(
            "backend",
            "Backend development handles server-side logic, data processing, "
            + "APIs, authentication, and communication with databases."
        );

        responses.put(
            "jdbc",
            "JDBC stands for Java Database Connectivity. It allows Java "
            + "applications to connect and interact with relational databases."
        );

        responses.put(
            "servlet",
            "A Java Servlet is a server-side Java component used to handle "
            + "requests and generate responses in web applications."
        );

        responses.put(
            "rest api",
            "A REST API allows applications to communicate over HTTP using "
            + "resources and methods such as GET, POST, PUT, and DELETE."
        );

        responses.put(
            "api",
            "API stands for Application Programming Interface. It defines "
            + "how different software components communicate with each other."
        );


        responses.put(
        "springboot",
        "Spring Boot is a Java framework that simplifies Spring application development with auto-configuration, starter dependencies, and an embedded server."
);
        responses.put(
            "spring",
            "Spring is a Java framework that provides infrastructure "
            + "for building enterprise applications."
        );

        responses.put(
            "hibernate",
            "Hibernate is an ORM framework for Java that maps Java "
            + "objects to relational database tables."
        );

        responses.put(
            "jpa",
            "JPA stands for Java Persistence API. It provides a standard "
            + "way to manage relational data using Java objects."
        );

        responses.put(
            "maven",
            "Maven is a build and dependency management tool commonly "
            + "used in Java projects."
        );

        // Database concepts.

        responses.put(
            "sql",
            "SQL stands for Structured Query Language. It is used to "
            + "create, read, update, and manage data in relational databases."
        );

        responses.put(
            "database",
            "A database is an organized collection of data that can be "
            + "stored, managed, and retrieved efficiently."
        );

        responses.put(
            "mysql",
            "MySQL is a popular relational database management system "
            + "that uses SQL."
        );

        responses.put(
            "postgresql",
            "PostgreSQL is an open-source object-relational database "
            + "management system known for reliability and advanced SQL features."
        );

        responses.put(
            "primary key",
            "A primary key uniquely identifies each record in a database table."
        );

        responses.put(
            "foreign key",
            "A foreign key is a column or set of columns that creates a "
            + "relationship between tables by referencing a key in another table."
        );

        responses.put(
            "crud",
            "CRUD stands for Create, Read, Update, and Delete. These are "
            + "the four basic operations commonly performed on stored data."
        );

        responses.put(
            "join",
            "A SQL JOIN combines related rows from two or more tables "
            + "using a related column."
        );

        // Git and GitHub concepts.

        responses.put(
            "git",
            "Git is a distributed version control system used to track "
            + "changes in source code and collaborate on software projects."
        );

        responses.put(
            "github",
            "GitHub is a platform for hosting Git repositories, collaborating "
            + "on code, managing issues, and reviewing changes."
        );

        responses.put(
            "git commit",
            "git commit saves your staged changes as a new commit "
            + "in the local Git repository."
        );

        responses.put(
            "git push",
            "git push uploads your local commits to a remote repository "
            + "such as GitHub."
        );

        responses.put(
            "git pull",
            "git pull downloads changes from a remote repository and "
            + "integrates them into your current local branch."
        );

        // Full Stack development concepts.

        responses.put(
            "full stack",
            "Full Stack development involves both frontend and backend "
            + "development, along with databases, APIs, version control, "
            + "and deployment."
        );

        responses.put(
            "full stack java",
            "A Full Stack Java developer commonly works with Java and "
            + "Spring Boot on the backend, HTML, CSS, and JavaScript on "
            + "the frontend, databases, REST APIs, Git, and deployment tools."
        );

        responses.put(
            "mvc",
            "MVC stands for Model-View-Controller. It separates application "
            + "data, user interface, and application control logic."
        );

        responses.put(
            "authentication",
            "Authentication verifies who a user is, usually through "
            + "credentials, tokens, or another identity mechanism."
        );

        responses.put(
            "authorization",
            "Authorization determines what an authenticated user is "
            + "allowed to access or perform."
        );

        responses.put(
            "jwt",
            "JWT stands for JSON Web Token. It is commonly used to "
            + "represent claims between parties and is often used for authentication."
        );

        // Internship-related responses.

        responses.put(
            "codealpha",
            "This chatbot is being developed as Task 3 of my "
            + "CodeAlpha Java Programming Internship."
        );
    }

    // Returns the response associated with a keyword.
    public String getResponse(String key) {
        return responses.get(key);
    }

    // Checks whether a keyword exists in the knowledge base.
    public boolean hasResponse(String key) {
        return responses.containsKey(key);
    }
}