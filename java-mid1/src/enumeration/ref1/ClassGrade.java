package enumeration.ref1;

public class ClassGrade {

    public static final ClassGrade Basic = new ClassGrade(10);
    public static final ClassGrade Gold = new ClassGrade(20);
    public static final ClassGrade Diamond = new ClassGrade(30);

    private final int discountPercent;

    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
