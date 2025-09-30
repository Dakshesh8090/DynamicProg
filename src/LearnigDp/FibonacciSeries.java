package LearnigDp;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n= 10;
        int n1 = 0;
        int n2 = 1;

        System.out.println("Fibonacci series up to " + n + " terms");
        System.out.print( n1 + " " + n2);
        for(int i = 2 ; i < n ;i++){
            int n3 = n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
