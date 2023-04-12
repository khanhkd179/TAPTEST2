package service;

import model.division.Division;

public interface Checker {
    public int getTotalScore(Division division);
    public int getDivisionScore(Division division);

    public boolean canPass(Division division);

}
