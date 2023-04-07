package service;


public class CheckerFactory {
    //    public static Checker create(Division division){
//        if(division instanceof HumanityDivision)
//            return new HumanityCheckerImpl();
//        if(division instanceof ScienceDivision)
//            return new ScienceCheckerImpl();
//        return null;
//    }

    public static Checker create() {
        return new CheckerImpl();
    }
}
