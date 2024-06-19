import java.awt.*;
import java.util.Scanner;

public class Replace {
    static String replace(String str,char ch,char rep) {
        String replaced_str = "";

        for (int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch) {
                replaced_str += rep;
            }
            else {
                replaced_str += str.charAt(i);
            }
        }
        return replaced_str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char orig_str = sc.next().charAt(0);
        char mod_str  = sc.next().charAt(0);
        System.out.println(replace(str,orig_str,mod_str));
    }
}
