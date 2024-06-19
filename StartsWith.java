import java.util.Scanner;

public class StartsWith {
    static boolean startsWith(String original,String check) {

        for (int i=0; i<check.length(); i++) {
            if(original.charAt(i) != check.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String check = sc.nextLine();
        System.out.println(startsWith(original,check));
    }
}
