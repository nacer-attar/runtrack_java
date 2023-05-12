import java.util.Scanner;
public class ConvertTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez un nombre de minutes: ");
        int temps = input.nextInt();
        int heures = temps/60;
        int minutes = temps % 60;
        System.out.println(temps+" minutes correspondent à "+heures+ " heure(s) et "+minutes+" minutes.");
    }
}
