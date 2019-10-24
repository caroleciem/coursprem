public class TableMultip {
    public static void main(String[] args) {
        System.out.println(tableMult(5, 9));
    }

    public static String tableMult(int n, int m) {
        int[][] tab = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tab[i][j] = (j + 1) * (i + 1);
            }
        }
        String res = "";
        int nbremax = (Tableau2D.calculMaxD(tab));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int nbreaff = tab[i][j];
                int difB = (Integer.toString(nbremax).length())-Integer.toString(nbreaff).length();
                if (Integer.toString(nbreaff).length() < (Integer.toString(nbremax).length())) {
                    res += tab[i][j] + "  ";
                    for (int b = 0; b < difB-1; b++){
                        res += " ";
                    }

                } else {
                    res += tab[i][j] + " ";
                }
            }
            res += " \n";
        }


        return res;
    }
}
