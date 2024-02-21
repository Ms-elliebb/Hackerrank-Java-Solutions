
import java.util.*;

public class Solution {
    static int area;
    static int b;
    static int h;
    static boolean test;
     static {
        Scanner sc=new Scanner(System.in);   
        b=sc.nextInt();
        h=sc.nextInt(); 
        
        sc.close();
        
        if(b>0 &&h>0){
            area=b*h;
           test=true;
            }
        else{
           test=false;
        }    
        }

    public static void main(String[] args) {
       if (test) 
       System.out.println(area);
       
       else {
           System.out.println("java.lang.Exception: Breadth and height must be positive");
           } 
        
    }
}
