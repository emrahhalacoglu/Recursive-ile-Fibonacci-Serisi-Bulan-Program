import java.util.Scanner;
public class Code {

    int x=0;
    static int f(int x){
        while(x>2){
            return f(x-2)+f(x-1);
        }
        return x-1;

    }
    

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Input Fibo No : ");
        int x=input.nextInt();
        System.out.println(f(x));


    }
    
}
