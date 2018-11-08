package L6_AbstractFactory.Factory;

// This factory uses the EnemyShipFactory interface
// to create very specific UFO Enemy Ship

// This is where we define all of the parts the ship
// will use by defining the methods implemented
// being ESWeapon and ESEngine

// The returned object specifies a specific weapon & engine

import L6_AbstractFactory.Component.Engine.ESEngine;
import L6_AbstractFactory.Component.Engine.ESUFOEngine;
import L6_AbstractFactory.Component.Weapon.ESUFOGun;
import L6_AbstractFactory.Component.Weapon.ESWeapon;

public class UFOEnemyShipFactory implements EnemyShipFactory {

    // Defines the weapon object to associate with the ship

    public ESWeapon addESGun() {
        return new ESUFOGun(); // Specific to regular UFO
    }

    // Defines the engine object to associate with the ship

    public ESEngine addESEngine() {
        return new ESUFOEngine(); // Specific to regular UFO
    }
}
