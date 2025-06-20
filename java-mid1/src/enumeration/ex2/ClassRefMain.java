package enumeration.ex2;

public class ClassRefMain {

    public static void main(String[] args) {
        System.out.println("class Basic = " + ClassGrade.Basic.getClass());
        System.out.println("class Gold = " + ClassGrade.Gold.getClass());
        System.out.println("class Diamond = " + ClassGrade.Diamond.getClass());

        System.out.println("ref Basic = " + ClassGrade.Basic);
        System.out.println("ref Gold = " + ClassGrade.Gold);
        System.out.println("ref Diamond = " + ClassGrade.Diamond);
    }
}
