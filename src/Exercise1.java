import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDateInput = scanner.nextLine();

        String[] dateParts = shortDateInput.split("-");

        if (dateParts.length == 3) {
            try {
                int year = Integer.parseInt(dateParts[0]);
                int month = Integer.parseInt(dateParts[1]);
                int day = Integer.parseInt(dateParts[2]);

                if (month >= 1 && month <= 12) {
                    String monthName = getMonth(month);
                    System.out.println("Full Date Representation: " + monthName + " " + day + ", " + year);
                } else {
                    System.out.println("Invalid month. Month should be between 1 and 12.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid date format. Please enter numeric values for year, month, and day.");
            }
        } else {
            System.out.println("Invalid date format. Please enter the date in YYYY-MM-DD format.");
        }

        scanner.close();
    }

    private static String getMonth(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        return monthNames[month - 1];
    }
}