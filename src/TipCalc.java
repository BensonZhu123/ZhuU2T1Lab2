import java.util.Scanner;
import java.text.DecimalFormat;
    public class TipCalc {
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            DecimalFormat formatter = new DecimalFormat("#.##");
            System.out.println("Welcome to the tip calculator!");
            System.out.print("How many people are in your group? ");
            int totalPeople = scan.nextInt();
            System.out.print("What is the tip percentage? (1-100): ");
            int tipPercent = scan.nextInt();
            //introducing bill
            double bill = 0.00;
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            double price = scan.nextDouble();
            bill = bill + price;
            while (price != -1) {
                // while statement to add prices of items of bill
                System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
                price = scan.nextDouble();
                bill = bill + price;
            }
            //adding +1 to bill to negate the -1 to stop the while statement
            bill++;
            System.out.println("--------------------------");
            System.out.println("Total Bill Before Tip: " + bill);
            System.out.println("Tip Percentage: " + tipPercent);
            double totalTip = ((bill*100)/(100.0/tipPercent))/100;
            //formatting the total tip
            String formatTotalTip = formatter.format(totalTip);
            System.out.println("Total Tip: " + formatTotalTip);
            double totalBill = bill+totalTip;
            //formatting total bill
            String formatTotalBill = formatter.format(totalBill);
            System.out.println("Total Bill With Tip: " + (formatTotalBill));
            double personBefore = bill/totalPeople;
            //formatting cost per person before tip
            String formatPersonBefore = formatter.format(personBefore);
            System.out.println("Per Person Cost Before Tip: " + formatPersonBefore);
            double tipPerson = totalTip/totalPeople;
            //formatting tip per person
            String formatTipPerson = formatter.format(tipPerson);
            System.out.println("Tip Per Person: " + formatTipPerson);
            double totalCostPerson = (tipPerson + personBefore);
            //formatting total cost per person
            String formatTotalCostPerson = formatter.format(totalCostPerson);
            System.out.println("Total Cost Per Person: " + formatTotalCostPerson);
        }
    }

