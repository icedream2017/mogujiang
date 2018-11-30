/**
 * Created by Andreas on 2018/11/15.
 */
public abstract class Shape {
    double area;
    double per;
    private String color;

    public Shape() {}

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPer();

    public String getColor() {
        return this.color;
    }

    public abstract void showAll();

}
