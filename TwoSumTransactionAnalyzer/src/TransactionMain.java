/**
 * TransactionMain
 *
 * Driver class to demonstrate Two-Sum transaction detection.
 */

public class TransactionMain {

    public static void main(String[] args) {

        TransactionAnalyzer analyzer = new TransactionAnalyzer();

        int[] transactions = {500, 300, 200, 700};

        var result = analyzer.findTwoSum(transactions, 500);

        for (int[] pair : result) {

            System.out.println(pair[0] + " + " + pair[1]);
        }
    }
}