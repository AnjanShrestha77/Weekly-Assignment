import java.util.*;

/**
 * DNSCache
 *
 * Stores domain → IP mappings using HashMap.
 * Entries expire after TTL time.
 */

public class DNSCache {

    private Map<String, DNSEntry> cache = new HashMap<>();

    public String resolve(String domain) {

        DNSEntry entry = cache.get(domain);

        if (entry != null && !entry.isExpired()) {
            return "Cache HIT: " + entry.ip;
        }

        String newIp = "192.168.1." + new Random().nextInt(255);

        cache.put(domain, new DNSEntry(newIp, 5));

        return "Cache MISS: " + newIp;
    }
}