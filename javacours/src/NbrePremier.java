import java.util.InputMismatchException;
import java.util.Scanner;

public class NbrePremier {
    public static void main(String[] args) {
        /* System.out.println(premier(4));*/
        boolean saisie = false;
        while (saisie == false) {
            Scanner clavier = new Scanner(System.in);
            System.out.println("Veuillez saisir un nombre entier :");

            try {
                int i = clavier.nextInt();
                saisie = true;
                System.out.println(premier(i));
                System.out.println(listePrem(i));
            } catch (InputMismatchException e) {
                System.out.println("ce n'est pas un entier !");
                clavier.nextLine();
            }
        }

    }

    /*regarde si un nombre est premier*/
    public static boolean premier(int nbre) {
        int i = 2;
        boolean prem = true;
        if (nbre == 0 || nbre == 1) {
            prem = false;
            return prem;
        }
        while (i < nbre && prem == true) {
            if (nbre % i == 0) {
                prem = false;
            }
            i++;
        }

            return prem;

    }

        /*recherche tous lesnombres premiers inéfrieurs ou égaux*/
        public static String listePrem ( int nbre1){
            String res = "les nombres premiers inférieurs ou égaux à " + nbre1 + " sont :";
            for (int j = 0; j <= nbre1; j++) {
                if (premier(j) == true) {
                    res = res + " " + j;
                }
            }
            return res;

        }
    }
