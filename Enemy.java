import java.util.ArrayList ;
public class Enemy
{
    private String name;
    private String race;

    private int enemyHealth;
    private int enemyMinHealthCapacity;

    private int enemyLightWarriorLevel;
    private int enemyHeavyWarriorLevel;
    private int enemyArcheryLevel;
    private int enemySmithLevel;
    private int enemyMagicLevel;
    private int enemyAlchemyLevel;

    private ArrayList enemyWeaponInventory = new ArrayList<Weapon>();
    private ArrayList enemyArmorInventory = new ArrayList<Armor>();

    private Weapon enemyWeaponObject = null;
    private Armor enemyArmorObject = null;


    public Enemy(String enemyName, String enemyRace) {
        setEnemyName(enemyName);
        setEnemyRace(enemyRace);

        if (race.equals("Man"))
        {
            setEnemyRace("Man");
            setEnemyHealth(25);
            setEnemyMinHealthCapacity(0);
            setEnemyLightWarriorLevel(5);
            setEnemyHeavyWarriorLevel(1);
            setEnemyArcheryLevel(3);
            setEnemySmithLevel(1);
            setEnemyMagicLevel(1);
            setEnemyAlchemyLevel(1);
        }

        if (race.equals("Ancient Elf"))
        {
            setEnemyRace("Ancient Elf");
            setEnemyHealth(25);
            setEnemyMinHealthCapacity(0);
            setEnemyLightWarriorLevel(1);
            setEnemyHeavyWarriorLevel(1);
            setEnemyArcheryLevel(1);
            setEnemySmithLevel(1);
            setEnemyMagicLevel(5);
            setEnemyAlchemyLevel(3);
        }

        if (race.equals("Wood Elf"))
        {
            setEnemyRace("Wood Elf");
            setEnemyHealth(25);
            setEnemyMinHealthCapacity(0);
            setEnemyLightWarriorLevel(1);
            setEnemyHeavyWarriorLevel(1);
            setEnemyArcheryLevel(5);
            setEnemySmithLevel(1);
            setEnemyMagicLevel(1);
            setEnemyAlchemyLevel(3);
        }

        if (race.equals("Dwarf"))
        {
            setEnemyRace("Dwarf");
            setEnemyHealth(25);
            setEnemyMinHealthCapacity(0);
            setEnemyLightWarriorLevel(1);
            setEnemyHeavyWarriorLevel(3);
            setEnemyArcheryLevel(1);
            setEnemySmithLevel(5);
            setEnemyMagicLevel(1);
            setEnemyAlchemyLevel(1);
        }

        if (race.equals("Orc"))
        {
            setEnemyRace("Orc");
            setEnemyHealth(25);
            setEnemyMinHealthCapacity(0);
            setEnemyLightWarriorLevel(3);
            setEnemyHeavyWarriorLevel(5);
            setEnemyArcheryLevel(3);
            setEnemySmithLevel(1);
            setEnemyMagicLevel(1);
            setEnemyAlchemyLevel(1);
        }


    }

    //Accessor Methods

    //Permanents
    public String getEnemyName() {
        return name;
    }

    public String getEnemyRace() {
        return race;
    }

    //Vitals
    public int getEnemyHealth() {
        return enemyHealth;
    }

    public int getEnemyMinHealthCapacity() {
        return enemyMinHealthCapacity;
    }

    //Skills
    public int getEnemyLightWarriorLevel (){
        return enemyLightWarriorLevel ;
    }

    public int getEnemyHeavyWarriorLevel(){
        return enemyHeavyWarriorLevel ;
    }

    public int getEnemyArcheryLevel(){
        return enemyArcheryLevel ;
    }

    public int getEnemySmithLevel(){
        return enemySmithLevel ;
    }

    public int getEnemyMagicLevel(){
        return enemyMagicLevel ;
    }

    public int getEnemyAlchemyLevel(){
        return enemyAlchemyLevel ;
    }

    //Inventories
    public ArrayList getEnemyWeaponInventory() {
        return enemyWeaponInventory;
    }

    public ArrayList getEnemyArmorInventory() {
        return enemyArmorInventory;
    }

    public Weapon getEnemyEquippedWeapon() {
        return enemyWeaponObject;
    }

    public Armor getEnemyEquippedArmor() {
        return enemyArmorObject;
    }

    //Mutator Methods

    //Permanents
    public void setEnemyName(String newName) {
        newName = name;
    }

    public void setEnemyRace(String newRace) {
        newRace = race;
    }

    //Vitals
    public void setEnemyHealth(int newEnemyHealth) {
        newEnemyHealth = enemyHealth;
    }

    public void setEnemyMinHealthCapacity(int newMinHealthCapacity) {
        newMinHealthCapacity = enemyMinHealthCapacity;
    }

    //Equips
    public void setEnemyWeaponObject(String enemyEquippedWeapon) {
        for (int i = 0; i < enemyWeaponInventory.size(); i++) {
            Weapon weapon = (Weapon) enemyWeaponInventory.get(i);

            if (weapon.getWeaponName().equals(enemyEquippedWeapon))
                enemyWeaponObject = weapon;
        }
    }

    public void setEnemyArmorObject(String enemyEquippedArmor) {
        for (int i = 0; i < enemyArmorInventory.size(); i++) {
            Armor armor = (Armor) enemyArmorInventory.get(i);

            if (armor.getArmorName().equals(enemyEquippedArmor))
                enemyArmorObject = armor;
        }
    }

    //Skills
    public void setEnemyLightWarriorLevel(int newEnemyLightWarriorLevel){
        newEnemyLightWarriorLevel = enemyLightWarriorLevel ;
    }

    public void setEnemyHeavyWarriorLevel(int newEnemyHeavyWarriorLevel){
        newEnemyHeavyWarriorLevel = enemyHeavyWarriorLevel ;
    }

    public void setEnemyArcheryLevel (int newEnemyArcheryLevel){
        newEnemyArcheryLevel = enemyArcheryLevel ;
    }

    public void setEnemySmithLevel(int newEnemySmithLevel){
        newEnemySmithLevel = enemySmithLevel ;
    }

    public void setEnemyMagicLevel (int newEnemyMagicLevel) {
        newEnemyMagicLevel = enemyMagicLevel ;
    }

    public void setEnemyAlchemyLevel (int newEnemyAlchemyLevel){
        newEnemyAlchemyLevel = enemyAlchemyLevel ;
    }


//Combat Methods

   public int damageCharacter (Weapon enemyWeaponObject)
   {
       int damageCharacterPoints ;

       if (enemyWeaponObject.getWeaponType().equals("light warrior"))
       {
           damageCharacterPoints = enemyWeaponObject.getDamagePoints() + (enemyLightWarriorLevel/2) ;
           return damageCharacterPoints ;
       }

       else if (enemyWeaponObject.getWeaponType().equals("heavy warrior"))
       {
           damageCharacterPoints = enemyWeaponObject.getDamagePoints() + (enemyHeavyWarriorLevel/2) ;
           return damageCharacterPoints ;
       }

       else if (enemyWeaponObject.getWeaponType().equals("archery"))
       {
           damageCharacterPoints = enemyWeaponObject.getDamagePoints() + (enemyAlchemyLevel/2) ;
           return damageCharacterPoints ;
       }
       else
        return 0 ;
   }
}