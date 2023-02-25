import java.util.Scanner;

public class main3_2 {
    public static void main(String[] args) 
    {
        float principal;
        float interate ;
        
        Scanner scan = new Scanner(System.in);
        exercise3_2 process = new exercise3_2();

        System.out.print("Enter Principal : ");
        principal = scan.nextFloat();

        System.out.print("Enter Interate : ");
        interate = scan.nextFloat();
        
        process.setPrincipal(principal);
        process.setInterate(interate);
        process.cal();
    }
    
}