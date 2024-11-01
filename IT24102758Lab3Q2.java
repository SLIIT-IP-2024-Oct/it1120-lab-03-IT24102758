import java.util.Scanner;


class IT24102758Lab3Q2 {
         public static void main(String[] args) {
             Scanner Scanner = new Scanner(System.in);

             System.out.println("Enter the monthly salary: ");
             double monthlySalary = Scanner.nextDouble();
   
             System.out.println("Enter the number of ot hours: ");
             double otHours = Scanner.nextDouble();

             System.out.println("Enter the ot hourly rate: ");
             Double otRate = Scanner.nextDouble();
   
             double otAmount = otHours * otRate;

             double totalSalary = monthlySalary + otAmount;

             System.out.printf("ot Amount: %.2f\n",otAmount);
             System.out.printf("Total salary: %.2f\n",totalSalary);

         }
}