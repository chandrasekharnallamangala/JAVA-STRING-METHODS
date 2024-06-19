import java.util.Scanner;

public class EndsWith {
    static boolean endsWith(String original,String check) {
        int OriginalLength = original.length()-1;
        for (int i=check.length()-1; i>=0; i--) {
            if(original.charAt(OriginalLength) != check.charAt(i)) {
                return false;
            }
            else {
                OriginalLength--;
            }
        }
        return true;
    }

    // otherwise we can follow from forward direction
    // we can get the forward length by originalLength() - check.length()
    // from here we can compare the strings by forward direction

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String check = sc.nextLine();
        System.out.println(endsWith(original,check));
    }
}
