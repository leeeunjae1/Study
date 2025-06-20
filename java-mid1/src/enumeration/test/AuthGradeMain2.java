package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN] : ");
        String myGrade = in.nextLine();

        authGradeLoutine(myGrade);
    }

    private static void authGradeLoutine(String myGrade) {
        if (myGrade.equals("GUEST")) {
            guestLoutine(myGrade);
        } else if (myGrade.equals("LOGIN")) {
            loginLoutine(myGrade);
        } else if (myGrade.equals("ADMIN")) {
            adminLoutine(myGrade);
        } else {
            System.out.println("잘못된 값이 입력되었습니다.");
        }
    }

    private static void guestLoutine(String myGrade) {
        AuthGrade authGrade = AuthGrade.valueOf(myGrade);
        System.out.println("당신의 등급은 " + authGrade.getDescription() +"입니다.");
        System.out.println("==메뉴 목록==");
        System.out.println("- 메인 화면");
    }

    private static void loginLoutine(String myGrade) {
        AuthGrade authGrade = AuthGrade.valueOf(myGrade);
        System.out.println("당신의 등급은 " + authGrade.getDescription() +"입니다.");
        System.out.println("==메뉴 목록==");
        System.out.println("- 메인 화면");
        System.out.println("- 이메일 관리 화면");
    }

    private static void adminLoutine(String myGrade) {
        AuthGrade authGrade = AuthGrade.valueOf(myGrade);
        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");
        System.out.println("==메뉴 목록==");
        System.out.println("- 메인 화면");
        System.out.println("- 이메일 관리 화면");
        System.out.println("- 관리자 화면");
    }
}
