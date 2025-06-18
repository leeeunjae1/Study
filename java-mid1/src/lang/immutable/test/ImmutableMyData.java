package lang.immutable.test;

public class ImmutableMyData {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyData changeYear(int year) {
        return new ImmutableMyData(year, this.month, this.day);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

// 위의 답안은 직접 푼 답안
// 아래의 답안은 정석 답안(불변 객체에서 값을 변경하는 경우 with으로 시작하는 경우가 많다.)
//public class ImmutableMyData {
//
//    private final int year;
//    private final int month;
//    private final int day;
//
//    public ImmutableMyData(int year, int month, int day) {
//        this.year = year;
//        this.month = month;
//        this.day = day;
//    }
//
//    public ImmutableMyData withYear(int newyear) {
//        return new ImmutableMyData(newyear, month, day);
//    }
//
//      public ImmutableMyData withMonth(int newMonth) {
//          return new ImmutableMyData(year, newMonth, day);
//    }
//      public ImmutableMyData withDay(int newDay) {
//          return new ImmutableMyData(year, month, newDay);
//      }
//
//    @Override
//    public String toString() {
//        return year + "-" + month + "-" + day;
//    }
//}
