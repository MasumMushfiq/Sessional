package Sessional.FactoryPattern;

/**
 * Created by Mushfiq on 5/9/2016.
 */
public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String choice) {
        EnemyShip enemyShip = null;

        if (choice.equalsIgnoreCase("U")) {
            return new UFOEnemyShip();
        } else
            if (choice.equalsIgnoreCase("R")) {
                return new  RocketEnemyShip();
            } else
                if (choice.equalsIgnoreCase("B")) {
                    return new BigUFOEnemyShip();
                } else {
                    return null;
                }
    }
}
