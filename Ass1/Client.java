import java.rmi.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try{

            String serverUrl = "rmi://localhost/Server";
            ServerInterface serverInterface = (ServerInterface) Naming.lookup(serverUrl);

            System.out.println("Enter two numbers");

            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            System.out.println(serverInterface.addition(n1, n2));
        }catch(Exception e){
            System.out.println("Exception is "+e);
        }
    }
}
