import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.
        int startIdx = findIdx(b[0],a);
        int flag=0;
        if(startIdx==-1){
            System.out.println("No");
            flag=1;
        }
        else{
            int idx=0;
            for(int j=startIdx;j<n2+startIdx;j++){
                if(a[j]!=b[idx] && flag==0){
                    System.out.println("No");
                    flag=1;
                    break;
                }
                else{
                    idx++;
                }
            }
            if(flag==0){
            System.out.println("Yes");

            }
        }
    }

    public static int findIdx(int n, int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;

    }
}