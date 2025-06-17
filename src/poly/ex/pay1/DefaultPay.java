package poly.ex.pay1;

public class DefaultPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("걸제 수단이 없습니다.");
        return false;
    }
}
