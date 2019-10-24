import javax.swing.*;

public class BordTabl {
    public static void main(String[] args) {
        /* ┏ ━ ┳ ━ ┓
           ┃   ┃   ┃
           ┗ ━ ┻ ━ ┛
           ┣ ━ ╋ ━ ╋ ━ ┫




         */
        System.out.println(affichBord(2, 5, "┏", "━", "┳", "┓", "┃", "┗", "┻", "━", "┛", "┣", "╋", "┫"));
    }

    public static String affichBord(int col, int lig, String deb, String mil, String cont, String fin, String sui, String derDeb, String derMil, String derCont, String derFin, String intDeb, String intMil, String intFin) {
        /* gestion de la première ligne*/
        String tab = "";
        tab += affichHaut(col, lig, deb, mil, cont, fin);

        String rec = "";
        for (int j = 0; j <= lig; j++) {
            if (j != 1) {
                for (int k = 0; k <= col + 1; ++k) {
                    if (k != col + 1) {
                        rec = rec + sui + " ";
                    } else
                        rec = rec + " \n";

                }
                if (j != lig && lig != 1) {
                    for (int k = 0; k <= col ; ++k) {

                            if (k == 0) {
                                rec = rec + intDeb + " ";
                            } else if (k < col) {
                                rec = rec + intMil + " ";
                            } else {
                                rec = rec + intFin;
                            }

                    }
                    rec = rec + " \n";
                }
            }
        }
        /* ajout de la  dernier ligne + avec un retour à la ligne*/
        rec = rec + derDeb;
        for (int i = 1; i <= col; i++) {
            if (i< col) {
                rec = rec + derCont + derMil;
            } else{
                rec = rec +derCont + derFin;
            }
        }
        tab += rec;

        return tab;
    }

    public static String affichHaut(int col, int lig, String deb, String mil, String cont, String fin) {
        String rec = deb;

        for (int i = 1; i <= col; i++) {
            if (col > 1 && i != col) {
                rec += mil + cont;
            } else if (i == col) {
                rec += mil + fin + "\n";
            }
        }
        return rec;
    }
}

