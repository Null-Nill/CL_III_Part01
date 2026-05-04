import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Factorial extends Remote {
    long factorial(int n) throws RemoteException;
}