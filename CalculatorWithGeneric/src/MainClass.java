import java.util.Scanner;

public class MainClass {
    public static void main(String arg[])
    {
        Double num1=0.0,num2=0.0;
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("Enter the num1");
            num1= scanner.nextDouble();
            System.out.println("Enter the num2");
            num2= scanner.nextDouble();

            NumberCalculator calculator=new NumberCalculator();
            System.out.println("The addition of two numbers is: " +calculator.add(num1,num2));
            System.out.println("The substraction of two numbers is: " +calculator.substract(num1, num2));
            System.out.println("The division of two numbers is: " +calculator.division(num1, num2));
            System.out.println("The product of two numbers is: " +calculator.multiplication(num1, num2));

        }
        catch (Exception e) {
            System.out.print("Your input is invalid, please try again"+e);
        }

    }
}
