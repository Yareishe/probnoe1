public class Shape{
    public String show() {
        return this.getClass().getSimpleName();
    }
}
class ShapeConstructor{
    public String showFigure(Shape shape) {
        return shape.show();
    }
    public static void main(String[] args) {
        ShapeConstructor constructor = new ShapeConstructor();
        System.out.println(constructor.showFigure(new Circle()));
        System.out.println(constructor.showFigure(new Quad()));
        System.out.println(constructor.showFigure(new Triangle()));
        System.out.println(constructor.showFigure(new Diamond()));
        System.out.println(constructor.showFigure(new Square()));
    }
}
class Circle extends Shape{
    public String show() {
        return "circle";
    }
}
class Quad extends Shape{
    public String show() {
        return "quad";
    }
}
class Triangle extends Shape{
    public String show() {
        return "triangle";
    }
}
class Diamond extends Shape{
    public String show() {
        return "diamond";
    }
}
class Square extends Shape{
    public String show() {
        return "square";
    }
}



