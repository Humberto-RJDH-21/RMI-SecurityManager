import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

public class SaludoCliente{
    public static void main(String[] args){
        String url="//localhost/";

        System.setSecurityManager(new RMISecurityManager());

        try{     
            String[] servicios=Naming.list(url);

            for(int i=0;i<servicios.length;i++){
                System.out.println(servicios[i]);            
            }   

            Saludo sal=(Saludo) Naming.lookup(url+"Saludo");

            String mensaje=sal.getMensaje();

            System.out.println(mensaje);
        }catch(RemoteException re){
            re.printStackTrace();
        }catch(MalformedURLException me){
            me.printStackTrace();
        }catch(NotBoundException nbe){
            nbe.printStackTrace();
        }
    }
}