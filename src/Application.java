import constants.Constant;
import exception.*;
import model.division.*;
import model.subject.*;
import service.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Application {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = Integer.parseInt(scanner.next());
            int count = 0;
            while (n > 0) {
                List<Subject> subjectList = new ArrayList<>();
                String code = "";
                code = scanner.next();
                subjectList.add(new English(Integer.parseInt(scanner.next())));
                subjectList.add(new Mathematic(Integer.parseInt(scanner.next())));
                subjectList.add(new Science(Integer.parseInt(scanner.next())));
                subjectList.add(new Japanese(Integer.parseInt(scanner.next())));
                subjectList.add(new GeographyAndHistory(Integer.parseInt(scanner.next())));
                Division division = null;
                switch (code) {
                    case Constant.HUMANITY_DIVISION_CODE:
                        division = new HumanityDivision(subjectList);
                        break;
                    case Constant.SCIENCE_DIVISION_CODE:
                        division = new ScienceDivision(subjectList);
                        break;
                    default:
                        throw new DivisionNotFoundException("Division not found");
                }

                Checker checker = new CheckerFactory().create();
                if (checker.canPass(division)) count++;
                n--;
            }
            System.out.println(count);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (WrongScoreFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        (new Application()).run();
    }
}
