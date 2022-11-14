public class Rectangle2 extends Shape{
    int a = 45;
    int b = 32;
    int c = 45;
    int d = 32;

    @Override
    public String toString() {
        return "Rectangle { " +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ": P = 2 * ("+a+" + "+b+" )"+" }";
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }
}
