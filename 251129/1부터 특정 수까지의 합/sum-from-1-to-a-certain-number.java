import java.util.Scanner;
public class Main {
    public static void result(int a){
    int initValue = 1;
    int result=0;
    while(initValue!=a){
        result+=initValue;
        initValue++;
    }
    result+=a;
    System.out.println(result/10);

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        result(num);

    }
}

