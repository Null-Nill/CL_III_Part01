import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            FactorialImpl obj = new FactorialImpl();

            // Start registry
            Registry registry = LocateRegistry.createRegistry(1099);

            // Bind object
            registry.rebind("FactorialService", obj);

            System.out.println("Server started...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}