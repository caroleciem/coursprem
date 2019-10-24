public class Mystere {
    public static void main(String[] args) {
        System.out.println(mystere(0.01f));
    }

    public static float mystere(float epsilon) {
        return mystere(0.f, Float.MAX_VALUE, epsilon);
    }

    public static float mystere(float min, float max, float epsilon) {
        while ((max != min)) {
            System.out.println (max);
            System.out.println (min);
            float m = max / 2 + min / 2;
            System.out.println (m);
            if ((m + epsilon) > m) {
                min = Math.nextUp(m);
            } else {
                max = m;
            }
        }
        return min;
    }
}

