import java.util.*;
public class BerkeleyAlgo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Clocks : ");
        int numNodes = sc.nextInt();
        
        double[] localClocks = new double[numNodes];
        
        for(int i=0; i<numNodes; i++){
            System.out.println("Enter the clock values of clock "+i+" : ");
            localClocks[i] = sc.nextDouble();
        }
        
        double master = localClocks[0];
        
        double diff = 0;
        for(int i=0; i<numNodes; i++){
            diff = diff + (localClocks[i] - master);
        }
        System.out.println("Every clock to be synchronized by : "+(diff/numNodes)+" minutes ");
        
        
        
        for(int i=0; i<numNodes; i++){
            System.out.println("New clock timings are : "+(localClocks[i]+(diff/numNodes)));
        }
        
        
    }
    
}
