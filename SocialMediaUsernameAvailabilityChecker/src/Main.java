/**
 * Main
 *
 * Driver class to test UsernameService functionality.
 *
 * Author: Anjan
 * Version: 1.0
 */

public class Main {

    public static void main(String[] args) {

        UsernameService service = new UsernameService();

        service.registerUser("john_doe", 101);

        System.out.println(
                "john_doe available: " +
                        service.checkAvailability("john_doe")
        );

        System.out.println(
                "jane_smith available: " +
                        service.checkAvailability("jane_smith")
        );

        System.out.println(
                "Suggestions for john_doe: " +
                        service.suggestAlternatives("john_doe")
        );

        System.out.println(
                "Most attempted username: " +
                        service.getMostAttempted()
        );
    }
}