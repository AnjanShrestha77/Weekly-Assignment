/**
 * InventoryMain
 *
 * Driver class to simulate flash sale purchase requests.
 */

public class InventoryMain {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        manager.addProduct("IPHONE15", 2);

        System.out.println(manager.purchase("IPHONE15", 1));
        System.out.println(manager.purchase("IPHONE15", 2));
        System.out.println(manager.purchase("IPHONE15", 3));

        System.out.println("Stock: " + manager.checkStock("IPHONE15"));
    }
}