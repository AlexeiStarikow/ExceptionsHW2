package HomeWork2.Task1;
/**
 * Класс исключения, которое будет выброшено, в случае если в программу передали отрицательное число
 */
public class InvalidNumberException extends Exception{
    public InvalidNumberException(String message) {
        super(message);
    }
}