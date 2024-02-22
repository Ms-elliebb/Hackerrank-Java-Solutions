import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        int sumWords=A.length()+B.length();
        System.out.println(sumWords);
        int compare=A.compareTo(B);
        if(compare<=0){
            System.out.println("No");
        }
        else 
        System.out.println("Yes");
        
        String capitalA=String.format("%s%s", Character.toUpperCase(A.charAt(0)),A.substring(1));
        String capitalB=String.format("%s%s", Character.toUpperCase(B.charAt(0)),B.substring(1));
        
System.out.println(capitalA+" "+capitalB);
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
