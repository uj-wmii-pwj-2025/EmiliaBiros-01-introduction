package uj.wmii.pwj.introduction;
import java.util.HashMap;

public class Banner {
    private final HashMap<Character, String[]> map;

    public Banner () {
        map = new HashMap<>();
        createASCII();
    }

    private void createASCII() {
        map.put('A', new String[]{
                "   #   ",
                "  # #  ",
                " #   # ",
                "#     #",
                "#######" ,
                "#     #",
                "#     #"
        });
        map.put('B', new String[]{
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#     #",
                "#     #",
                "###### "
        });
        map.put('C',new String[]{
                " ##### ",
                "#     #",
                "#      ",
                "#      ",
                "#      ",
                "#     #",
                " ##### "
        });
        map.put('D', new String[]{
                "###### ",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "###### "
        });
        map.put('E', new String[]{
                "#######",
                "#      ",
                "#      ",
                "#####  ",
                "#      ",
                "#      ",
                "#######"
        });
        map.put('F', new String[]{
                "#######",
                "#      ",
                "#      ",
                "#####  ",
                "#      ",
                "#      ",
                "#      "
        });
        map.put('G', new String[]{
                " ##### ",
                "#     #",
                "#      ",
                "#  ####",
                "#     #",
                "#     #",
                " ##### "
        });
        map.put('H', new String[]{
                "#     #",
                "#     #",
                "#     #",
                "#######",
                "#     #",
                "#     #",
                "#     #"
        });
        map.put('I', new String[]{
                "###",
                " # ",
                " # ",
                " # ",
                " # ",
                " # ",
                "###"
        });
        map.put('J', new String[]{
                "      #",
                "      #",
                "      #",
                "      #",
                "#     #",
                "#     #",
                " ##### "
        });
        map.put('K', new String[]{
                "#    #",
                "#   # ",
                "#  #  ",
                "###   ",
                "#  #  ",
                "#   # ",
                "#    #"
        });
        map.put('L', new String[]{
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#      ",
                "#######"
        });
        map.put('M', new String[]{
                "#     #",
                "##   ##",
                "# # # #",
                "#  #  #",
                "#     #",
                "#     #",
                "#     #"
        });
        map.put('N', new String[]{
                "#     #",
                "##    #",
                "# #   #",
                "#  #  #",
                "#   # #",
                "#    ##",
                "#     #"
        });
        map.put('O', new String[]{
                "#######",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#######"
        });
        map.put('P', new String[]{
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#      ",
                "#      ",
                "#      "
        });
        map.put('Q', new String[]{
                " ##### ",
                "#     #",
                "#     #",
                "#     #",
                "#   # #",
                "#    # ",
                " #### #"
        });
        map.put('R', new String[]{
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#   #  ",
                "#    # ",
                "#     #"
        });
        map.put('S', new String[]{
                " ##### ",
                "#     #",
                "#      ",
                " ##### ",
                "      #",
                "#     #",
                " ##### "
        });
        map.put('T', new String[]{
                "#######",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   "
        });
        map.put('U', new String[]{
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                " ##### "
        });
        map.put('W', new String[]{
                "#     #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                "#  #  #",
                " ## ## "
        });
        map.put('V', new String[]{
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   "
        });
        map.put('X', new String[]{
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   ",
                "  # #  ",
                " #   # ",
                "#     #"
        });
        map.put('Y', new String[]{
                "#     #",
                " #   # ",
                "  # #  ",
                "   #   ",
                "   #   ",
                "   #   ",
                "   #   "
        });
        map.put('Z', new String[]{
                "#######",
                "     # ",
                "    #  ",
                "   #   ",
                "  #    ",
                " #     ",
                "#######"
        });
        map.put(' ', new String[]{
                "  ",
                "  ",
                "  ",
                "  ",
                "  ",
                "  ",
                "  "
        });
    }

    public String[] toBanner(String input) {
        if (input == null || input.isEmpty()) {
            return new String[0];
        }

        input = input.toUpperCase();
        final int height = 7;
        String[] result = new String[height];

        for (int i = 0; i < height; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);
                String[] letter = map.getOrDefault(c, map.get(' '));
                row.append(letter[i]);

                if (j < input.length() - 1) {
                    row.append(" ");
                }
            }
            result[i] = row.toString();
        }

        return result;
    }
}