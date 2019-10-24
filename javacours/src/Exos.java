public class Exos {
    public static void main(String[] args) {
        String prenom = "Carole";
        String nom = "Ciemny";
        int age = 0;
        double taille = 1.66;
        String description = "je fais la formation pour me reconvertir en développeuse web";
        double montantCompteBancaire = 0;
        boolean bissextile;
        String colorCard;
        System.out.println(calculPrixTTC(1.5, 0.2));
        System.out.println(bissextile (1997));
        System.out.println(Float.MAX_VALUE);
        System.out.println(factorielle(-5));
    }


    /*calcul PrixTTC*/

    public static double calculPrixTTC(double prixHT, double tauxTVA) {
        double prixTTC = prixHT + (prixHT * tauxTVA);
        return prixTTC;
    }
    /*année bissextile*/

    public static boolean bissextile (int year){
        boolean bissext =((year%4==0) && (year%100!=0)) || (year%400 == 0);
        return bissext;
     /* il était possible de faire
        public static boolean bissextile (int year){
         return (((year%4==0) && (year%100!=0)) || (year%400 == 0));
        }
      */
    }
    public static long factorielle (int nbre){
        if (nbre == 0 || nbre ==1){
            return 1;
        }
        if (nbre <0){
            return 999;
        }
        long res = nbre* factorielle (nbre-1);
        return res;
    }
}
