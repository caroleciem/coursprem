import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.FileNotFoundException;

public class ExoExcepEcritureFichier {


    public static void main(String[] args) {
        try (PrintStream fileOut = new PrintStream(new FileOutputStream("textFile.txt"))) {
            fileOut.print("Hello ");
            fileOut.println("World !");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("fichier textFile inexistant");

        }
    }
}
