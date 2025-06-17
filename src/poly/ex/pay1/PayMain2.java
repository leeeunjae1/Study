package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.println("결제 수단을 입력하세요:");
            String payOption = in.nextLine();
            if (payOption.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            System.out.println("결제 금액을 입력하세요:");
            int amount = in.nextInt();
            in.nextLine();

            payService.processPay(payOption, amount);
        }
    }
}
