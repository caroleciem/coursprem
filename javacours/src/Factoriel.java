public class Factoriel {
    public static void main(String[] args){
        long res = factorial(4);
        System.out.println(res);
    }
    public static long factorial(long n){
        if(n < 2){
            return 1;
        }// on pourrait avoir un else
        long res = n * factorial(n-1);
        return  res;
    }
}
