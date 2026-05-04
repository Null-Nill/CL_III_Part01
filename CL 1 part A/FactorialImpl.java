import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class FactorialImpl extends UnicastRemoteObject implements Factorial {

    public FactorialImpl() throws RemoteException {
        super();
    }

    public long factorial(int n) throws RemoteException {
        long result = 1;
        for(int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}