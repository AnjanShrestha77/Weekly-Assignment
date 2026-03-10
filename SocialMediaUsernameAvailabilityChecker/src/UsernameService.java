import java.util.*;

/**
 * UsernameService
 *
 * Description:
 * This class implements a username availability checking system
 * similar to what is used in social media platforms.
 *
 * Features:
 * - Checks username availability in O(1) time using HashMap
 * - Suggests alternative usernames if a name is taken
 * - Tracks frequency of attempted usernames
 *
 * Data Structures Used:
 * - HashMap<String, Integer> : stores username -> userId
 * - HashMap<String, Integer> : tracks username attempt frequency
 *
 * Author: Anjan
 * Version: 1.0
 */
public class UsernameService {

    private Map<String, Integer> usernameMap;
    private Map<String, Integer> attemptFrequency;

    public UsernameService() {
        usernameMap = new HashMap<>();
        attemptFrequency = new HashMap<>();
    }

    /**
     * Registers a new user
     *
     * @param username username to register
     * @param userId unique user id
     */
    public void registerUser(String username, int userId) {
        usernameMap.put(username, userId);
    }

    /**
     * Checks if a username is available
     *
     * @param username username to check
     * @return true if available, false otherwise
     */
    public boolean checkAvailability(String username) {

        attemptFrequency.put(
                username,
                attemptFrequency.getOrDefault(username, 0) + 1
        );

        return !usernameMap.containsKey(username);
    }

    /**
     * Suggests alternative usernames
     *
     * @param username original username
     * @return list of suggestions
     */
    public List<String> suggestAlternatives(String username) {

        List<String> suggestions = new ArrayList<>();

        suggestions.add(username + "1");
        suggestions.add(username + "2");
        suggestions.add(username.replace("_", "."));
        suggestions.add(username + "_official");

        return suggestions;
    }

    /**
     * Returns the most attempted username
     *
     * @return username with highest attempts
     */
    public String getMostAttempted() {

        String result = null;
        int max = 0;

        for (String user : attemptFrequency.keySet()) {
            int count = attemptFrequency.get(user);

            if (count > max) {
                max = count;
                result = user;
            }
        }

        return result;
    }
}