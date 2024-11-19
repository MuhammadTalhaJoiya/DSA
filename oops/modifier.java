class Employee{
    public String name;
    private String email;
    protected String company;
    String address;
    public void Getter(){
        System.out.println(this.email);
    }
    public void Setter(String email){
        this.email=email;
    }
}
public class modifier {
    public static void main(String arg[]){
        Employee obj1=new Employee();
        obj1.name="ALi";
        // obj1.email="talhajoiyamuhammad@gmail.com";
        obj1.Setter("talhajoiyamuhammad@gmail.com");
        obj1.Getter();
        obj1.company="stap";
        obj1.address="Lsad";
    }
}


// Here’s a comprehensive explanation of the **four access modifiers in Java** with all the details combined for clarity:

// ---

// 1. **`public`**  
//    - **Access Level**: Visible to all classes, whether they are in the same package or a different package.  
//    - **Scope**: Accessible from anywhere in the program.  
//    - **Usage**: Use `public` to make a class, method, or variable universally accessible. For example, commonly used utility classes or methods are often declared as `public`.  

// ---

// 2. **`default`** (Package-Private)  
//    - **Access Level**: If no access modifier is specified, the member or class is considered to have **default access**.  
//    - **Scope**: Accessible only within the **same package** and **not accessible** from outside the package.  
//    - **Usage**: It is automatically applied when no modifier is specified. Use `default` access when you want to restrict access to a group of related classes within the same package.  

// ---

// 3. **`protected`**  
//    - **Access Level**:  
//      - Accessible within the same package (like `default`).  
//      - Accessible outside the package, but **only through inheritance** (i.e., by subclasses).  
//    - **Scope**: In the package itself and via subclass objects outside the package.  
//    - **Usage**: Use `protected` when you want to allow subclass access while restricting access from unrelated classes. It is especially useful in inheritance scenarios.  

// ---

// 4. **`private`**  
//    - **Access Level**:  
//      - Accessible only **within the same class**.  
//      - It cannot be accessed directly from outside the class, even by classes in the same package.  
//    - **Scope**: Strictly limited to the defining class.  
//    - **Usage**: Use `private` to enforce encapsulation by hiding sensitive data or internal implementation details. Even though it is inaccessible directly, it can be accessed **indirectly** through public getter and setter methods.  

// ---

// ### Additional Notes:
// 1. **`default` modifier**: Unlike the other modifiers, `default` does not require a keyword—it is the **absence of a modifier** that makes it package-private.  
// 2. **`protected` modifier**: It is broader than `default` because it allows access in subclasses located in different packages.  
// 3. **`private` modifier**: Though `private` members are not directly accessible, public methods within the class can act as intermediaries (e.g., getters and setters).  

// ---

// Let me know if you'd like this summarized in a table for easier visualization! 😊