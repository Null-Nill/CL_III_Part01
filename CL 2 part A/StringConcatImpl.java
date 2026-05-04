import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class StringConcatImpl extends UnicastRemoteObject implements StringConcat {

    public StringConcatImpl() throws RemoteException {
        super();
    }

    public String concat(String a, String b) throws RemoteException {
        return a + b;
    }
}