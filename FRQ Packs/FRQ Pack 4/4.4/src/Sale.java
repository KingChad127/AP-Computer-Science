public class Sale extends Transaction
{
    private double myItemDiscount;
    private double savings = 0.0;

    public Sale(String description, int numItems, double itemCost, double discount)
    {
        super(description, numItems, itemCost);
        myItemDiscount = discount;
    }

    //calculates the cost of an item on sale
    public double getSaleTotal()
    {
        double cost = getNumItems() * getItemCost();
        savings = myItemDiscount * cost;
        double afterDiscount = cost - savings;
        double tax = afterDiscount * TAX_RATE;
        return afterDiscount + tax;
    }



    public String toString()
    {
        String str = "";
        str = "Description      : " + getDescription() + "\n" +
                "Quantity         : " + getNumItems()  + "\n" +
                "Cost             : " + getItemCost()  + "\n" +
                "Total Cost       : " + getSaleTotal() + "\n" +
                "Discount Savings : " + savings + "\n";
        return str;
    }
}
