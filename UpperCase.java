import java.util.Scanner;

public class UpperCase {
    static String toUpperCase(String str) {
        String res = "";

        for (int i=0; i< str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                res += (char)(str.charAt(i) - 32);
            }
            else {
                res += str.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toUpperCase(str));
    }
}
