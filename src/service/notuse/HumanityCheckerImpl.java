package service.notuse;

import constants.Constant;
import model.division.Division;
import model.subject.*;
import service.Checker;

public class HumanityCheckerImpl implements Checker {
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
            if(s instanceof Japanese || s instanceof GeographyAndHistory){
                score+=s.getScore();
            }
        }
        return score>= Constant.HUMANITY_PASS_SCORE && checkTotalStage(division);

    }
}
