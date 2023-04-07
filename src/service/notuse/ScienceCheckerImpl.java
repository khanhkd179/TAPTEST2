package service.notuse;

import constants.Constant;
import model.division.Division;
import model.subject.Mathematic;
import model.subject.Science;
import model.subject.Subject;
import service.Checker;

public class ScienceCheckerImpl implements Checker {
    @Override
    public boolean checkTotalStage(Division division) {
        int score=0;
        for(Subject s: division.getSubjectList()){
            score+=s.getScore();
        }
        return (score>= Constant.TOTAL_PASS_SCORE);
    }
    @Override
    public boolean canPass(Division division) {
        int score=0;
        for(Subject s: division.getSubjectList()){
            if(s instanceof Science || s instanceof Mathematic){
                score+=s.getScore();
            }
        }
        return (score>= Constant.SCIENCE_PASS_SCORE && checkTotalStage(division));

    }
}
