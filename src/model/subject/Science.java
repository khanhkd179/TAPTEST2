package model.subject;

import exception.WrongScoreFormatException;

public class Science extends Subject {
    public Science(int score) throws WrongScoreFormatException {
        super(score);
    }
}
