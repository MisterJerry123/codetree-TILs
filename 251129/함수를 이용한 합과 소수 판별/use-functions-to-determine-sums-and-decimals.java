import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int cnt=0;
        for(int i=start;i<=end;i++){
            if(suitCondition(i)){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
    public static boolean suitCondition(int a){
        if(isSosu(a) && isAllEven(a)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isSosu(int a){
        for(int i=2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isAllEven(int a){
        if((a/10+a%10)%2==0){
            return true;
        }
        else
        return false;
    }

}