import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StringConcat extends Remote {
    String concat(String a, String b) throws RemoteException;
}