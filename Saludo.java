import java.rmi.*;
public interface Saludo extends Remote{
    
    public String getMensaje() throws RemoteException;
}