package lang.string.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            System.out.println(str + ": " + str.length());
            result += arr[i].length();
        }

        System.out.println("sum = " + result);
    }
}
