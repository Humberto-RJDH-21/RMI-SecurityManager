import java.rmi.server.*;
import java.rmi.*;

public class SaludoImpl extends UnicastRemoteObject implements Saludo{
    private String cadena;
    
    public SaludoImpl() throws RemoteException{
        cadena = "Mensaje desde el servidor RMI";
    }
    
    public String getMensaje() throws RemoteException{
        return cadena;
    }
}