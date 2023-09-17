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

        // Create the first car with an engine
        Car car1 = new Car("Toyota", 2022, engine1);

        // Display information about the first car
        car1.displayInformation();

        // Start the first car
        car1.startCar();

        // Accelerate the first car
        car1.accelerate(20); // Accelerate by 20 km/h

        // Decelerate the first car
        car1.decelerate(10); // Decelerate by 10 km/h

        // Turn on the lights of the first car
        car1.turnLightsOn();

        // Display updated information about the first car
        car1.displayInformation();

        // Stop the first car
        car1.stopCar();

        // Create the second car without an engine
        Car car2 = new Car("BMW", 2023);

        // Display information about the second car (without an engine)
        car2.displayInformation();

        // Attempt to accelerate the second car (without an engine)
        car2.accelerate(30); // Should display an error message "Cannot accelerate the car without an engine."
    }
}
