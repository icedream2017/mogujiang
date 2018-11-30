/**
 * Created by Andreas on 2018/11/15.
 */
public class SumOddNumber {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<1000;i+=2) {
            sum+=i;
        }
        System.out.println("1000以内所有奇数的和是："+sum);
    }
}
