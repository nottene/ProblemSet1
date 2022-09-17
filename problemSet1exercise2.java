import java.util.Scanner;
import java.text.DecimalFormat;

public class problemSet1exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".0");
        System.out.print("Input an hour value as an integer: ");
        int hour = input.nextInt();
        System.out.print("Input a minute value as an integer: ");
        int minute = input.nextInt();
        System.out.print("Input a second value as an integer: ");
        int second = input.nextInt();
        int numberOfSecondsSinceMidnight;
        numberOfSecondsSinceMidnight = hour * 3600 + minute * 60 + second;
        if (numberOfSecondsSinceMidnight > 24 * 3600) {
            System.out.println("There is an error in the time input.");
        } else {
            System.out.println("You typed in: " +hour+ ":" +minute+ ":" +second+".");
            System.out.println(numberOfSecondsSinceMidnight+ " seconds have passed since midnight.");
            int numberOfSecondsRemaining;
            numberOfSecondsRemaining = 24 * 60 * 60 - (hour * 3600 + minute * 60 + second);
            System.out.println("There are " +numberOfSecondsRemaining+ " seconds remaining in the day.");
            double percentageOfDayPassed;
            percentageOfDayPassed = (hour * 3600.0 + minute * 60.0 + second) / (24.0 * 60.0 * 60.0) * 100.0;
            System.out.print(df.format(percentageOfDayPassed)+ "% of the day has passed.");
        }
    }
}
