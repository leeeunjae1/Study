package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        // add()함수의 리턴값 사용안했기 떄문에 객체 GC로 사라짐
        obj1.add(20);

        System.out.println("obj1 = " + obj1.getValue());
    }
}
