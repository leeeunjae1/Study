package enumeration.ex2;

public class ClassGrade {

    public static final ClassGrade Basic = new ClassGrade();
    public static final ClassGrade Gold = new ClassGrade();
    public static final ClassGrade Diamond = new ClassGrade();

    // private 생성자 추가
    private ClassGrade() { }


    /* 타입 안전 열거형 패턴의 장점
    * 타입 안정성 향상 : 정해진 객쳄나 사용할 수 있기 때문에, 잘못된 값 입력 근본적 방지
    * 테이터 일관성 : 정해진 객체만 사용 가능하므로 데이터 일관성 보장
    */
}
