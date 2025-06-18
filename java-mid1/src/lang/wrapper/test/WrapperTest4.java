package lang.wrapper.test;

public class WrapperTest4 {

    public static void main(String[] args) {
        String str = "100";

        //String -> Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        //Integer -> int
        int integer2 = integer1;
        System.out.println("integer2 = " + integer2);

        //int -> Integer
        Integer integer3 = integer2;
        System.out.println("integer3 = " + integer3);
    }
}
