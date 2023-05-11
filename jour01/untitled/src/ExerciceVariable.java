public class ExerciceVariable {
    public static void main (String[] args) {
        //init des 2 variables
        int num1 = 5;
        int num2 = 10;
        // affichage des resultats en une seule phrase
        System.out.println("la valeur de num1 est "+ num1 +" et la valeur de num2 est "+ num2);
        // creation variable pour echange de valeur
        int savenum1 = num1;
        // echange de valeur
        num1 = num2;
        num2 = savenum1;
        // affichage des nouvelles valeurs
        System.out.println("la valeur de num1 est "+ num1 +" et la valeur de num2 est "+ num2);
    }
}