<<<<<<< HEAD


/**
 *
 * @author danie
 */
public enum CharacterClass {
    WARRIOR(3, 1, 1, 1, 1, 1),   // Strength: 3, others: 1
    MAGE(1, 1, 1, 3, 1, 1),       // Intelligence: 3
    ROGUE(1, 1, 3, 1, 1, 2),      // Agility: 3
    CLERIC(1, 1, 1, 1, 3, 1),     // Piety: 3
    SCOUT(1, 1, 3, 1, 1, 1);       // Agility: 3, 

    private final int strengthGrowth;
    private final int vitalityGrowth;
    private final int agilityGrowth;
    private final int intelligenceGrowth;
    private final int pietyGrowth;
    private final int luckGrowth;

    CharacterClass(int strength, int vitality, int agility, int intelligence, int piety, int luck) {
        this.strengthGrowth = strength;
        this.vitalityGrowth = vitality;
        this.agilityGrowth = agility;
        this.intelligenceGrowth = intelligence;
        this.pietyGrowth = piety;
        this.luckGrowth = luck;
    }

    public int getStrengthGrowth() {
        return strengthGrowth;
    }

    public int getVitalityGrowth() {
        return vitalityGrowth;
    }

    public int getAgilityGrowth() {
        return agilityGrowth;
    }

    public int getIntelligenceGrowth() {
        return intelligenceGrowth;
    }

    public int getPietyGrowth() {
        return pietyGrowth;
        }
    
     public int getLuckGrowth() {
        return luckGrowth;
        }
=======


/**
 *
 * @author danie
 */
public enum CharacterClass {
    WARRIOR(3, 1, 1, 1, 1, 1),   // Strength: 3, others: 1
    MAGE(1, 1, 1, 3, 1, 1),       // Intelligence: 3
    ROGUE(1, 1, 3, 1, 1, 2),      // Agility: 3
    CLERIC(1, 1, 1, 1, 3, 1),     // Piety: 3
    SCOUT(1, 1, 3, 1, 1, 1);       // Agility: 3, 

    private final int strengthGrowth;
    private final int vitalityGrowth;
    private final int agilityGrowth;
    private final int intelligenceGrowth;
    private final int pietyGrowth;
    private final int luckGrowth;

    CharacterClass(int strength, int vitality, int agility, int intelligence, int piety, int luck) {
        this.strengthGrowth = strength;
        this.vitalityGrowth = vitality;
        this.agilityGrowth = agility;
        this.intelligenceGrowth = intelligence;
        this.pietyGrowth = piety;
        this.luckGrowth = luck;
    }

    public int getStrengthGrowth() {
        return strengthGrowth;
    }

    public int getVitalityGrowth() {
        return vitalityGrowth;
    }

    public int getAgilityGrowth() {
        return agilityGrowth;
    }

    public int getIntelligenceGrowth() {
        return intelligenceGrowth;
    }

    public int getPietyGrowth() {
        return pietyGrowth;
        }
    
     public int getLuckGrowth() {
        return luckGrowth;
        }
>>>>>>> e56282a002ceed6ebdfab045f3b502da339be289
    }