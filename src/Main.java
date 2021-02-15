import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner workTime = new Scanner(System.in);
        int hour = workTime.nextInt();

        if (hour == 12) {
            System.out.println("It's time for lunch");
        } else if (hour >= 8 && hour <= 16) {
            System.out.println("You are at work");
        } else {
            System.out.println("You are at home");
        }

    }
}
