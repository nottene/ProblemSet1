import java.util.Scanner;

public class problemSet1exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a second value as an integer: ");
        int seconds = input.nextInt();
        System.out.println("You typed in " +seconds+ " seconds.");
        int hour;
        int minute;
        int second;
        hour = seconds / 3600;
        minute = (seconds % 3600) / 60;
        second = (seconds % 3600) % 60;
        System.out.println(seconds+ " seconds = " +hour+ " hours, " +minute+ " minutes, and " +second+ " seconds.");
    }
}
