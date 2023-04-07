package service;

import constants.Constant;
import model.division.Division;
import model.subject.Subject;


public class CheckerImpl implements Checker {
    @Override
    public boolean checkTotalStage(Division division) {
        int score = 0;
        for (Subject s : division.getSubjectList()) {
            score += s.getScore();
        }
        return (score >= Constant.TOTAL_PASS_SCORE);
    }

    @Override
    public boolean canPass(Division division) {
        int score = 0;
        for (Subject s : division.getSubjectList()) {
            if (division.getSublistSubject().indexOf(s.getClass()) != -1) {
                score += s.getScore();
            }
        }
        return (score >= division.getPassScore() && checkTotalStage(division));

    }
}
