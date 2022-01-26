public class Weapon {
    // Weapon Name Finals:

    private final String STEEL_SWORD = "steel sword" ;
    private final String ELVEN_SWORD = "elven sword" ;
    private final String DWARVEN_SWORD = "dwarven sword" ;
    private final String ORCISH_SWORD = "orcish sword" ;

    //Weapon Type Finals:

    private final String LIGHT_WARRIOR = "light warrior" ;
    private final String HEAVY_WARRIOR = "heavy warrior" ;
    private final String ARCHERY = "archery" ;


    // Instance Variables

    private String weaponName ;
    private String weaponType ;
    private int damagePoints ;

    public Weapon(String weaponName)  // Constructor
    {
        this.weaponName = weaponName ;


        if (weaponName.equals(STEEL_SWORD))
        {
            setWeaponName(STEEL_SWORD);
            setWeaponType(LIGHT_WARRIOR);
            setDamagePoints(10);
        }

        if (weaponName.equals(ELVEN_SWORD))
        {
            setWeaponName(ELVEN_SWORD);
            setWeaponType(LIGHT_WARRIOR);
            setDamagePoints(15);
        }

        if (weaponName.equals(DWARVEN_SWORD))
        {
            setWeaponName(DWARVEN_SWORD);
            setWeaponType(HEAVY_WARRIOR);
            setDamagePoints(20);
        }

        if (weaponName.equals(ORCISH_SWORD))
        {
            setWeaponName(ORCISH_SWORD);
            setWeaponType(HEAVY_WARRIOR);
            setDamagePoints(25);
        }

    }


    // Accessor Methods:

    public String getWeaponName () {return weaponName ; }

    public String getWeaponType() {return weaponType ;}

    public int getDamagePoints () {return damagePoints ;}

    //Mutator Methods

    public void setWeaponName (String newWeaponName){weaponName = newWeaponName ;}

    public void setWeaponType (String newWeaponType) {weaponType = newWeaponType ;}

    public void setDamagePoints (int newDamagePoints) {damagePoints = newDamagePoints ;}

    //To String method

    public String toString () {return  weaponName ;}

}
