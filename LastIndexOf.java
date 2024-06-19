import java.util.Scanner;

public class LastIndexOf {
    static int lastIndex(String str,char ch) {
        int index = 0;

        // or use loop from last to first
        //first from last is the last occurance
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                index = i;
            }
        }
        if (index != 0) {
            return index + 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        System.out.println(lastIndex(str,ch));
    }
}
