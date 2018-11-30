/**
 * Created by Andreas on 2018/11/15.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {}
    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        this.area = width*height;
        return this.area;
    }

    @Override
    public double getPer() {
        this.per = 2*(width+height);
        return this.per;
    }

    @Override
    public void showAll() {
        System.out.println("面积："+this.getArea());
        System.out.println("周长："+this.getPer());
        System.out.println("颜色："+this.getColor());
    }
}
