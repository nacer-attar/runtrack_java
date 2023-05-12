import java.util.Scanner;

public class cestderrick {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Demander le nom de l'utilisateur
            System.out.print("Entrez votre nom: ");
            String nom = input.nextLine();

            // Demander le prénom de l'utilisateur
            System.out.print("Entrez votre prénom: ");
            String prenom = input.nextLine();

            // Afficher le nom et le prénom de l'utilisateur
            System.out.println("Bonjour " + prenom + " " + nom + " !");
        }
    }
