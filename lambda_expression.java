import java.util.Scanner;

interface function{
    int func(int n);
}
public class lambda_expression {
    public static void main(String[] args) {
        function factorial=(n)->{
            int result=1;
            for (int i=1;i<=n;i++){
                result=i*result;
            }
            return result;
        };
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n1=sc.nextInt();
        System.out.println("factorial of 5 is "+factorial.func(n1));
    }
}
