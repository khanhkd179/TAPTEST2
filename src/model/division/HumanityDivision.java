package model.division;


import constants.Constant;
import model.subject.GeographyAndHistory;
import model.subject.Japanese;
import model.subject.Subject;

import java.util.Arrays;
import java.util.List;

public class HumanityDivision extends Division {

    public HumanityDivision(List<Subject> subjectList) {
        super(subjectList);
    }

    @Override
    public List<Class> getSublistSubject() {
        return Arrays.asList(Japanese.class, GeographyAndHistory.class);
    }

    @Override
    public int getPassScore() {
        return Constant.HUMANITY_PASS_SCORE;
    }
}
