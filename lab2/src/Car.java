import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class Car represents a car entity.
 *
 * This class models a car with a brand, manufacturing year, current speed,
 * and an optional engine. It also provides methods for car operations like starting,
 * stopping, changing the engine, accelerating, decelerating, turning on lights,
 * and displaying car information.
 *
 * @author Hlukehnkyi Dmytro
 * @version 1.0
 * @since 1.0
 */
public class Car {
    private final String brand;
    private final int manufacturingYear;
    private int currentSpeed;
    private Engine engine;
    private FileWriter logFileWriter;
    private final String logFileName = "CarDriver.txt";

    /**
     * Constructs a car with the specified brand, manufacturing year, and engine.
     *
     * @param brand            The brand of the car.
     * @param manufacturingYear The manufacturing year of the car.
     * @param engine           The Engine object representing the car's engine.
     */
    public Car(String brand, int manufacturingYear, Engine engine) {
        this.brand = brand;
        this.manufacturingYear = manufacturingYear;
        this.engine = engine;
        initLogFileWriter();
    }

    /**
     * Constructs a car with the specified brand and manufacturing year.
     * The engine is set to null by default.
     *
     * @param brand            The brand of the car.
     * @param manufacturingYear The manufacturing year of the car.
     */
    public Car(String brand, int manufacturingYear) {
        this.brand = brand;
        this.manufacturingYear = manufacturingYear;
        this.engine = null;
        initLogFileWriter();
    }

    // Private method to initialize the log file writer
    private void initLogFileWriter() {
        try {
            File logFile = new File(logFileName);

            if (!logFile.exists()) {
                logFile.createNewFile();
            }

            logFileWriter = new FileWriter(logFile, true); // Append mode
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Logs a message to the car's log file.
     *
     * @param message The message to be logged.
     */
    public void log(String message) {
        try {
            logFileWriter.write(message + "\n");
            logFileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Disposes of the log file writer and closes the log file.
     *
     * @throws IOException Thrown in case of input/output errors.
     */
    public void dispose() throws IOException {
        if (logFileWriter != null) {
            logFileWriter.close();
        }
    }

    /**
     * Starts the car if an engine is available and logs the activity.
     */
    public void startCar() {
        if (engine != null) {
            System.out.println("Brand: " + brand + " Car started.");
            log("Brand: " + brand + " Car started.");
        } else {
            System.out.println("Cannot start the car without an engine.");
            log("Cannot start the car without an engine.");
        }
    }

    /**
     * Stops the car and logs the activity.
     */
    public void stopCar() {
        System.out.println("Brand: " + brand + " Car stopped.");
        log("Brand: " + brand + " Car stopped.");
    }

    /**
     * Changes the car's engine and logs the activity.
     *
     * @param newEngine The new Engine object to replace the current engine.
     */
    public void changeEngine(Engine newEngine) {
        engine = newEngine;
        System.out.println("Brand: " + brand + " Engine changed.");
        log("Brand: " + brand + " Engine changed.");
    }

    /**
     * Displays information about the car including brand, manufacturing year,
     * and engine details if available.
     */
    public void displayInformation() {
        System.out.println("Brand: " + brand);
        log("Brand: " + brand);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        log("Manufacturing Year: " + manufacturingYear);
        if (engine != null) {
            engine.displayInformation();
        } else {
            System.out.println("Engine not available.");
            log("Engine not available.");
        }
    }

    /**
     * Accelerates the car by increasing its speed by a specified amount.
     *
     * @param accelerationAmount The amount by which to accelerate the car in km/h.
     */
    public void accelerate(int accelerationAmount) {
        if (engine != null) {
            int newSpeed = currentSpeed + accelerationAmount;
            System.out.println("Brand: " + brand + " Car accelerated to " + newSpeed + " km/h.");
            log("Brand: " + brand + " Car accelerated to " + newSpeed + " km/h.");
            currentSpeed = newSpeed;
        } else {
            System.out.println("Cannot accelerate the car without an engine.");
            log("Cannot accelerate the car without an engine.");
        }
    }

    /**
     * Decelerates the car by reducing its speed by a specified amount.
     *
     * @param decelerationAmount The amount by which to decelerate the car in km/h.
     */
    public void decelerate(int decelerationAmount) {
        if (engine != null) {
            int newSpeed = currentSpeed - decelerationAmount;
            if (newSpeed < 0) {
                newSpeed = 0;
            }
            System.out.println("Brand: " + brand + " Car decelerated to " + newSpeed + " km/h.");
            log("Brand: " + brand + " Car decelerated to " + newSpeed + " km/h.");
            currentSpeed = newSpeed;
        } else {
            System.out.println("Cannot decelerate the car without an engine.");
            log("Cannot decelerate the car without an engine.");
        }
    }

    /**
     * Turns on the lights of the car and logs the activity.
     */
    public void turnLightsOn() {
        if (engine != null) {
            Boolean lightsOn = true;
            System.out.println("Brand: " + brand + " Car lights turned on.");
            log("Brand: " + brand + " Car lights turned on.");
        } else {
            System.out.println("Cannot turn on the lights without an engine.");
            log("Cannot turn on the lights without an engine.");
        }
    }
}
