public class Reference {
    public static void main(String[] args) {
        float[] tab1 = new float[5];
        int i1=2;
        String s1= "carole";
        /*double [] tab2 =tab1; /* c'est donc le même tableau, car on a affecté la référence donc si on modifie l'un, on modifie l'autre*/
        System.out.println("tab1 avant f:"+tab1[1]);
        /*System.out.println(tab2[1]);*/
        System.out.println("s1 avant:" +s1);
        f(tab1);
        System.out.println("tab1 après f:" +tab1[1]);
        f2(tab1);
        System.out.println("tab1après f2:" +tab1[1]);
        s(s1);
        System.out.println("i1: " +i1);
        g(i1);
        /*tab1[1] = -1.f;*/
        System.out.println("tab1:" +tab1[1]);
        System.out.println("i1: " +i1);
        System.out.println("s1 apres :" +s1);
        System.out.println("score" +2 +3); /*dans cet ordre on reste en string*/
        System.out.println(2 +3 + "points");/* dans cet ordre on fait le calcul*/
        System.out.println("score" +2 *3);
        System.out.println("score" +(2 +3));
        /* on a changé la valeur de tab2 en changeant la valeur de tab1 */
        /*System.out.println(tab2[1]);*/
    }
        public static void f(float[] tab2){
           tab2[1]= -2.f; /*on peut ainsi trier tab1 grâce à tab2 par exemple*/

    }
        public static void f2(float[] tab2){
            tab2= new float[]{-1,5,6};
            tab2[1]= -3.f;

        }
        public static void g(int i2){
        i2=i2-5;
        System.out.println("i2 :" + i2);
    }
        public static void s(String s2){
           s2 = s2 +"titi";/*on a une nouvelle chaine de caractère dans une nouvelle référence, cela a modifié la référence dans s2*/
           s2 = s2.toUpperCase();
           System.out.println("s2:" +s2);
        }



}
