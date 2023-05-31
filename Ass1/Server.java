import java.rmi.*;
public class Server{

    public static void main(String[] args) {
        try{
            ServerImplementation s1 = new ServerImplementation();
            Naming.rebind("Server", s1);
           

        }catch(Exception e){
            System.out.println("Exception is "+e);
        }
    }
}