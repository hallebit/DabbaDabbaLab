public class DabbaDabba {

    public static final int LEVELS = 4;

    /** 
     * Prints the roof of the house
     */
    public static void roof() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (LEVELS + 1) * 2 + (5 - i); j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 0; j < i; j++) {
                System.out.print("/\\");
            }
            System.out.println("\\");
        }
    }
    
    public static void houseSide() {
        for (int i = 0; i < (LEVELS + 1) * 2 + 1; i++) {
            System.out.print("-");
        }
    }
    
    public static void housePartial() {
        houseSide();
        System.out.print("| %");
        for (int i = 0; i < 4; i++) {
            System.out.print(" ");
        }
        System.out.print("% |");
        houseSide();
        System.out.println();
    }

    public static void house() {
        housePartial();
        for (int i = 0; i < LEVELS + 1; i++) {
            System.out.print(" o");
        }
        System.out.print(" | %");
        for (int i = 0; i < 4; i++) {
            System.out.print(" ");
        }
        System.out.print("% | ");
        for (int i = 0; i < LEVELS + 1; i++) {
            System.out.print("o ");
        }
        System.out.println();
        housePartial();
    }

    public static void drawSteps() {
        for (int i = 0; i < LEVELS; i++) {
            for (int j = 0; j < (LEVELS + 1) - i; j++) {
                System.out.print("~^");
            }
            System.out.print("~/");
            for (int j = 0; j < 8 + (4 * i); j++) {
                System.out.print("-");
            }
            System.out.print("\\~");
            for (int j = 0; j < (LEVELS + 1) - i; j++) {
                System.out.print("^~");
            }
            System.out.println();
            for (int j = 0; j < (LEVELS + 1) - i; j++) {
                System.out.print("^~");
            }
            System.out.print("/");
            for (int j = 0; j < 10 + (4 * i); j++) {
                System.out.print("-");
            }
            System.out.print("\\");
            for (int j = 0; j < (LEVELS + 1) - i; j++) {
                System.out.print("~^");
            }
            System.out.println();
            for (int j = 0; j < (LEVELS + 1) * 2 - (2 * i); j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int j = 0; j < 10 + (4 * i); j++) {
                System.out.print("=");
            }
            System.out.print("|");
            System.out.println();
        }
    }
    
    public static void bottom() {
        System.out.print("   /");
        for (int i = 0; i < 12 + (4 * (LEVELS - 1)); i++) {
            System.out.print(" ");
        }
        System.out.print("\\");
        System.out.println();
        System.out.print("  /  ");
        for (int i = 0; i < 10 + (4 * (LEVELS - 1)); i++) {
            System.out.print("=");
        }
        System.out.print("  \\");
        System.out.println();
        System.out.print(" /  / ");
        for (int i = 0; i < 8 + (4 * (LEVELS - 1)); i++) {
            System.out.print("\"");
        }
        System.out.print(" \\  \\");
        System.out.println();
        System.out.print("|  | ");
        for (int i = 0; i < 10 + (4 * (LEVELS - 1)); i++) {
            System.out.print("\"");
        }
        System.out.print(" |  |");
        System.out.println();
        System.out.print(" \\  \\ ");
        for (int i = 0; i < 8 + (4 * (LEVELS - 1)); i++) {
            System.out.print("\"");
        }
        System.out.print(" /  /");
        System.out.println();
        System.out.print("  \\  ");
        for (int i = 0; i < 10 + (4 * (LEVELS - 1)); i++) {
            System.out.print("=");
        }
        System.out.print("  /");
        System.out.println();
        System.out.print("   \\");
        for (int i = 0; i < 12 + 4 * (LEVELS - 1); i++) {
            System.out.print("_");
        }
        System.out.println("/");
        }
    
    public static void main(String[] args) {
        roof();
        house();
        drawSteps();
        bottom();
    }
}
