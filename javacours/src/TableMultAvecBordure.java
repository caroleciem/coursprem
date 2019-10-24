public class TableMultAvecBordure {
    public static void main(String[] args) {
        System.out.println(tableMult(10, 9));
    }

    public static String tableMult(int n, int m) {
        int[][] tab = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tab[i][j] = (j + 1) * (i + 1);
            }
        }
        String res = "";
        int nbreMax = (Tableau2D.calculMaxD(tab));
        /* je prépare la bordure du haut de mon tableau*/
        res += affichLig(m, n, "┏", "━", "┳", "┓",nbreMax);

        /* je prépara l'intérieur du tableau*/
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res += "┃";
                /* nbreAff est le nombre que je suis en train de vouloir afficher*/
                int nbreAff = tab[i][j];
                int difB = (Integer.toString(nbreMax).length()) - Integer.toString(nbreAff).length();
                if (Integer.toString(nbreAff).length() < (Integer.toString(nbreMax).length())) {

                    for (int b = 0; b < difB ; b++) {
                        res += " ";
                    }
                    res += " "+tab[i][j];

                } else {
                    res += " "+ tab[i][j] ;
                }
            }
            res += "┃\n";
            /* après avoir affiché mes résultats, je mets ma bordure du milieu*/
            if (i<n-1) {
                res += affichLig(m, n, "┣", "━", "╋", "┫", nbreMax);
            }
        }
        /* je mets la bordure du bas de mon tableau*/
        res += affichLig(m, n, "┗", "━", "┻", "┛",nbreMax);

        return res;
    }
    public static String affichLig(int col, int lig, String deb, String mil, String cont, String fin, int nbreMax) {
        /* je mets mon caractère de début de ligne*/
        String res = deb;
        int difBlanc = (Integer.toString(nbreMax).length());
        /*milieu adapté*/
        String milAdap = mil;
        /* je calcule quel sera le mileiu adapté avec mon nbre max pour avoir un tableau cadré*/
        for (int b = 0; b < difBlanc; b++) {
            milAdap += mil;
        }
        for (int i = 1; i <= col; i++) {
            if (col > 1 && i != col) {
                res += milAdap + cont;
            } else if (i == col) {
                /* au bout de la ligne, je mets le caractère de fin*/
                res += milAdap + fin + "\n";
            }
        }
        return res;
    }


}


