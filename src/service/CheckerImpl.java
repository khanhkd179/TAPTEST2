package service;

import constants.Constant;
import model.division.Division;
import model.subject.Subject;


public class CheckerImpl implements Checker {
    @Override
    public int getTotalScore(Division division) {
        int score = 0;
        for (Subject s : division.getSubjectList()) {
            score += s.getScore();
        }
        return score;
    }

    @Override
    public int getDivisionScore(Division division) {
        int score = 0;
        for (Subject s : division.getSubjectList()) {
            if (division.getSublistSubject().indexOf(s.getClass()) != -1) {
                score += s.getScore();
            }
        }
        return score;
    }
    @Override
    public boolean canPass(Division division){
        return (getTotalScore(division)>=Constant.TOTAL_PASS_SCORE &&
                getDivisionScore(division)>=division.getPassScore());
    }
}
