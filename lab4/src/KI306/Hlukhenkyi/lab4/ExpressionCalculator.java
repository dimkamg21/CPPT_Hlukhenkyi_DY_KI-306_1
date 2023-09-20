package KI306.Hlukhenkyi.lab4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Клас ExpressionCalculator виконує обчислення виразу та запис результатів у файл.
 * Вираз: y=2x/sin(x)
 */
public class ExpressionCalculator {
    private double x;

    /**
     * Конструктор для створення об'єкта ExpressionCalculator зі значенням x.
     *
     * @param x Значення x, для якого буде обчислюватися вираз.
     */
    public ExpressionCalculator(double x) {
        this.x = x;
    }

    /**
     * Обчислює вираз y=2x/sin(x)
     *
     * @return Результат обчислення виразу.
     * @throws ArithmeticException Виникає, якщо виникає помилка при діленні на нуль у виразі.
     */
    public double calculateExpression() throws ArithmeticException {
        double sinX = Math.sin(x);

        if (Math.abs(sinX) < 1e-6) {
            throw new ArithmeticException("Ділення на нуль у виразі.");
        }

        return 2 * x / sinX;
    }

    /**
     * Записує результат обчислення виразу у файл "result.txt".
     *
     * @param result Результат обчислення виразу.
     * @throws IOException Виникає, якщо виникає помилка при записі у файл.
     */
    public void saveResultToFile(double result) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter("result.txt"))) {
            writer.println("Результат обчислення виразу: " + result);
        }
    }
}
