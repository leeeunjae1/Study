package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java"); //String 클래스는 불변, 따라서 내부에서 객체를 재생성 후 str2에 메모리 참조
        System.out.println(str2);
    }
}
