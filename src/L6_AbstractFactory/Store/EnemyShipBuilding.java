package L6_AbstractFactory.Store;

// This is the only class that needs to change, if you
// want to determine which enemy ships you want to
// provide as an option to build

import L6_AbstractFactory.Product.EnemyShip;

public abstract class EnemyShipBuilding {

    // This acts as an ordering mechanism for creating
    // EnemyShips that have a weapon, engine & name
    // & nothing else

    // The specific parts used for engine & weapon depend
    // upon the String that is passed to this method

    protected abstract EnemyShip makeEnemyShip(String typeOfShip);

    // When called a new EnemyShip is made. The specific parts
    // are based on the String entered. After the ship is made
    // we execute multiple methods in the EnemyShip Object

    public EnemyShip orderTheShip(String typeOfShip) {
        EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);

        theEnemyShip.makeShip();
        theEnemyShip.displayEnemyShip();
        theEnemyShip.followHeroShip();
        theEnemyShip.enemyShipShoots();

        return theEnemyShip;

    }
}