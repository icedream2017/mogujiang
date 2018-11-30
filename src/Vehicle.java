/**
 * Created by Andreas on 2018/11/15.
 */
public class Vehicle {
    private final String brand;
    private String color;
    private double speed;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.speed = 0;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void run() {
        System.out.println("汽车正在奔跑。");
        System.out.println("品牌："+this.getBrand());
        System.out.println("颜色："+this.getColor());
        System.out.println("速度："+this.getSpeed());
    }
}
