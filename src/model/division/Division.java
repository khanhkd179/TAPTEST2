package model.division;

import model.subject.Subject;

import java.util.List;

public abstract class Division {

    private List<Subject> subjectList;


    public abstract List<Class> getSublistSubject();

    public abstract int getPassScore();

    public Division(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }
}
