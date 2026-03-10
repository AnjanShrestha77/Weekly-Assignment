/**
 * RateLimiterMain
 *
 * Driver program demonstrating API rate limiting.
 */

public class RateLimiterMain {

    public static void main(String[] args) {

        RateLimiter limiter = new RateLimiter();

        for (int i = 1; i <= 7; i++) {

            boolean allowed = limiter.allowRequest("client1");

            System.out.println("Request " + i + ": " + allowed);
        }
    }
}