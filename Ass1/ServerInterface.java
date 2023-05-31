import java.rmi.*;

interface ServerInterface extends Remote {

    public double addition(double n1, double n2) throws RemoteException;
}