import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            Factorial stub = (Factorial) registry.lookup("FactorialService");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            long result = stub.factorial(num);

            System.out.println("Factorial = " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}