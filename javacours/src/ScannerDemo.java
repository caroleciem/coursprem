import java.util.Scanner;
public class ScannerDemo {
       public static void main(String[] args){
         	Scanner sc = new Scanner(System.in); // lecture depuis l'entrée standard (clavier)
          	System.out.println("Saisissez un entier:");
          	int i = sc.nextInt();
         	System.out.println("Vous avez saisi: "+ i);
           	System.out.println("Saisissez un double (penser à la localisation!):");
          	double d = sc.nextDouble(); // /!\ Si l'ordinateur est configuré en fr_FR, le séparateur décimal attendu est une virgule !
          	System.out.println("Vous avez saisi: "+ d);
          	System.out.println("Saisissez une ligne de caractères");
          	sc.nextLine(); // /!\ le dernier appel à nextDouble() n'avait pas consommé la fin de ligne !
          	String line = sc.nextLine();
          	System.out.println("Vous avez saisi: "+ line);
              }
  }