import java.util.Scanner;
public class LowerCase {
static String toLowerCase(String str) {

    String res = "";
    for (int i=0; i<str.length(); i++) {
        if(str.charAt(i)>=65 && str.charAt(i) <= 90) {
            res += (char)(str.charAt(i)+32);
        }
        else {
            res += str.charAt(i);
        }
    }
    return res;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toLowerCase(str));
    }
}
