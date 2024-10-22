<<<<<<< HEAD
/**
 *
 * @author qaffqa
 */
public class Enemy {
    private String name;
    private int size; // 1 = small, 2 = medium, 3 = large
    private int experiencePoints;

    public Enemy(String name, int size) {
        this.name = name;
        this.size = size;
        this.experiencePoints = calculateExperience(size);
    }

    private int calculateExperience(int size) {
        switch (size) {
            case 1: return 2;  // Small
            case 2: return 6;  // Medium
            case 3: return 10; // Large
            default: return 0; // Unknown size
        }
    }

    public String getName() {
        return name;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    void receiveDamage(int damage) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

=======
/**
 *
 * @author qaffqa
 */
public class Enemy {
    private String name;
    private int size; // 1 = small, 2 = medium, 3 = large
    private int experiencePoints;

    public Enemy(String name, int size) {
        this.name = name;
        this.size = size;
        this.experiencePoints = calculateExperience(size);
    }

    private int calculateExperience(int size) {
        switch (size) {
            case 1: return 2;  // Small
            case 2: return 6;  // Medium
            case 3: return 10; // Large
            default: return 0; // Unknown size
        }
    }

    public String getName() {
        return name;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    void receiveDamage(int damage) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

>>>>>>> e56282a002ceed6ebdfab045f3b502da339be289
