<<<<<<< HEAD
/**
 *
 * @author qaffqa
 */
import java.util.ArrayList;
import java.util.List;

public class Player {
    // Attributes
    private String name;
    private int health;
    private int strength;
    private int vitality;
    private int agility;
    private int intelligence;
    private int piety;
    private int luck;
    private int level;
    private int specialPoints; // SP
    private List<Ability> abilities;
    private List<Spell> spells;
    private int experience;
    private CharacterClass characterClass; // Reference to CharacterClass
    private boolean leader; // Indicates if the player is the leader

    // Constructor
    public Player(String name, int level, CharacterClass characterClass) {
        this.name = name;
        this.level = level;
        this.experience = 0;
        this.abilities = new ArrayList<>();
        this.spells = new ArrayList<>();
        this.characterClass = characterClass; // Set character class

        // Set attributes based on character class
        switch (characterClass) {
            case WARRIOR:
                this.strength = 3;
                this.vitality = 1;
                this.agility = 1;
                this.intelligence = 1;
                this.piety = 1;
                this.luck = 1;
                break;
            case MAGE:
                this.strength = 1;
                this.vitality = 1;
                this.agility = 1;
                this.intelligence = 3;
                this.piety = 1;
                this.luck = 1;
                break;
            case ROGUE:
                this.strength = 1;
                this.vitality = 1;
                this.agility = 3;
                this.intelligence = 1;
                this.piety = 1;
                this.luck = 2; // Example of extra stat for Rogues
                break;
            case CLERIC:
                this.strength = 1;
                this.vitality = 3;
                this.agility = 1;
                this.intelligence = 1;
                this.piety = 1;
                this.luck = 1;
                break;
            case SCOUT:
                this.strength = 1;
                this.vitality = 1;
                this.agility = 3;
                this.intelligence = 1;
                this.piety = 1;
                this.luck = 1;
                break;
        }
        this.health = calculateHealth(); // Initial health calculation
        this.specialPoints = 5; // Example starting special points
    }

    // Method to calculate health based on vitality
    private int calculateHealth() {
        return 30 + (vitality * 2); // Base health + bonus from vitality
    }

    // Method to level up the player
public void levelUp() {
    if (level < 20) { // Check if the level is less than the cap
        experience = 0; // Reset experience
        level++;

        // Increase stats based on character class growth rates
        strength += characterClass.getStrengthGrowth();
        vitality += characterClass.getVitalityGrowth();
        agility += characterClass.getAgilityGrowth();
        intelligence += characterClass.getIntelligenceGrowth();
        piety += characterClass.getPietyGrowth();
        luck += characterClass.getLuckGrowth();

        health = calculateHealth(); // Recalculate health after leveling up
        System.out.println(name + " leveled up to level " + level + "!");
    } else {
        System.out.println(name + " has reached the maximum level of " + level + "!");
    }
}


    // Method to add experience
    public void addExperience(int amount) {
        experience += amount;
        System.out.println(name + " gains " + amount + " experience points!");
        if (experience >= level * 100) { // Example threshold for leveling up
            levelUp();
        }
    }

    // Method to move the player
    public void move(String direction) {
        System.out.println("Moving " + direction);
        // Logic for movement can be implemented here
    }

    // Method to attack an enemy
    public void attack(Enemy enemy) {
        int damage = strength; // For simplicity, just using strength for damage
        enemy.receiveDamage(damage);
        System.out.println(name + " attacks " + enemy.getName() + " for " + damage + " damage!");
    }

    // Method to interact with objects
    public void interact(Object object) {
        System.out.println(name + " interacts with " + object.toString());
        // Logic for interaction can be implemented here
    }

    // Method to cast a spell
    public void castSpell(Spell spell) {
        if (specialPoints >= spell.getCost()) {
            specialPoints -= spell.getCost();
            System.out.println(name + " casts " + spell.getName() + "!");
            // Logic to apply the spell's effect can be implemented here
        } else {
            System.out.println("Not enough special points to cast " + spell.getName() + "!");
        }
    }

    // Method to cast an ability
    public void castAbility(Ability ability) {
        if (specialPoints >= ability.getCost()) {
            specialPoints -= ability.getCost();
            System.out.println(name + " uses " + ability.getName() + "!");
            // Logic to apply the ability's effect can be implemented here
        } else {
            System.out.println("Not enough special points to use " + ability.getName() + "!");
        }
    }

    // Method to regenerate special points
    public void regenSP(int amount) {
        specialPoints += amount;
        System.out.println(name + " regenerates " + amount + " special points!");
    }

