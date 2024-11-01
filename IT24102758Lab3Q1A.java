import java.util.Scanner;


class IT24102758Lab3Q1A {
         public static void main(String[] args) {
             Scanner Scanner = new Scanner(System.in);

             System.out.print("Enter the price of 1kg pf rice: ");
             double price = Scanner.nextDouble();

             System.out.print("Enter the number of kilograms you want to buy: ");
             double number = Scanner.nextDouble();

             double totalAmount = price * number;
             System.out.printf("The total amount to pay is: %.2f%n", totalAmount);


         }
}