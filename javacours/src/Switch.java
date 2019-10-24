public class Switch {
    public static void main(String[] args) {
        int i = 3;
        int j = 4;
        char op = '*';
        aritm(3,4, '*');
        System.out.println(aritm(3,4, '*'));
    }
    public static long aritm  (int i, int j, char op){
        long res = 0;
        switch (op) {
            case '-': {
                res = i - j;
                break;
            }
            case '+': {
                res = i + j;
                break;
            }
            case '*': {
                res = i * j;
                break;
            }
            case '/': {
                res = i / j;
                break;
            }
            default: {
                System.err.println("operation " + op + " inconnu");
            }
        }
        return res;

    }
}
