import java.util.Scanner;

public class main3_3 {
    public static void main(String[] args) {
        int num,  num1, num2, num3, num4;

        Scanner scan = new Scanner(System.in);
        exercise3_3 process = new exercise3_3();

        System.out.print("Enter Number : ");
        num = scan.nextInt();

        process.setNum(num);
        process.cal();
        process.dis();
    }
}
