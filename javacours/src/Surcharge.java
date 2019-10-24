public class Surcharge {
    public static void main(String[] args){
        int[] entier ={6,5,2};
        String test = arrayToString(entier);
        System.out.println(test);
        System.out.println(arrayToString(entier));
        double[] virg ={5.5,9.5,4.5};
        System.out.println(arrayToString(virg));
        String[] chaine ={"arg","gru","ver"};
        System.out.println(arrayToString(chaine));
        boolean[] bool ={true,false,true};
        System.out.println(arrayToString(bool));

    }
    public static String arrayToString(int[] array){
        if (array.length >0) {
            String res = "[" + array[0];
            for (int i = 1; i != array.length; ++i) {
                res = res + ", " + array[i];
            }
            return res + "]";
        }else {
            return "";
        }
    }

    public static String arrayToString(double[] array){
        String res = "["+array[0];
        for(double v : array){
            res += ", " + v;
        }
        return res +"]";
    }
    public static String arrayToString(String[] array){
        String res = "[";
        for(String s : array){
            res = res + " "+ s;
        }
        return res +"]";

    }
    public static String arrayToString(boolean[] array){
        String res = "[";
        for(boolean b : array){
            res = res + " "+ b;
        }
        return res +"]";

    }
}
