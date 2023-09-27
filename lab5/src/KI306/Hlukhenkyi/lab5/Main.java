package KI306.Hlukhenkyi.lab5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;

/**
 * Головний клас програми для обчислення виразу та збереження результату у файл.
 *
 * @author Hlukhenkyi Dmytro
 * @since 1.0
 */
public class Main {
    /**
     * Точка входу в програму.
     *
     * @param args Масив аргументів командного рядка.
     */
    public static void main(String[] args) throws IOException {
        String inputFileName = "input.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line = reader.readLine();
            double x = Double.parseDouble(line);

            try {
                ExpressionCalculator calculator = new ExpressionCalculator(x);

                double result = calculator.calculateExpression();
                calculator.saveResultToFile(result);
                System.out.println("Результат обчислення: " + result);
            } catch (ArithmeticException | InputMismatchException e) {
                System.err.println("Помилка обчислення: " + e.getMessage());
            }
        } catch (IOException | NegativeSinInputException e) {
            System.err.println("Помилка при читанні з файлу: " + e.getMessage());
        }
    }
}