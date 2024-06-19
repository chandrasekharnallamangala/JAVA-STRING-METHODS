import java.util.Scanner;

public class indexOf {

    static int IndexOf(String str,char ch) {
        for (int i=0; i<str.length(); i++) {
            if(str.charAt(i) == ch) {

                return i+1;

            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        int index = IndexOf(str,ch);
        System.out.println(index);
    }
}
