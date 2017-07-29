package report;

public class ReportCardSwitch {
    public char convertGrades(int testResult) {
        char grade;
        if (testResult >= 90) {
            grade = 'A';
        } else if (testResult >= 80 && testResult < 90) {
            grade = 'B';
        } else if (testResult >= 70 && testResult < 80) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        return grade;
    }

    public static void main(String[] args) {
        ReportCard rc = new ReportCard();
        char yourGrade = rc.convertGrades(88);

        switch (yourGrade) {
            case 'A':
                System.out.println("Превосходная работа!");
                break;
            case 'B':
                System.out.println("Хорошая работа!");
                break;
            case 'C':
                System.out.println("Надо доработать!");
                break;
            case 'D':
                System.out.println("Переделать!");
                break;


        }
    }
}
