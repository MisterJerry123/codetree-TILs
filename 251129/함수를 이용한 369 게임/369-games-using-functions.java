import java.util.Scanner;
public class Main{
        public static int isIn369(int start, int end){
        int cnt=0;
        for(int i= start;i<=end;i++){
            int init=i;
        while(init!=0){
                int t = init%10;
                if(t==3 || t==6 || t==9 || i%3==0){
                    cnt++;
                    //System.out.println("통과"+ init);

                    init/=10;
                    break;
                }
                init/=10;
            }

        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        System.out.println(isIn369(first,second));

    }

}

