import java.util.Scanner;

public class main3_1 {
    public static void main(String[] args) 
    {
        Double cel;
        Double fah;

        Scanner scan = new Scanner(System.in);
        exercise3_1 process = new exercise3_1();

        System.out.print("Enter Celsius : ");
        cel = scan.nextDouble();

        process.setCelcius(cel);
        process.cal();
        System.out.print("Fahrenheit = " + process.dis());
    }
}
