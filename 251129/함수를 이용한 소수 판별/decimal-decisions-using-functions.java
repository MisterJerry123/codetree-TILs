import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int cnt=0;
        for(int i=start;i<=end; i++){
            if(isSosu(i)){
                cnt+=i;
            }
        }
        System.out.println(cnt);
    }
    public static boolean isSosu(int num){
        for(int i =2;i<num;i++){
            if(num%i==0){
                return false;
            }
        
        }
            //System.out.println(num);
            return true;
    }

}