package Sessional.FactoryPattern;

/**
 * Created by Mushfiq on 5/9/2016.
 */
public abstract class EnemyShip {
    private String name;
    private double amtDamage;

    public void setName(String Name) {
        name = Name;
    }
    public void setAmtDamage(double AmtDamage) {
        amtDamage = AmtDamage;
    }

    public String getName() {
        return name;
    }
    public double getAmtDamage() {
        return amtDamage;
    }

    public void followHeroShip(){
        System.out.println(name + " is following hero.");
    }
    public void displayEnemyShip() {
        System.out.println(name + " is on the screen.");
    }
    public void enemyShipShoots() {
        System.out.println(name + " attacks hero and does " + amtDamage + " damage." );
    }
}
