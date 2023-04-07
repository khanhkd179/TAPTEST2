package model.subject;

import exception.WrongScoreFormatException;

public class English extends Subject {
    public English(int score) throws WrongScoreFormatException {
        super(score);
    }
}
