package oop1.ex;

public class Ractangle {
    int witdh;
    int height;

    int calculatorArea() {
        return witdh * height;
    }

    int calculatorPerimeter() {
        return  (witdh + height) * 2;
    }

    boolean isSquare() {
        return this.witdh == this.height;
    }
}
