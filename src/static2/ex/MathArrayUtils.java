package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        //인스턴스 생성 금지
    }

    static int sum(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        return total;
    }

    static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    static int min(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    static int max(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

}
