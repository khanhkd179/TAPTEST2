package service;

import model.division.Division;

public interface Checker {
    public boolean checkTotalStage(Division division);

    public boolean canPass(Division division);

}
