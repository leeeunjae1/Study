package enumeration.ex2;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        if (classGrade == ClassGrade.Basic) {
            discountPercent = 10;
        } else if (classGrade == ClassGrade.Gold) {
            discountPercent = 20;
        } else if (classGrade == ClassGrade.Diamond) {
            discountPercent = 30;
        } else {
            System.out.println("할인 X");
        }

        return price * discountPercent / 100;
    }
}
