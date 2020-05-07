import java.util.ArrayList;

public class Warehouse
{
    private ArrayList <InventoryItem> items;

    public Warehouse()
    {
        items = new ArrayList <InventoryItem>();
    }

    public void addItem(InventoryItem item)
    {
        items.add(item);
    }

    // Part (b)
    // returns an ArrayList of all items whose price is between
    // loPrice and hiPrice inclusive
    public ArrayList<InventoryItem> getItems(double loPrice, double hiPrice)
    {
        ArrayList<InventoryItem> list = new ArrayList<>();
        for (InventoryItem item : items)
        {
            if(item.getPrice() >= loPrice && item.getPrice() <= hiPrice)
            {
                list.add(item);
            }
        }
        return list;
    }

    public String printInventory()
    {
        String output = "";

        for(InventoryItem item : items)
        {
            output += String.format(" %-6d",item.getID());
            output += String.format("%8.2f",item.getBasePrice());
            output += String.format("%8.2f\n",item.getPrice());
        }

        return output;
    }
}
