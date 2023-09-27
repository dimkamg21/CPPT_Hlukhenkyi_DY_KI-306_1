package KI306.Hlukhenkyi.lab5;

public class NegativeSinInputException extends Exception {
    public NegativeSinInputException() {
        super("Введене число для обчислення sin(x) є від'ємним.");
    }
//    public NegativeSinInputException(String message) {
//        super(message);
//    }
}
