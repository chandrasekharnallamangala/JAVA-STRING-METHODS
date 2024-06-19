import java.util.Scanner;

public class SpecificOccurance {
    static int specificOccur(String str,char ch,int occurance) {

        int count = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == ch){
                count++;
                if (count == occurance){
                    return i+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        int occurance = sc.nextInt();
        System.out.println(specificOccur(str,ch,occurance));
    }
}
