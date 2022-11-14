public class Triangle extends Shape{
    int a = 10;
    int b = 25;
    int c = 20;

    @Override
    public String toString() {
        return "Triangle { " +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ": P = "+a+" + "+b+" + "+c+" }";
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
