/**
 * Created by Andreas on 2018/11/15.
 */
public class Car extends Vehicle {
    private int loader;

    public Car(String brand, String color, int loader) {
        super(brand,color);
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    @Override
    public void run() {
        System.out.println("轿车正在奔跑。");
        System.out.println("品牌："+this.getBrand());
        System.out.println("颜色："+this.getColor());
        System.out.println("载人数："+this.getLoader());
        System.out.println("速度："+this.getSpeed());
    }
}
