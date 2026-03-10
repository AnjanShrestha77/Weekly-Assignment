/**
 * AutocompleteMain
 *
 * Driver class for testing autocomplete suggestions.
 */

public class AutocompleteMain {

    public static void main(String[] args) {

        AutocompleteSystem system = new AutocompleteSystem();

        system.addQuery("java tutorial");
        system.addQuery("javascript guide");
        system.addQuery("java collections");

        System.out.println(system.search("jav"));
    }
}