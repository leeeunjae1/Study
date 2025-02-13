package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        int sum = 0;

        ProductOrder dubu = new ProductOrder();
        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;

        ProductOrder kimci = new ProductOrder();
        kimci.productName = "김치";
        kimci.price = 5000;
        kimci.quantity = 1;

        ProductOrder cola = new ProductOrder();
        cola.productName = "콜라";
        cola.price = 1500;
        cola.quantity = 2;

        ProductOrder[] productOrders = new ProductOrder[]{dubu, kimci, cola};

        for (int i = 0; i < productOrders.length; i++) {
            ProductOrder p = productOrders[i];
            System.out.println("상품명: " + p.productName + ", 가격:" + p.price + ", 수량:" + p.quantity);
            sum = sum + p.price * p.quantity;
        }
        System.out.println("총 결제 금액: " + sum);

//        for (ProductOrder productOrder : productOrders) {
//            System.out.println("상품명: " + productOrder.productName + ", 가격:" + productOrder.price + ", 수량:" + productOrder.quantity);
//        }
    }
}
