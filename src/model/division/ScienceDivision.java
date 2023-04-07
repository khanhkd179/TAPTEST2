package model.division;

import constants.Constant;
import model.subject.*;

import java.util.Arrays;
import java.util.List;

public class ScienceDivision extends Division {
    public ScienceDivision(List<Subject> subjectList) {
        super(subjectList);
    }

    @Override
    public List<Class> getSublistSubject() {
        return Arrays.asList(Mathematic.class, Science.class);
    }

    @Override
    public int getPassScore() {
        return Constant.SCIENCE_PASS_SCORE;
    }
}
