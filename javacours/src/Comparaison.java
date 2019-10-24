public class Comparaison {
    public static void main(String[] args) {
        System.out.println ("est-ce que 0.3 == (3*0.1)?" + (0.3 == (3*0.1 )));
        System.out.println ("est-ce que 0.5 == (2*0.25)?" + (0.5 == (2*0.25 )));
        System.out.println ("est-ce que 0.3f == (3*0.1f)?" + (0.3f == (3*0.1f )));
        int idx = -1;
        boolean[]data={true, false,false};
        boolean win = (idx>=0) && data[idx];
        boolean fail = data[idx] && (idx<=0);
    }
}
