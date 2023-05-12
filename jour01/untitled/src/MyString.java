public class MyString {
    public static void main(String[] args) {
        // Déclaration et initialisation d'une variable de type String
        String str1 = "oui";

        // Déclaration d'une variable de type String et initialisation ultérieure
        String str2;
        str2 = "non";

        // Déclaration d'une variable de type String sans initialisation
        String str3;

        // Initialisation de la variable str3
        str3 = new String("non oui");

        // Déclaration et initialisation d'une variable de type String à partir d'un tableau de caractères
        char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a', '!'};
        String str4 = new String(charArray);

        // Affichage des valeurs des variables
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}

