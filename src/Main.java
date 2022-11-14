public class Main {
    public static void main(String[] args) {

        // public abstract double getPerimeter() абстракт методун  Shape деген класска кошунуз.
        // Ал методту ишке ашырган 5 мурастоочу класс тузунуз жана методту ишке ашырыныз.

        Shape[] shapes = {new Triangle(), new Rectangle(), new Circle(), new Rectangle2(), new Quadrate()};

        for (Shape shape:shapes) {
            System.out.println(shape.toString());
            System.out.println("  The perimeter is: --------->  "+shape.getPerimeter());
        }
    }
}