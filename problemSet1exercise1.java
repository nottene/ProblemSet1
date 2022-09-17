import java.util.Scanner;

public class problemSet1exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature in Celcius: ");
        double tempC = input.nextDouble();
        System.out.println("You typed in " + tempC + ".");
        double tempF;
        tempF = tempC * 9.0 / 5.0 + 32;
        System.out.println(tempC+ " degrees Celcius = " +tempF+ " degrees Fahrenheit");
    }
}