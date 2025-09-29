public class Main {
    public static void main(String[] args) {
        // Using our enum
        Difficulty gameLevel = Difficulty.MEDIUM;

        System.out.println("Selected difficulty: " + gameLevel);
        System.out.println("Numeric value of difficulty: " + gameLevel.getLevel());

        // Looping through all enum constants
        System.out.println("All difficulty levels:");
        for (Difficulty d : Difficulty.values()) {
            System.out.println(d + " -> level " + d.getLevel());
        }

        // Example with another enum
        Direction move = Direction.LEFT;
        System.out.println("Moving in direction: " + move);
    }
}

// Example enum with constructor and method
enum Difficulty {
    EASY(1), MEDIUM(2), HARD(3);

    private final int level;

    // Constructor
    Difficulty(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}

// Another simple enum
enum Direction {
    UP, DOWN, LEFT, RIGHT;
}
