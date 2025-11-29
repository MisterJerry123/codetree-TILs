import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int ans = 1;
        int small= n<m ? n:m;
        while(small>0){
            //System.out.println(small);

            if(n%small==0 && m%small==0){
                System.out.println(small);
                break;
            }
            small-=1;
        }
    }
}