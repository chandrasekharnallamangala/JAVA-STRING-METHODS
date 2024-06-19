import java.util.Scanner;

public class Trim {
    static String trim(String str) {

        int start = 0;
        int end = str.length()-1;

        for (int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                start = i;
                break;
            }
        }

        for (int j=str.length()-1 ;j>=0; j--){
            if (str.charAt(j) != ' '){
                end = j;
                break;
            }
        }
        String res="";
        for (int k=start; k<end; k++){
            res += str.charAt(k);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = trim(str);
        System.out.println(res);
    }
}
