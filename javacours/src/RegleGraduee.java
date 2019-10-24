import java.util.Scanner;

public class RegleGraduee {
    public static void main(String[] args) {
        /*   System.out.println(affich1D(15));*/
        /* System.out.println(affich2D(4, 5));*/
         Scanner clavier =new Scanner(System.in);
         System.out.println ("veuillez saisir votre mot :");
         String line = clavier.nextLine();
         palindrome(line);
    }

    /* fonction d'affichage 1D*/
    public static String affich1D(int nbre) {
        /* ajout du premier caractère*/
        String res = "[";
        for (int n = 1; n <= nbre; n++) {
            /* ajout d'un + tous les 5 sinon -*/
            /*on pourrait écrire res = (n % 5 == 0 && n != 0)? "+":"-"; */
            if (n % 5 == 0 && n != 0) {
                res += "+";
            } else {
                res += "-";
            }
        }
        /* ajout du dernier caractère*/
        res = res + "]";
        return res;
    }

    /* fonction d'affichage 2D*/
    public static String affich2D(int col, int lig) {
        /* gestion de la première ligne*/
        String rec = "+";
        for (int i = 1; i <= col; i++) {
            rec = rec + "-";
        }
        /* ajout du dernier caractère + avec un retour à la ligne*/
        rec = rec + "+ \n";
        for (int j = 0; j <= lig; j++) {
            if (j != 1) {
                for (int k = 0; k <= col + 1; ++k) {
                    if (k == 0 || k == col + 1) {
                        if (k == 0) {
                            rec = rec + "|";
                        } else {
                            rec = rec + "| \n";
                        }
                    } else {
                        rec = rec + " ";
                    }
                }
            }
        }
        /* ajout de la  dernier ligne + avec un retour à la ligne*/
        rec = rec + "+";
        for (int i = 1; i <= col; i++) {
            rec = rec + "-";
        }
        rec = rec + "+ \n";
        return rec;

    }

    /*fonction de dire si palindrome     */
    public static boolean palindrome(String mot) {
        int l = mot.length();
        boolean pal = true;
        char[] mottab = new char[l];
        /*chargement de mon tableau de char*/
        for (int i = 0; i < l; i++) {
            mottab[i] = mot.charAt(i);

           }
        int j = 0;
        do {
            int x = l - j - 1;
            if (mottab[j] != mottab[x]) {
                pal = false;
            }
            j++;
        } while (j < l && pal == true);
        if (pal == true) {
            System.out.println(mot + " est un palindrome");
        }else {
            System.out.println(mot + " n'est pas un palindrome");
        }
        return pal;

    }
}
