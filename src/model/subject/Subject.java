package model.subject;


import constants.Constant;
import exception.WrongScoreFormatException;

public abstract class Subject {
    private int score;

    public Subject(int score) throws WrongScoreFormatException {
        if (score > Constant.MAX_SCORE || score < Constant.MIN_SCORE)
            throw new WrongScoreFormatException("Wrong score format! score is between 0 and 100.");
        this.score = score;
    }

    public int getScore() {
        return score;
    }

}
