/**
 * Created by Andreas on 2018/11/15.
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle() {}
    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = (a+b+c)/2;
        this.area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return this.area;
    }

    @Override
    public double getPer() {
        this.per = a+b+c;
        return this.per;
    }

    @Override
    public void showAll() {
        System.out.println("面积："+this.getArea());
        System.out.println("周长："+this.getPer());
        System.out.println("颜色："+this.getColor());
    }
}
