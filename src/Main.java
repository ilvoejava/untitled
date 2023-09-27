import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your bill: ");
        Double bill = scan.nextDouble();

        System.out.print("Please enter your tip (percent): ");
        double tip = scan.nextDouble();
        tip = tip * 0.01; // multiplies tip by 0.01 to make it a percentage

        System.out.print("Please enter the total number of people: ");
        int people = scan.nextInt();

        Double total = bill + (bill * tip); // total bill including tip
        Double totalTip = bill * tip; // total tip
        Double tpp = totalTip / people; // tip per person
        Double perPerson = total / people; // total per person

        total = Math.round(total * 100.0) / 100.0;
        totalTip = Math.round(totalTip * 100.0) / 100.0;
        tpp = Math.round(tpp * 100.0) / 100.0;
        perPerson = Math.round(perPerson * 100.0) / 100.0;

        System.out.println("Your total tip amount is: $" + totalTip);
        System.out.println("Your total bill including tip is: $" + total);
        System.out.println("The tip per person is: $" + tpp);
        System.out.println("Your total per person is: $" + perPerson);

    }
}