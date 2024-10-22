<<<<<<< HEAD


/**
 *
 * @author danie
 */
import java.util.Scanner;

// Game class
public class Game {
    
    // Attributes
    private String name;
    private int currentLevel;
    private Player player; // Player instance
    private Scanner scanner; // Scanner for user input
    private NarrativeManager narrativeManager; // NarrativeManager instance
    
    // Constructor
    public Game() {
        this.name = "--------[ Arcana Magna - The Ruins of E'felone ]--------"; 
        this.currentLevel = 0; // Default level
        this.player = null; // No player loaded initially
        this.scanner = new Scanner(System.in); // Initialize scanner
        this.narrativeManager = new NarrativeManager(); // Initialize NarrativeManager
    }
    
    // Start the game
    public void start() {
        System.out.println("Starting game ");
        System.out.println(name);
        mainMenu(); // Show the main menu
    }
    
    // Show the main menu
    private void mainMenu() {
        while (true) {
            System.out.println("1. Create Character");
            System.out.println("2. View Credits");
            System.out.println("3. Start Adventure");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createCharacter(); // Create a character
                    break;
                case 2:
                    credits(); // Show credits
                    break;
                case 3:
                    if (player != null) {
                        narrativeManager.startAdventure(player); // Start the adventure
                    } else {
                        System.out.println("You need to create a character first.");
                    }
                    break;
                case 4:
                    exit(); // Exit the game
                    return; // Exit main menu
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
    
    // Create a character
    private void createCharacter() {
        System.out.print("Enter your character's name: ");
        String playerName = scanner.nextLine();
        
        System.out.println("Choose a class:");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Rogue");
        System.out.println("4. Cleric");
        System.out.println("5. Scout");
        
        int classChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        CharacterClass characterClass = null;

        switch (classChoice) {
            case 1:
                characterClass = CharacterClass.WARRIOR;
                break;
            case 2:
                characterClass = CharacterClass.MAGE;
                break;
            case 3:
                characterClass = CharacterClass.ROGUE;
                break;
            case 4:
                characterClass = CharacterClass.CLERIC;
                break;
            case 5:
                characterClass = CharacterClass.SCOUT;
                break;
            default:
                System.out.println("Invalid class choice. Defaulting to Warrior.");
                characterClass = CharacterClass.WARRIOR;
        }
        
        // Create the player
        player = new Player(playerName, 1, characterClass); // Start at level 1
        System.out.println("Character created: " + player.getName() + " the " + characterClass);
    }
    
    // Load game
    public void load() {
        System.out.println("Loading game...");
        // Initialize player and currentLevel based on saved data
    }
    
    // Save game
    public void save() {
        System.out.println("Saving game...");
        // Save player and currentLevel
    }
    
    // Show credits
    public void credits() {
        System.out.println("Game developed by Qaffqa.");
    }
    
    // Exit game
    public void exit() {
        System.out.println("Exiting game...");
        save(); // Save before exiting
    }
    
    // Main method
    public static void main(String[] args) {
        Game game = new Game(); // Create a Game instance
        game.start(); // Start the game
    }
=======


/**
 *
 * @author danie
 */
import java.util.Scanner;

// Game class
public class Game {
    
    // Attributes
    private String name;
    private int currentLevel;
    private Player player; // Player instance
    private Scanner scanner; // Scanner for user input
    private NarrativeManager narrativeManager; // NarrativeManager instance
    
    // Constructor
    public Game() {
        this.name = "--------[ Arcana Magna - The Ruins of E'felone ]--------"; 
        this.currentLevel = 0; // Default level
        this.player = null; // No player loaded initially
        this.scanner = new Scanner(System.in); // Initialize scanner
        this.narrativeManager = new NarrativeManager(); // Initialize NarrativeManager
    }
    
    // Start the game
    public void start() {
        System.out.println("Starting game ");
        System.out.println(name);
        mainMenu(); // Show the main menu
    }
    
    // Show the main menu
    private void mainMenu() {
        while (true) {
            System.out.println("1. Create Character");
            System.out.println("2. View Credits");
            System.out.println("3. Start Adventure");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createCharacter(); // Create a character
                    break;
                case 2:
                    credits(); // Show credits
                    break;
                case 3:
                    if (player != null) {
                        narrativeManager.startAdventure(player); // Start the adventure
                    } else {
                        System.out.println("You need to create a character first.");
                    }
                    break;
                case 4:
                    exit(); // Exit the game
                    return; // Exit main menu
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
    
    // Create a character
    private void createCharacter() {
        System.out.print("Enter your character's name: ");
        String playerName = scanner.nextLine();
        
        System.out.println("Choose a class:");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Rogue");
        System.out.println("4. Cleric");
        System.out.println("5. Scout");
        
        int classChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        CharacterClass characterClass = null;

        switch (classChoice) {
            case 1:
                characterClass = CharacterClass.WARRIOR;
                break;
            case 2:
                characterClass = CharacterClass.MAGE;
                break;
            case 3:
                characterClass = CharacterClass.ROGUE;
                break;
            case 4:
                characterClass = CharacterClass.CLERIC;
                break;
            case 5:
                characterClass = CharacterClass.SCOUT;
                break;
            default:
                System.out.println("Invalid class choice. Defaulting to Warrior.");
                characterClass = CharacterClass.WARRIOR;
        }
        
        // Create the player
        player = new Player(playerName, 1, characterClass); // Start at level 1
        System.out.println("Character created: " + player.getName() + " the " + characterClass);
    }
    
    // Load game
    public void load() {
        System.out.println("Loading game...");
        // Initialize player and currentLevel based on saved data
    }
    
    // Save game
    public void save() {
        System.out.println("Saving game...");
        // Save player and currentLevel
    }
    
    // Show credits
    public void credits() {
        System.out.println("Game developed by Qaffqa.");
    }
    
    // Exit game
    public void exit() {
        System.out.println("Exiting game...");
        save(); // Save before exiting
    }
    
    // Main method
    public static void main(String[] args) {
        Game game = new Game(); // Create a Game instance
        game.start(); // Start the game
    }
>>>>>>> e56282a002ceed6ebdfab045f3b502da339be289
}