public class Tableau2D {
    public static void main(String[] args) {
        int[][] maxDouble = {{2, 9, -3, 584},{18, 95, 5}};
        String[][] maxString = {{"carole7", "coucou7","tregdvfu9","fergsdvaujk13"},{"rien5","julientgrdes14"," "}};
        System.out.println(calculMaxD(maxDouble));
        System.out.println(stringLenMaxD(maxString));
    }

    public static int calculMaxD(int[][] tab) {
        int max = tab[0][0];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] > max) {
                    max = tab[i][j];
                }
            }
        }
        return max;
    }
    public static int stringLenMaxD (String [][] tab1){
        int lenmax = 0;
        for (int g = 0;g < tab1.length; g++) {
            for (int h = 0; h < tab1[g].length; h++) {
                if (tab1[g][h].length() > lenmax) {
                    lenmax = tab1[g][h].length();
                }
            }
        }
        return lenmax;
    }
}


