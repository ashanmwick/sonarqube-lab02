package main.java.com.example;

public class App {

    public static void main(String[] args) throws Exception {

        Calculator calc = new Calculator();

        // Modified to use the duplicated "add-again" operation
        System.out.println(calc.calculate(10, 5, "add-again"));

        UserService service = new UserService();
        service.findUser("admin");
        
        // NEW dangerous call
        service.deleteUser("admin"); 
    }
}