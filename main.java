package combineAll;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you married? (true/false): ");
        boolean isMarried = scanner.nextBoolean();

        UserDetails userDetails = new UserDetails(name, income, age, isMarried);
        TaxCalculation taxCalculation = new TaxCalculation(userDetails);
        double tax = taxCalculation.calculateTax();

        System.out.printf("%s, your calculated tax is: $%.2f%n", userDetails.getAge(), tax);
        
        scanner.close();
    }
}





