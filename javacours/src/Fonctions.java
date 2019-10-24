public class Fonctions {
    public static void main(String[] args) {
        double res = cmToInchesArea(10.5, 5.0);
        System.out.println(res);
    }

    public static double cmToInches(double inCm) {
        double inInches = inCm * 0.394;
        return inInches;
    }

    public static double cmToInchesArea(double widthInCm
            , double lengthInCm) {
        double widthInInches = cmToInches(widthInCm);
        double lengthInInches = cmToInches(lengthInCm);
        return widthInInches * lengthInInches;
    }
}
