package guesser;

public class GuessedTooLowException extends GuessedOutOfBoundsException{
    public GuessedTooLowException(int value, int bound) {
        super(value, bound);
    }
    public String toString() {
        return "GuessedTooLowException: Guessed number too low (guessed " + value + ", min bound " + bound + ")";
    }
}
