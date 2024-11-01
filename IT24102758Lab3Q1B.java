import java.util.Scanner;


class IT24102758Lab3Q1B {
         public static void main(String[] args) {
             Scanner Scanner = new Scanner(System.in);

             System.out.print("Enter the price of 1kg of rice: ");
             double priceperKg = Scanner.nextDouble();

             System.out.print("Enter the number of kilograms you want to buy: ");
             double numbersOfKgs = Scanner.nextDouble();

             double totalAmount = priceperKg * numbersOfKgs;
          
             double Discount = totalAmount * 0.10;

             double amountAfterDiscount = totalAmount - Discount;

             System.out.printf("The amount before discount: %.2f\n", totalAmount);
             System.out.printf("Amount to pay after 10%% discount: %.2f\n", amountAfterDiscount);


         }
}