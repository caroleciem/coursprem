public class ExampleArgsRenamed {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(args[0]);
        String formateur = "Bernard";
        float age = 0.5f;
        char prenom = 'a';
        byte test = 99;
        int[] arrayOfInts;
        double[] arrayOfDoubles;
        arrayOfInts = new int[3];
        arrayOfDoubles = new double[]{1.5,5,3.2};


        test += 1;
        System.out.println(age);
        System.out.println(prenom);
        System.out.println(formateur);
        System.out.println(test);
        System.out.println(arrayOfInts);
        System.out.println(arrayOfInts[0]);
        System.out.println(arrayOfDoubles);
        System.out.println(arrayOfDoubles[0]);
        System.out.println(arrayOfDoubles.length);

    }
}
