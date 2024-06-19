import java.util.Scanner;

public class Contains {
    static boolean contains(String original,String check) {
        int count=0;

        // count also must be less than check.length
        for (int i=0; i<original.length() && count<check.length(); i++) {
            if(original.charAt(i) == check.charAt(count)) {
                count++;
            }
            else {
                count = 0;
            }
        }

        return count == check.length();

        }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String check = sc.nextLine();
        System.out.print(contains(original,check));
        }
    }

