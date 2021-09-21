import java.util.Arrays;
import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        System.out.println("Введите любое предложение. Например: “I love java 8 Я люблю java 14 core1”");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().replaceAll("(\\w*[0-9]\\s*)|([а-яА-Я]\\s*)|(\\w*[а-яА-Я]\\w*)", "");
        System.out.println(str);
        String[] arr = (str.split(" "));
        System.out.println(arr.length);
    }

}
