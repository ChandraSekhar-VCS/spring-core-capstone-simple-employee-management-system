# Spring Core Capstone Project
This project demonstrates a comprehensive hands-on mastery of the **Spring Core module** using real-world enterprise patterns. 
It includes all major features of Spring Core, including Bean Scopes, Dependency Injection styles, Profiles, `@Value`, SpEL, Component Scanning, and Lifecycle Callbacks.

## 📁 Project Structure
com.chandrasekhar.springcore.capstone
├── config/ # Spring @Configuration class
├── controller/ # Application entry controller
├── env/ # Environment-specific @Profile-based beans
├── model/ # Domain model (Employee)
├── repository/ # Simulated repository layer
├── service/ # Business logic & notification service
├── util/ # Utility class for SpEL expressions
└── main/ # Main Application bootstrap class

## 🔧 Technologies Used
- Java 21
- Spring Framework 6.2.x (Core, Context)
- Annotation-based configuration
- Maven

## ✅ Features Demonstrated
- `@Component`, `@Service`, `@Repository`, `@Controller` stereotypes
- Constructor, Setter, and Field-based Dependency Injection (`@Autowired`)
- Java-based configuration using `@Configuration` and `@Bean`
- Prototype scope with manual injection via `ApplicationContext`
- Environment-based profiles using `@Profile`
- Property injection with `@Value` (from `application.properties`)
- Spring Expression Language (SpEL)
- Lifecycle methods: `@PostConstruct`, `@PreDestroy`
- Manual lifecycle with `initMethod`, `destroyMethod`
- Clean separation of concerns using a layered architecture

## 🚀 Running the Application
1. **Set profile in main class:**
   ```java
   context.getEnvironment().setActiveProfiles("dev"); // or "prod"
2. Run the MainApp
    CapstoneApp.main()
