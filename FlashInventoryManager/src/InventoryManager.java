import java.util.*;

/**
 * InventoryManager
 *
 * Description:
 * Manages product inventory during flash sales.
 * Uses HashMap for quick stock lookup and
 * Queue to maintain waiting list.
 *
 * @author anjan
 * @version 2.0
 */

public class InventoryManager {

    private Map<String, Integer> stock = new HashMap<>();
    private Map<String, Queue<Integer>> waitingList = new HashMap<>();

    public void addProduct(String product, int quantity) {

        stock.put(product, quantity);
        waitingList.put(product, new LinkedList<>());
    }

    public synchronized String purchase(String product, int userId) {

        int current = stock.getOrDefault(product, 0);

        if (current > 0) {

            stock.put(product, current - 1);
            return "Purchase successful. Remaining: " + (current - 1);
        }

        waitingList.get(product).add(userId);

        return "Added to waiting list position: " +
                waitingList.get(product).size();
    }

    public int checkStock(String product) {
        return stock.getOrDefault(product, 0);
    }
}