import java.util.*;

/**
 * UsernameService
 *
 * Description:
 * Implements a username availability checking system for a social media platform.
 * The system uses HashMap to provide constant time lookup for usernames.
 *
 * Features:
 * - Check username availability
 * - Suggest alternative usernames
 * - Track frequency of attempted usernames
 *
 * Author: Anjan
 */

public class UsernameService {

    private Map<String, Integer> users = new HashMap<>();
    private Map<String, Integer> attempts = new HashMap<>();

    public boolean checkAvailability(String username) {

        attempts.put(username, attempts.getOrDefault(username, 0) + 1);

        return !users.containsKey(username);
    }

    public void registerUser(String username, int id) {
        users.put(username, id);
    }

    public List<String> suggestAlternatives(String username) {

        List<String> list = new ArrayList<>();

        list.add(username + "1");
        list.add(username + "2");
        list.add(username + "_official");

        return list;
    }

    public String getMostAttempted() {

        String result = null;
        int max = 0;

        for (String key : attempts.keySet()) {

            if (attempts.get(key) > max) {
                max = attempts.get(key);
                result = key;
            }
        }

        return result;
    }
}