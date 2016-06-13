public class Arithmetic {
// Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent 
// (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Calculate Tax and Tip:
        double tip = mealCost * tipPercent / 100; // mixed double and int -- int converted to double
        double tax = mealCost * taxPercent / 100;
        
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost + tax + tip); // cast return-value (long) to (int)
      
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
