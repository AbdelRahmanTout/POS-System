package Domain.Taxes;


public class LebanonTax {

    //operation retourne le pourcentage des Taxes au Liban pour l'utiliser quand on calcule le montant de Taxes
    public float TaxPercentage() {
        float taxpercentage = (float) 0.07; //TaxPercentage in Lebanon = 7%
        return taxpercentage;
    }

}
