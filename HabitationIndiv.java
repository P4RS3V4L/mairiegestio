import java.util.Scanner;

//La classe hérite de la classe Habitation
//==> elle hérite tous les attributs et toutes les fonctions 
public class HabitationIndiv extends Habitation {
private int nbrpieces;
private boolean piscine;

//Déclaration d'un constructeur avec paramètre
public HabitationIndiv(String nomP, String adresse, double surface,
		int nbrpieces, boolean piscine) {
	//Appel du constructeur avec trois paramètres déclarée dans la classe mère Habitation
	super(nomP, adresse, surface);
	this.nbrpieces = nbrpieces;
	this.piscine = piscine;
}
@Override
public String toString() {
	return "HabitationIndiv [nbrpieces=" + nbrpieces + ", piscine=" + piscine
			+ "]";
}
//redéfinition de la méthode affiche déclarée dans la classe mère
public void affiche()
{
	//Appel de la méthode affiche
	super.affiche();
	System.out.println(this.toString());
}
//redéfinition de la méthode Impot déclarée dans la classe mère
public double Impot()
{
	if(piscine)
	{
		return 500+100*nbrpieces+super.Impot();
	}
	return 100*nbrpieces+super.Impot();
}

//Déclaration d'une méthode qui permet de demander à l'utilisateur de saisir:
//le nom, l adresse, ...
//la méthode retourne un objet de type HabitationIndiv
public static HabitationIndiv saisieIndiv()
{
	//Création d'un flux de communication avec le clavier via un objet Scanner
	Scanner clavier=new Scanner(System.in);
	System.out.println("Saisir le nom du proprietaire : ");
	String prop=clavier.next();
	
	System.out.println("Saisir l'adresse : ");
	String adresse=clavier.next();
	
	System.out.println("Saisir la surface : ");
	double surface=clavier.nextDouble();
	
	System.out.println("Saisir le nombre de pieces : ");
	int nbrpieces=clavier.nextInt();
	
	System.out.println("Saisir si y a til une piscine ou pas (true/false : ");
	boolean piscine=clavier.nextBoolean();
	
	return new HabitationIndiv(prop, adresse, surface, nbrpieces, piscine);
	
}

}
