import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp UC8 – Using HashMap
 */

public class OOPSBannerApp {

    // 🔹 Create Map of patterns
    public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            "  ***   ",
            " *   *  ",
            "*     * ",
            "*     * ",
            "*     * ",
            " *   *  ",
            "  ***   "
        });

        map.put('P', new String[]{
            " *****  ",
            " *   *  ",
            " *   *  ",
            " *****  ",
            " *      ",
            " *      ",
            " *      "
        });

        map.put('S', new String[]{
            " ***** ",
            " *     ",
            " *     ",
            " ***** ",
            "     * ",
            "     * ",
            " ***** "
        });

        return map;
    }

    // 🔹 Render function
    public static void printBanner(String text, Map<Character, String[]> map) {

        for (int i = 0; i < 7; i++) { // 7 lines

            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                String[] pattern = map.get(ch);
                line.append(pattern[i]).append(" ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> map = createPatternMap();

        printBanner("OOPS", map);
    }
}