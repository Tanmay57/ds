import java.rmi.*;
import java.rmi.server.*;

public class ServerImplementation extends UnicastRemoteObject implements ServerInterface {

    public ServerImplementation() throws RemoteException{

    }

    @Override
    public double addition(double n1, double n2) throws RemoteException{
        return n1+n2;
    }
}
