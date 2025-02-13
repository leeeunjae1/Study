package access.ex;

public class MaxCounter {

    private int count = 0;
    private int max;

    // 증가 메서드
    void increment() {
        if (vaild(count)) {
            count++;
        } else {
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }

    // 현재의 count 확인
    int getCount() {
        return count;
    }

    //사용자에게 입력된 최댓값, 생성자
    public MaxCounter(int count) {
        max = count;
    }

    // 검증
    private boolean vaild(int count) {
        return max >= count;
    }
}
