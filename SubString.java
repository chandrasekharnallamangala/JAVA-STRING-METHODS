import java.util.Scanner;

public class SubString {

    // substring returns from starting index to ending index
    static String subString(String str,int start,int end) {
        String temp1 = "";
        for (int i=start-1; i<end-1; i++){
            temp1 += str.charAt(i);
        }
        return temp1;
    }

    // substring returns from starting index till end of the string
    static String SubString(String str,int start) {
        String temp2 = "";
        for (int i=start-1; i<str.length(); i++) {
            temp2 += str.charAt(i);
        }
        return temp2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(subString(str,start,end));
        System.out.println(SubString(str,start));
    }
}
