/**
 * DNSEntry
 *
 * Represents one DNS cache entry with IP
 * and expiration time based on TTL.
 */

public class DNSEntry {

    String ip;
    long expiry;

    public DNSEntry(String ip, long ttlSeconds) {

        this.ip = ip;
        this.expiry = System.currentTimeMillis() + ttlSeconds * 1000;
    }

    public boolean isExpired() {
        return System.currentTimeMillis() > expiry;
    }
}