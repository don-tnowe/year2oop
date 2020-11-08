package guesser;

import java.util.Random;

public class Guesser {
    private int min;
    private int max;
    private int generatedNum = 0;

    public Guesser(int min, int max){
        this.min = min;
        this.max = max;

        Random random = new Random();
        generatedNum = random.nextInt(max - min) + min;
    }

    public boolean guess(int value) throws GuessedOutOfBoundsException {
        if (value == generatedNum)
            return true;
        else if (value > max)
            throw new GuessedTooHighException(value, max);
        else if (value < min)
            throw new GuessedTooLowException(value, min);
        else
            return false;
    }

}
