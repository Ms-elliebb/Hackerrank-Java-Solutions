import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nline=0;
        while(sc.hasNext()){
            String a=sc.nextLine();
            System.out.println(++nline+" "+a);
        }
       sc.close();
    }
}
