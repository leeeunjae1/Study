package enumeration.ex3;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("Class Basic: " + Grade.BASIC.getClass());
        System.out.println("Class Gold: " + Grade.GOID.getClass());
        System.out.println("Class Diamond: " + Grade.DIAMOND.getClass());

        System.out.println("ref Basic: " + refValue(Grade.BASIC));
        System.out.println("ref Gold: " + refValue(Grade.GOID));
        System.out.println("ref Diamond: " + refValue(Grade.DIAMOND));
    }


    // 참조값 확인하기위해 작성한 코드 (ENUM 클래스에서 toString 오버라이딩하기 때문)
    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
