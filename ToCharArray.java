import java.util.Scanner;

public class ToCharArray {
static char[] toCharArray(String str) {
    char[] ch = new char[str.length()];
    for (int i=0; i<str.length(); i++) {
        ch[i] = str.charAt(i);
    }
    return ch;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char[] ch = toCharArray(str);

    for (int i=0; i<str.length(); i++) {
        System.out.print(ch[i]);
    }
}

}
