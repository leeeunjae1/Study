package enumeration.test;

public class AuthGradeMain1 {

    public static void main(String[] args) {

        AuthGrade[] authGrades = AuthGrade.values();
        for (AuthGrade authGrade : authGrades) {
            authGradeInfo(authGrade);
        }
    }

    private static void authGradeInfo(AuthGrade authGrade) {
        System.out.println("grade = " + authGrade.name() + ", level = " + authGrade.getlevel() + ", 설명 = " + authGrade.getDescription());
    }
}
