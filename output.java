import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                int spaces = 15-s1.length();
                String zeros=String.format("%03d", x);
                System.out.print(s1);
                for(int j=0;j<spaces;j++) {
                    System.out.print(" ");
                }
                System.out.println(zeros);
            }
            System.out.println("================================");
            sc.close();
    }
}



