import java.util.Scanner;
public class Main {
    public static boolean iseven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean ismulby5(int a){
        String first = Integer.toString(a);
        int first2Int = Integer.parseInt(first.substring(0,1));
    
        String second = Integer.toString(a);
        int second2Int = Integer.parseInt(second.substring(1,2));

        int result = first2Int+second2Int;


        if((result)%5==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(iseven(n) && ismulby5(n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}