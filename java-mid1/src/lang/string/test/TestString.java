package lang.string.test;

public class TestString {

    public static void main(String[] args) {
        String email = "hello@example.com";
        String id, domain;

        String[] emailArr = email.split("@");
        id = emailArr[0];
        domain = emailArr[1];

        System.out.println("ID: " + id);
        System.out.println("Domain: " + domain);
    }
}
