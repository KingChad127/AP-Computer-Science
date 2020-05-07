import java.util.*;

public class Perishable extends InventoryItem
{
    private Date expire;
    public Perishable(Date entry, double price, Date expire)
    {
        super(entry, price);
        this.expire = expire;
    }

    public double getPrice()
    {
        int result = this.getEntryDate().compareTo(expire);
        if(result > 0)
        {
            double startingPrice = super.getBasePrice();
            return (double) startingPrice * 0.10;
        }
        return super.getBasePrice();
    }
}