package oop1.ex;

public class RactangleOopMain {

    public static void main(String[] args) {
        Ractangle ractangle = new Ractangle();
        ractangle.witdh = 5;
        ractangle.height = 8;

        int area = ractangle.calculatorArea();
        System.out.println("넓이: " + area);
        int perimeter = ractangle.calculatorPerimeter();
        System.out.println("둘레 길이: " + perimeter);
        boolean square = ractangle.isSquare();
        System.out.println("정사각형 여부: " + square);
    }
}
