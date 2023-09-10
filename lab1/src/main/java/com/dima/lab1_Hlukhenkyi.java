package main.java.com.dima;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Class lab1_Hlukhenkyi  implements laboratory work №1
 *
 * @author Dmytro Hlukhenkyi
 * @version 1.0
 * @since version 1.0
 *
 */

public class lab1_Hlukhenkyi {
    /**
     * The static main method is the entry point to the program. It calls other methods to perform
     *    matrix generation, display, and file saving.
     *
     * @param args The command-line arguments passed to the program.
     *
     */
    public static void main(String[] args){

        int size = inputSize();
        char symbol = inputFiller();
        char[][] juggedArr = generateJaggedArr(size, symbol);

        showJuggedArr(juggedArr);
        saveJuggedArrToFile(juggedArr);

    }

    /**
     * Reads and validates the size of the square matrix from the user.
     *    It handles input exceptions and keeps prompting until a valid size is provided.
     *
     * @return int size of matrix
     */
    public static int inputSize(){
        Scanner scanner = new Scanner(System.in);
        int size;

        while(true){
            try {
                System.out.print("Enter size of square matrix: ");
                size = scanner.nextInt();
                break;
            }
            catch (Exception e) {
                System.out.println(e.getMessage() + ". Please enter a number");
                scanner.next();
            }
        }
        return size;
    }

    /**
     * Reads and validates the character to fill the matrix from the user.
     *     It handles input exceptions and keeps prompting until a valid character is provided.
     *
     * @return The character symbol provided by the user.
     */
    public static char inputFiller(){
        Scanner scanner = new Scanner(System.in);
        char symbol;

        while(true){
            try {
                System.out.print("Enter character to fill matrix: ");
                String str = scanner.nextLine();

                if (str.isEmpty() || str.charAt(0) == ' '){
                    continue;
                }
                symbol = str.charAt(0);
                break;
            }
            catch (Exception e) {
                System.out.println(e.getMessage() + ". Please enter a character");
                scanner.next();
            }
        }
        return symbol;
    }

    /**
     * Generates a jagged square matrix
     *    of the specified size and fills it with the provided character.
     *
     * @param size    The size of the square matrix to be generated.
     * @param symbol  The character to fill the matrix with.
     * @return        The generated jagged square matrix as a 2D character array.
     */
    public static char[][] generateJaggedArr(int size, char symbol){
      char[][] juggedArr = new char[size][size];

      for (int i = 0; i < size; i++) {
          int spaces = Math.abs(i - size / 2); // Calculate the number of spaces

          Arrays.fill(juggedArr[i], ' '); // Fill the row with spaces

          for (int j = size / 2 - spaces; j <= size / 2 + spaces; j++) {
              juggedArr[i][j] = symbol; // Set the symbol in the pattern
          }
      }

      return juggedArr;
  }

    /**
     * Displays the generated jagged square matrix
     *    in the console.
     *
     * @param juggedArr  The jagged square matrix to be displayed.
     */
    public static void showJuggedArr(char[][] juggedArr) {
        for (char[] charArr : juggedArr) {
            for (char ch : charArr) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    /**
     * Saves the generated jagged square matrix
     *    to a text file named "lab2/MyFile.txt".
     *
     * @param juggedArr  The jagged square matrix to be saved to the txt file.
     */
    public static void saveJuggedArrToFile(char[][] juggedArr) {
        try {
            PrintWriter writer = new PrintWriter("MyFile.txt");

            for (char[] charArr : juggedArr) {
                for (char ch : charArr) {
                    writer.print(ch + " ");
                }
                writer.print("\n");
            }

            writer.flush();
            writer.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
