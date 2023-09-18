package main.java.ki306.hlukhenkyi.lab3.models;

/**
 * The {@code CargoTransport} interface defines the contract for any class that
 * represents a cargo transport vehicle. Classes implementing this interface
 * must provide implementations for loading and unloading cargo.
 *
 * @author Dmytro Hlukhenkyi
 * @version 1.0
 * @since now
 */
public interface CargoTransport {

    /**
     * Loads cargo into the cargo transport vehicle.
     *
     * @param weight The weight of the cargo to be loaded in kilograms.
     */
    void loadCargo(int weight);

    /**
     * Unloads cargo from the cargo transport vehicle.
     *
     * @param weight The weight of the cargo to be unloaded in kilograms.
     */
    void unloadCargo(int weight);
}

