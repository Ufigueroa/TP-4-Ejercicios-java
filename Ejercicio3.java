import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the month: ");
        String month = scanner.nextLine();

        int days = 0;

        if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("March") ||
            month.equalsIgnoreCase("May") || month.equalsIgnoreCase("July") ||
            month.equalsIgnoreCase("August") || month.equalsIgnoreCase("October") ||
            month.equalsIgnoreCase("December")) {
            days = 31;
        } else if (month.equalsIgnoreCase("April") || month.equalsIgnoreCase("June") ||
                   month.equalsIgnoreCase("September") || month.equalsIgnoreCase("November")) {
            days = 30;
        } else if (month.equalsIgnoreCase("February")) {
            days = 28; // Assuming non-leap year
        } else {
            System.out.println("Invalid month");
            System.exit(0);
        }

        System.out.println("The month of " + month + " has " + days + " days.");

        scanner.close();
    }
}