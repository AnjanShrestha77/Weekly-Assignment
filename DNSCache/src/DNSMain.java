/**
 * DNSMain
 *
 * Demonstrates DNS caching with TTL.
 */

public class DNSMain {

    public static void main(String[] args) {

        DNSCache cache = new DNSCache();

        System.out.println(cache.resolve("google.com"));
        System.out.println(cache.resolve("google.com"));
    }
}