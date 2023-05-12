public class Facture {
    public static void main (String[] args){
       double prix=49.99, quantite=3, TVA=0.2;
       double prixHT=prix*quantite;
       double montantTVA= prixHT*0.2;
       double prixTTC=prixHT+montantTVA;
       System.out.println("Le prix hors taxe est de "+prixHT);
       System.out.println("Le montant de la TVA est de "+montantTVA);
       System.out.println("Le prix toute taxe comprise est de "+prixTTC);
    }
}
