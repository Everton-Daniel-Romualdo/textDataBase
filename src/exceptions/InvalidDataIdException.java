package exceptions;

public class InvalidDataIdException  extends Exception{
    public InvalidDataIdException() {
        super("ID NOT FOUND IN THE DATABASE");
    }
}
