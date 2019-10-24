import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class ExoLectureFichier {
    public static void main(String[] args)  {
        try(Scanner sc = new Scanner(new File("inputFile2.txt"))) {
            for (int i = 0; sc.hasNextLine(); ++i) {
                System.out.println("[" + i + "]:" + sc.nextLine());
                int entier = sc.nextInt();
                double d = sc.nextDouble();
                sc.nextLine(); // /!\ le dernier appel à nextDouble() n'avait pas consommé la fin de ligne !
                String line = sc.nextLine();
                System.out.println("entier "+ entier + "double " + d + "ligne " + line);
            }

        }catch (FileNotFoundException e) {
           System.out.println("fichier inexistant") ;
        }
    }
}



