package guesser;

public class GuessedTooHighException extends GuessedOutOfBoundsException{
    public GuessedTooHighException(int value, int bound) {
        super(value, bound);
    }
    public String toString() {
        return "GuessedTooHighException: Guessed number too high " +
                "(guessed " + value + ", max bound " + bound + ")";
    }
}
