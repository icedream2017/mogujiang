/**
 * Created by Andreas on 2018/11/15.
 */
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入字符串：");
        string = scanner.nextLine();
        int fullLength = string.length();
        int numberCount = fullLength - string.replaceAll("\\d", "").length();
        int englishCount = fullLength - string.replaceAll("[a-zA-Z]", "").length();
        int chineseCount = fullLength - numberCount - englishCount;
        System.out.println("中文字符个数："+chineseCount);
        System.out.println("英文字符个数："+englishCount);
        System.out.println("数字字符个数："+numberCount);
    }
}
