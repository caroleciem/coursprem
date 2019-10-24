public class TableauD {
    public static void main (String[] args){
        int[] entier = {-5,-758, -5896};
        String [] carac = {"toto","caroline","andrea", "0123 456 789"};
        System.out.println(stringLenMax(carac));
        System.out.println(calculMax(entier));
    }
    /* recherche la valeur max du tableau*/
    public static int calculMax (int [] tab){
            int max = tab[0];
            for (int v : tab){
              if (v > max) {
                  max = v;
              }
            }
            return max;
        }
    /*recherche la longueur max du tableau*/
    public static int stringLenMax (String [] tab1){
        int lenmax = 0;
        for (String v : tab1){
            if (v.length() > lenmax) {
                lenmax = v.length();
            }
        }
        return lenmax;
    }
}
