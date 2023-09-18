package main.java.ki306.hlukhenkyi.lab3;

import main.java.ki306.hlukhenkyi.lab3.models.*;

/**
 * The {@code CarDriver} class serves as a driver program to test and demonstrate
 * the functionality of the {@link Car} class, which represents a car in the automotive domain.
 * It creates instances of the Car class, performs various actions on them, and displays
 * information about the cars and their engines.
 */
public class CarDriver {
    /**
     * The main method is the entry point for the CarDriver program.
     * It creates instances of the Car class, demonstrates their functionality,
     * and displays information about the cars.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create an engine for the first car
        Engine engine1 = new Engine("Gasoline", 2.0);

        // Create a cargo truck
        CargoTruck cargoTruck = new CargoTruck("Ford", 2022, 5000); // Specify cargo capacity (in kg)

        // Display information about the cargo truck
        cargoTruck.displayInformation();

        // Load cargo into the cargo truck
        cargoTruck.loadCargo(3000); // Load 3000 kg of cargo

        // Display updated information about the cargo truck
        cargoTruck.displayInformation();

        // Unload cargo from the cargo truck
        cargoTruck.unloadCargo(2000); // Unload 2000 kg of cargo

        // Display updated information about the cargo truck
        cargoTruck.displayInformation();
    }
}

