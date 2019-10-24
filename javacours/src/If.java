public class If {
    public static void main(String[] args) {
        int nbre1 = 2;
        int nbre2 = 3;
        int nbre3;

        float[] tab1 = new float[5];
        float[] tab2 = tab1;
        float[] tab3 = new float[5];

        if (tab1 == tab2) {
            System.out.println("tab1 et tab2 ont la même référence");
        } else {
            System.out.println("tab1 et tab2 n'ont pas la même référence");
        }

        if (tab1 == tab3) {
            System.out.println("tab1 et tab3 ont la même référence");
        } else {
            System.out.println("tab1 et tab3 n'ont pas la même référence");
        }
        System.out.println(tab1 == tab2);
        System.out.println(tab1 == tab3);

        if (nbre1 == nbre2) {
            System.out.println("c'est égal");
        } else {
            System.out.println("ce n'est pas égal");
        }
        if (nbre1 > nbre2) {
            System.out.println("c'est vrai");
        }
        int nbre4 = (2<3)? 10:5; /* on évalue le 1er et si vrai, ilfait le 1 sinon le deuxième*/
        /* identique à écrire*/
        if (2<3){
            nbre3 = 10;
        }else{
            nbre3 = 5;
        }
        System.out.println(nbre4);
        System.out.println(nbre3);
    }
}
