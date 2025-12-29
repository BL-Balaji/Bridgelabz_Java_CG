import java.util.HashMap;

/**
 * OOPSBannerApp - UC5
 Concepts Used :
 HashMap (Collections Framework)
 Key-Value mapping
 StringBuilder
 Nested loops
 Modular static methods
 Separation of concerns
 */
public class {
    public static HashMap<Character,String[]> createCharacterMaps() {
        HashMap<Character,String[]> map = new HashMap<>();
        map.put('O', new String[]{
                        "  ***  ",
                        "**   **",
                        "**   **",
                       "**     **",
                        "**   **",
                        "**   **",
                        "  ***  "
                });
        map.put('P', new String[]{
                        "****** ",
                        "**   **",
                        "****** ",
                        "**     ",
                        "**     ",
                        "**     ",
                        "**     "
                });
        map.put('S', new String[]{
                        " ***** ",
                        "**     ",
                        "**     ",
                        " ***   ",
                        "    ** ",
                        "*    **",
                        " ***** "
                });
        return map;
    }

    public static void displayBanner(String message, HashMap<Character,String[]> charMap)
    {
        int patternHeight = charMap.get('O').length;
        for(int line = 0;line < patternHeight; line++)
        {
            StringBuilder row = new StringBuilder();
            for(char ch : message.toCharArray())
            {
                String[] pattern = charMap.get(ch);
                row.append(pattern[line]).append(" ");
            }
            System.out.println(row);
        }
    }

    public static void main(String[] args) {
        HashMap<Character,String[]> charMap = createCharacterMaps();
        String message = "OOPS";
        displayBanner(message,charMap);

    }
}
