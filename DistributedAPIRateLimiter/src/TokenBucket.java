/**
 * TokenBucket
 *
 * Represents the token bucket used in rate limiting.
 * Each client has a bucket with limited tokens.
 */

public class TokenBucket {

    int tokens;
    int maxTokens;
    long lastRefill;

    public TokenBucket(int maxTokens) {
        this.tokens = maxTokens;
        this.maxTokens = maxTokens;
        this.lastRefill = System.currentTimeMillis();
    }
}