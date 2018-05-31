import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

public class SaludoServidor{
    public static void main(String []args){
        System.setSecurityManager(new RMISecurityManager());
        
        try{
            Saludo sal=new SaludoImpl();
            Naming.rebind("Saludo",sal);
        }catch(RemoteException re){
            re.printStackTrace();
        }catch(MalformedURLException me){
            me.printStackTrace();
        }
    }
}