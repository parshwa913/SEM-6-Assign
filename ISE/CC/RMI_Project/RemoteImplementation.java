 
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteImplementation extends UnicastRemoteObject implements RemoteInterface {
    protected RemoteImplementation() throws RemoteException {
        super();
    }

    @Override
    public String sayHello(String name) throws RemoteException {
        return "Hola, soy Parshwa" + name + "! Welcome to RMI in Cloud Computing.";
    }
}
