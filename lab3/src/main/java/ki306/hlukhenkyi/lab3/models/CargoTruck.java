package main.java.ki306.hlukhenkyi.lab3.models;

/**
 * The {@code CargoTruck} class represents a cargo truck, which is a specific type of car
 * with the ability to load and unload cargo. It extends the {@link Car} class.
 *
 * @author Dmytro Hlukhenkyi
 * @version 1.0
 * @since [Date]
 */
public class CargoTruck extends Car {
    private int cargoCapacity;

    /**
     * Constructs a cargo truck with the specified brand, manufacturing year, and cargo capacity.
     *
     * @param brand            The brand of the cargo truck.
     * @param manufacturingYear The manufacturing year of the cargo truck.
     * @param cargoCapacity    The maximum cargo capacity in kilograms that the truck can carry.
     */
    public CargoTruck(String brand, int manufacturingYear, int cargoCapacity) {
        super(brand, manufacturingYear);
        this.cargoCapacity = cargoCapacity;
    }

    /**
     * Loads cargo into the cargo truck, if there is enough available cargo space.
     *
     * @param weight The weight of the cargo to be loaded in kilograms.
     */
    @Override
    public void loadCargo(int weight) {
        if (weight <= cargoCapacity) {
            cargoCapacity -= weight; // Decrease the available cargo space.
            System.out.println("Loaded " + weight + " kg of cargo.");
        } else {
            System.out.println("Not enough cargo space to load " + weight + " kg.");
        }
    }

    /**
     * Unloads cargo from the cargo truck, if the specified weight can be accommodated.
     *
     * @param weight The weight of the cargo to be unloaded in kilograms.
     */
    @Override
    public void unloadCargo(int weight) {
        if (weight <= cargoCapacity) {
            cargoCapacity += weight; // Increase the available cargo space.
            System.out.println("Unloaded " + weight + " kg of cargo.");
        } else {
            System.out.println("Cannot unload " + weight + " kg, as it exceeds the cargo capacity.");
        }
    }
}
