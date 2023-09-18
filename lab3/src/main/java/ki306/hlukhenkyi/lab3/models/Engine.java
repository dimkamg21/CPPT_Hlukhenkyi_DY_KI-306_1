package main.java.ki306.hlukhenkyi.lab3.models;

/**
 * The {@code Engine} class represents the engine component of a car.
 * It stores information about the engine type and displacement.
 */
public class Engine {
    private String type;         // The type of the engine (e.g., "Gasoline", "Diesel")
    private final double displacement; // The engine displacement in liters (e.g., 2.0, 2.5)

    /**
     * Constructs an Engine object with the specified type and displacement.
     *
     * @param type         The type of the engine (e.g., "Gasoline", "Diesel").
     * @param displacement The engine displacement in liters (e.g., 2.0, 2.5).
     */
    public Engine(String type, double displacement) {
        this.type = type;
        this.displacement = displacement;
    }

    /**
     * Displays information about the engine, including its type and displacement.
     * Example output:
     * Engine Type: Gasoline
     * Displacement: 2.0 L
     */
    public void displayInformation() {
        System.out.println("Engine Type: " + type);
        System.out.println("Displacement: " + displacement + " L");
    }
}
