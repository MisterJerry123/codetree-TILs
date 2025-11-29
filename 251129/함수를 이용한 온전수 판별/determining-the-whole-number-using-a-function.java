import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int cnt=0;
        for(int i=start;i<=end;i++){
            if(isnum(i)){
                cnt++;
            }
        }
        System.out.println(cnt);

        
    }

    public static boolean isnum(int a){
        String str = Integer.toString(a);
        if(a%2==0 || a%10==5 ||(a%3==0 && a%9!=0)){
            return false;
        }
        else{
            return true;
        }
    }
}