    // Method to receive damage
    public void receiveDamage(int amount) {
        health -= amount;
        System.out.println(name + " receives " + amount + " damage!");
        if (health <= 0) {
            System.out.println(name + " has been defeated!");
        }
    }
    
    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }
    
    public int getStrength() {
        return strength;
    }

    public int getVitality() {
        return vitality;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getPiety() {
        return piety;
    }

    public int getLuck() {
        return luck;
    }

    public int getSpecialPoints() {
        return specialPoints;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public List<Spell> getSpells() {
        return spells;
    }

    public int getExperience() {
        return experience;
    }

    public boolean isLeader() {
        return leader;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setPiety(int piety) {
        this.piety = piety;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public void setSpecialPoints(int specialPoints) {
        this.specialPoints = specialPoints;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public void setSpells(List<Spell> spells) {
        this.spells = spells;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setLeader(boolean leader) {
        this.leader = leader;
    }
}
=======
/**
 *
 * @author qaffqa
 */
import java.util.ArrayList;
import java.util.List;

public class Player {
    // Attributes
    private String name;
    private int health;
    private int strength;
    private int vitality;
    private int agility;
    private int intelligence;
    private int piety;
    private int luck;
    private int level;
    private int specialPoints; // SP
    private List<Ability> abilities;
    private List<Spell> spells;
    private int experience;
    private CharacterClass characterClass; // Reference to CharacterClass
    private boolean leader; // Indicates if the player is the leader

    // Constructor
    public Player(String name, int level, CharacterClass characterClass) {
        this.name = name;
        this.level = level;
        this.experience = 0;
        this.abilities = new ArrayList<>();
        this.spells = new ArrayList<>();
        this.characterClass = characterClass; // Set character class

        // Set attributes based on character class
        switch (characterClass) {
            case WARRIOR:
                this.strength = 3;
                this.vitality = 1;
                this.agility = 1;
                this.intelligence = 1;
                this.piety = 1;
                this.luck = 1;
                break;
            case MAGE:
                this.strength = 1;
                this.vitality = 1;
                this.agility = 1;
                this.intelligence = 3;
                this.piety = 1;
                this.luck = 1;
                break;
            case ROGUE:
                this.strength = 1;
                this.vitality = 1;
                this.agility = 3;
                this.intelligence = 1;
                this.piety = 1;
                this.luck = 2; // Example of extra stat for Rogues
                break;
            case CLERIC:
                this.strength = 1;
                this.vitality = 3;
                this.agility = 1;
                this.intelligence = 1;
                this.piety = 1;
                this.luck = 1;
                break;
            case SCOUT:
                this.strength = 1;
                this.vitality = 1;
                this.agility = 3;
                this.intelligence = 1;
                this.piety = 1;
                this.luck = 1;
                break;
        }
        this.health = calculateHealth(); // Initial health calculation
        this.specialPoints = 5; // Example starting special points
    }

    // Method to calculate health based on vitality
    private int calculateHealth() {
        return 30 + (vitality * 2); // Base health + bonus from vitality
    }

    // Method to level up the player
public void levelUp() {
    if (level < 20) { // Check if the level is less than the cap
        experience = 0; // Reset experience
        level++;

        // Increase stats based on character class growth rates
        strength += characterClass.getStrengthGrowth();
        vitality += characterClass.getVitalityGrowth();
        agility += characterClass.getAgilityGrowth();
        intelligence += characterClass.getIntelligenceGrowth();
        piety += characterClass.getPietyGrowth();
        luck += characterClass.getLuckGrowth();

        health = calculateHealth(); // Recalculate health after leveling up
        System.out.println(name + " leveled up to level " + level + "!");
    } else {
        System.out.println(name + " has reached the maximum level of " + level + "!");
    }
}


    // Method to add experience
    public void addExperience(int amount) {
        experience += amount;
        System.out.println(name + " gains " + amount + " experience points!");
        if (experience >= level * 100) { // Example threshold for leveling up
            levelUp();
        }
    }

    // Method to move the player
    public void move(String direction) {
        System.out.println("Moving " + direction);
        // Logic for movement can be implemented here
    }

    // Method to attack an enemy
    public void attack(Enemy enemy) {
        int damage = strength; // For simplicity, just using strength for damage
        enemy.receiveDamage(damage);
        System.out.println(name + " attacks " + enemy.getName() + " for " + damage + " damage!");
    }

    // Method to interact with objects
    public void interact(Object object) {
        System.out.println(name + " interacts with " + object.toString());
        // Logic for interaction can be implemented here
    }

    // Method to cast a spell
    public void castSpell(Spell spell) {
        if (specialPoints >= spell.getCost()) {
            specialPoints -= spell.getCost();
            System.out.println(name + " casts " + spell.getName() + "!");
            // Logic to apply the spell's effect can be implemented here
        } else {
            System.out.println("Not enough special points to cast " + spell.getName() + "!");
        }
    }

    // Method to cast an ability
    public void castAbility(Ability ability) {
        if (specialPoints >= ability.getCost()) {
            specialPoints -= ability.getCost();
            System.out.println(name + " uses " + ability.getName() + "!");
            // Logic to apply the ability's effect can be implemented here
        } else {
            System.out.println("Not enough special points to use " + ability.getName() + "!");
        }
    }

    // Method to regenerate special points
    public void regenSP(int amount) {
        specialPoints += amount;
        System.out.println(name + " regenerates " + amount + " special points!");
    }

    // Method to receive damage
    public void receiveDamage(int amount) {
        health -= amount;
        System.out.println(name + " receives " + amount + " damage!");
        if (health <= 0) {
            System.out.println(name + " has been defeated!");
        }
    }
    
    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }
    
    public int getStrength() {
        return strength;
    }

    public int getVitality() {
        return vitality;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getPiety() {
        return piety;
    }

    public int getLuck() {
        return luck;
    }

    public int getSpecialPoints() {
        return specialPoints;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public List<Spell> getSpells() {
        return spells;
    }

    public int getExperience() {
        return experience;
    }

    public boolean isLeader() {
        return leader;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setPiety(int piety) {
        this.piety = piety;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public void setSpecialPoints(int specialPoints) {
        this.specialPoints = specialPoints;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public void setSpells(List<Spell> spells) {
        this.spells = spells;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setLeader(boolean leader) {
        this.leader = leader;
    }
}
>>>>>>> e56282a002ceed6ebdfab045f3b502da339be289
