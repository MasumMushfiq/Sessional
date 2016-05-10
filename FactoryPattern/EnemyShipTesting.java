package Sessional.FactoryPattern;

import java.util.Scanner;

/**
 * Created by Mushfiq on 5/9/2016.
 */
public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);
        String enemyShipOption = "";

        System.out.println("What type of ship? (U / R / B)");

        if (userInput.hasNextLine()) {
            enemyShipOption = userInput.nextLine();
            theEnemy = enemyShipFactory.makeEnemyShip(enemyShipOption);
        }

        if (theEnemy != null) {
            doStuffEnemy(theEnemy);
        } else {
            System.out.println("Enter a U, R or B next time. :)");
        }

    }

    public static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
