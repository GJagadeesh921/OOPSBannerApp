/**
 * OOPSBannerApp UC7 – Using Class for Pattern Storage
 */

public class OOPSBannerApp {

    // 🔹 Inner Static Class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    // 🔹 Utility methods to create patterns
    public static CharacterPattern getO() {
        return new CharacterPattern('O', new String[]{
            "  ***   ",
            " *   *  ",
            "*     * ",
            "*     * ",
            "*     * ",
            " *   *  ",
            "  ***   "
        });
    }

    public static CharacterPattern getP() {
        return new CharacterPattern('P', new String[]{
            " *****  ",
            " *   *  ",
            " *   *  ",
            " *****  ",
            " *      ",
            " *      ",
            " *      "
        });
    }

    public static CharacterPattern getS() {
        return new CharacterPattern('S', new String[]{
            " ***** ",
            " *     ",
            " *     ",
            " ***** ",
            "     * ",
            "     * ",
            " ***** "
        });
    }

    public static void main(String[] args) {

        CharacterPattern o = getO();
        CharacterPattern p = getP();
        CharacterPattern s = getS();

        String[] oPattern = o.getPattern();
        String[] pPattern = p.getPattern();
        String[] sPattern = s.getPattern();

        // Print banner
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + oPattern[i] + pPattern[i] + sPattern[i]);
        }
    }
}