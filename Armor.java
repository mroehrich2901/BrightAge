public class Armor
{
    private final String LIGHT_WARRIOR = "light warrior" ;
    private final String HEAVY_WARRIOR = "heavy warrior" ;

    private final String STEEL_ARMOR = "steel armor" ;
    private final String ORCISH_ARMOR = "orcish armor" ;
    private final String ELVEN_ARMOR = "elven armor" ;
    private final String DWARVEN_ARMOR = "dwarven armor" ;

    private final String PUPIL_WIZARD_ROBES = "pupil wizard robes" ;
    private final String WIZARD_KNIGHT_ROBES = "wizard knight robes" ;
    private final String MASTER_WIZARD_ROBES = "master wizard robes" ;

    private String armorName ;
    private String armorType ;
    private int armorPoints ;

    public Armor(String armorName)
    {
        this.armorName = armorName ;

        if (armorName.equals(STEEL_ARMOR))
        {
            setArmorName(STEEL_ARMOR);
            setArmorType(LIGHT_WARRIOR);
            setArmorPoints(5);
        }

        if (armorName.equals(ELVEN_ARMOR))
        {
            setArmorName(ELVEN_ARMOR);
            setArmorType(LIGHT_WARRIOR);
            setArmorPoints(10);
        }

        if (armorName.equals(DWARVEN_ARMOR))
        {
            setArmorName(DWARVEN_ARMOR);
            setArmorType(HEAVY_WARRIOR);
            setArmorPoints(15);
        }

        if (armorName.equals(ORCISH_ARMOR))
        {
            setArmorName(ORCISH_ARMOR);
            setArmorType(HEAVY_WARRIOR);
            setArmorPoints(20);
        }
    }

    // Accessor Methods:

    public String getArmorName () {return armorName ; }

    public String getArmorType () { return armorType;}

    public int getArmorPoints() {return armorPoints ;}


    //Mutator Methods:

    public void setArmorName (String newArmorName){armorName = newArmorName ; }

    public void setArmorType (String newArmorType) {armorType = newArmorType;}

    public void setArmorPoints (int newArmorPoints) {armorPoints= newArmorPoints ;}


    // toString

    public String toString () {return armorName ;}


}
