public class TestExos {
    public static void main(String[]args){
        int [] anneeBissex = {1584,1588,1592,1596,1600,1604,1608,1612,1616,1620,1624,1628,1632,1640,1644,1648,1652,1656,
                1660,1664,1668,1672,1676,1680,1684,1688,1692,1696,1704,1708,1712,1716,1720,1724,1728,1732,1736,1740,
                1744,1748,1752,1756,1760,1764,1768,1772,1776,1780,1784,1788,1792,1796};
        int[] anneeNonBissex = {1700,1800,1900,2100,2200};
        int[] factorielRes = {1,1,2,6,24};
        int[]factorielEnt = {0,1,2,3,4};

        for(int year : anneeBissex)    {
            if (Exos.bissextile(year) == true){
                System.out.println("vérification " + year + " est ok car bissextile");
            } else {
                System.out.println("vérification " + year + " est ko car non bissextile");
            }
        }
        for(int year : anneeNonBissex)    {
            if (Exos.bissextile(year) == false){
                System.out.println("vérification " + year + " est ok car non bissextile");
            } else {
                System.out.println("vérification " + year + " est ko car bissextile");
            }
        }
        for (int fact : factorielEnt) {
            if (Exos.factorielle(fact) == factorielRes[fact]){
                System.out.println ("les tests factoriels sont ok");
            }else{
                System.out.println("les tests factoriels sont ko");
            }
        }
    }
}
