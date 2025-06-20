package enumeration.test;


import java.util.Scanner;

// 정답 코드
public class AuthGradeMain2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String grade = scanner.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");

        System.out.println("==메뉴 목록==");
        if (authGrade.getlevel() > 0) {
            System.out.println("- 메인 화면");
        }
        if (authGrade.getlevel() > 1) {
            System.out.println("- 이메일 관리 회면");
        }
        if(authGrade.getlevel() > 2) {
            System.out.println("- 관리자 화면");
        }
    }
}
