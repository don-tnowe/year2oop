package guesser;

public abstract class GuessedOutOfBoundsException extends Exception{
    int value;
    int bound;
    public GuessedOutOfBoundsException(int value, int bound) {
        this.value = value;
        this.bound = bound;
    }
}
