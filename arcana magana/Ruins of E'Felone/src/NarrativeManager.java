<<<<<<< HEAD
/**
 *
 * @author danie
 */
import java.util.Scanner;

public class NarrativeManager {
    private Scanner scanner;

    public NarrativeManager() {
        this.scanner = new Scanner(System.in);
    }

    public void startAdventure(Player player) {
        System.out.println("Welcome to the adventure, " + player.getName() + "!");
        firstChoice();
    }

    private void firstChoice() {
        System.out.println("You find yourself at a crossroad. Do you want to go left or right?");
        String choice = scanner.nextLine().toLowerCase();
        
        switch (choice) {
            case "left":
                goLeft();
                break;
            case "right":
                goRight();
                break;
            default:
                System.out.println("Invalid choice. Please choose 'left' or 'right'.");
                firstChoice(); // Retry if invalid input
                break;
        }
    }

    private void goLeft() {
        System.out.println("You ventured left and found a treasure chest! What do you want to do?");
        System.out.println("Type 'open' to open the chest or 'leave' to leave it.");
        String choice = scanner.nextLine().toLowerCase();

        switch (choice) {
            case "open":
                System.out.println("You opened the chest and found gold!");
                break;
            case "leave":
                System.out.println("You decided to leave the treasure behind.");
                break;
            default:
                System.out.println("Invalid choice. Please type 'open' or 'leave'.");
                goLeft(); // Retry if invalid input
                break;
        }
    }

    private void goRight() {
        System.out.println("You went right and encountered a wild beast! What will you do?");
        System.out.println("Type 'fight' to fight or 'run' to escape.");
        String choice = scanner.nextLine().toLowerCase();

        switch (choice) {
            case "fight":
                System.out.println("You bravely fought the beast and won!");
                break;
            case "run":
                System.out.println("You ran away safely!");
                break;
            default:
                System.out.println("Invalid choice. Please type 'fight' or 'run'.");
                goRight(); // Retry if invalid input
                break;
        }
    }
}
=======
/**
 *
 * @author danie
 */
import java.util.Scanner;

public class NarrativeManager {
    private Scanner scanner;

    public NarrativeManager() {
        this.scanner = new Scanner(System.in);
    }

    public void startAdventure(Player player) {
        System.out.println("Welcome to the adventure, " + player.getName() + "!");
        firstChoice();
    }

    private void firstChoice() {
        System.out.println("You find yourself at a crossroad. Do you want to go left or right?");
        String choice = scanner.nextLine().toLowerCase();
        
        switch (choice) {
            case "left":
                goLeft();
                break;
            case "right":
                goRight();
                break;
            default:
                System.out.println("Invalid choice. Please choose 'left' or 'right'.");
                firstChoice(); // Retry if invalid input
                break;
        }
    }

    private void goLeft() {
        System.out.println("You ventured left and found a treasure chest! What do you want to do?");
        System.out.println("Type 'open' to open the chest or 'leave' to leave it.");
        String choice = scanner.nextLine().toLowerCase();

        switch (choice) {
            case "open":
                System.out.println("You opened the chest and found gold!");
                break;
            case "leave":
                System.out.println("You decided to leave the treasure behind.");
                break;
            default:
                System.out.println("Invalid choice. Please type 'open' or 'leave'.");
                goLeft(); // Retry if invalid input
                break;
        }
    }

    private void goRight() {
        System.out.println("You went right and encountered a wild beast! What will you do?");
        System.out.println("Type 'fight' to fight or 'run' to escape.");
        String choice = scanner.nextLine().toLowerCase();

        switch (choice) {
            case "fight":
                System.out.println("You bravely fought the beast and won!");
                break;
            case "run":
                System.out.println("You ran away safely!");
                break;
            default:
                System.out.println("Invalid choice. Please type 'fight' or 'run'.");
                goRight(); // Retry if invalid input
                break;
        }
    }
}
>>>>>>> e56282a002ceed6ebdfab045f3b502da339be289
