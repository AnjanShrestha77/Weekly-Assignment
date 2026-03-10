/**
 * UsernameMain
 *
 * Driver class used to test UsernameService functionality.
 */

public class UsernameMain {

    public static void main(String[] args) {

        UsernameService service = new UsernameService();

        service.registerUser("john_doe", 1);

        System.out.println(service.checkAvailability("john_doe"));
        System.out.println(service.checkAvailability("jane_smith"));

        System.out.println(service.suggestAlternatives("john_doe"));

        System.out.println("Most attempted: " + service.getMostAttempted());
    }
}