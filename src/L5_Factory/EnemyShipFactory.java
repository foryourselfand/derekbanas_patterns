package L5_Factory;

// This is a factory thats only job is creating ships
// By encapsulating ship creation, we only have one
// place to make modifications

public class EnemyShipFactory{

    // This could be used as a static method if we
    // are willing to give up subclassing it

    public EnemyShip makeEnemyShip(String newShipType){

        switch (newShipType) {
            case "U":
                return new UFOEnemyShip();
            case "R":
                return new RocketEnemyShip();
            case "B":
                return new BigUFOEnemyShip();
            default:
                return null;
        }

    }

}
