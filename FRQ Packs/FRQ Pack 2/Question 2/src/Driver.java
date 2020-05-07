public class Driver
{
    public static void main(String[] args)
    {
        MasterOrder goodies = new MasterOrder();
        goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
        goodies.addOrder(new CookieOrder("Shortbread", 5));
        goodies.addOrder(new CookieOrder("Macaroon", 2));
        goodies.addOrder(new CookieOrder("Macaroon", 6));
        goodies.addOrder(new CookieOrder("Snickerdoodle", 3));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 3));

        System.out.println(goodies);
        System.out.println("Number of Boxes = " + goodies.getTotalBoxes());
        System.out.println();System.out.println();

        System.out.println("Removing: Chocolate Chip");
        goodies.removeVariety("Chocolate Chip");

        System.out.println(goodies);
        System.out.println("Number of Boxes = " + goodies.getTotalBoxes());
        System.out.println();System.out.println();

        System.out.println("Removing: Brownie");
        goodies.removeVariety("Brownie");

        System.out.println(goodies);
        System.out.println("Number of Boxes = " + goodies.getTotalBoxes());
        System.out.println();System.out.println();

        System.out.println("Removing: Macaroon");
        goodies.removeVariety("Macaroon");

        System.out.println(goodies);
        System.out.println("Number of Boxes = " + goodies.getTotalBoxes());
        System.out.println();System.out.println();
    }
}
