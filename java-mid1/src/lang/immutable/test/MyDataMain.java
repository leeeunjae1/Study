package lang.immutable.test;

public class MyDataMain {

    public static void main(String[] args) {
        ImmutableMyData data1 = new ImmutableMyData(2025, 6, 18);
        ImmutableMyData data2 = data1;

        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);

        System.out.println("2026 -> data1");
        data1.changeYear(2026);
        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);
    }
}
