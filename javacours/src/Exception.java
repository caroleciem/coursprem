import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {
        withRessource();
        Scanner sc = null;
        try {
            sc = new Scanner(new File("inputFile.txt"));
            for (int i = 0; sc.hasNextLine(); ++i) {
                System.out.println("[" + i + "]:" + sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        finally {
           if (sc!= null) {
               sc.close();
           }
        }
    }
    public static void withRessource (){
        try  (Scanner sc = new Scanner (new File("inputFile1.txt"))){
            for (int i = 0; sc.hasNextLine(); ++i) {
                System.out.println("[" + i + "]:" + sc.nextLine());
            }
        } catch (FileNotFoundException e) {
           System.out.println ("fichier inexistant");
            e.printStackTrace();
        }
    }

}

