import java.util.Scanner;


//Déclaration d'une classe HabitationPro qui hérite de la class Habitation
public class HabitationPro extends Habitation {
	
	private int nbrEmployes;

	//Déclaration d'un constructeur avec paramètres
	public HabitationPro(String nomP, String adresse, double surface,
			int nbrEmployes) {
		//appel du constructeur de la classe mère
		super(nomP, adresse, surface);
		this.nbrEmployes = nbrEmployes;
	}

	//redéfinition de la méthode affiche
	//Dans cette exemple il ne s'agit pas de polymorphisme (surcharge)
	//Vue qu'on a rien changé dans la signature de la méthode
	public void affiche()
	{
		super.affiche();
		System.out.println(this);
	}
	
	//redéfinition de la méthode Impot
	public double Impot()
	{
		int nbtranche=nbrEmployes/10;
		return super.Impot()+nbtranche*1000;
	}
	
	//Déclaration d'une méthode qui demande de saisir les informations : nom, adresse, ...
	//la méthode retourne un objet de type HabitationPro
	public static HabitationPro saisie()
	{
		Scanner clavier=new Scanner(System.in);
		System.out.println("Saisir le nom du proprietaire : ");
		String prop=clavier.next();
		
		System.out.println("Saisir l'adresse : ");
		String adresse=clavier.next();
		
		System.out.println("Saisir la surface : ");
		double surface=clavier.nextDouble();
		
		System.out.println("Saisir le nombre de personnes : ");
		int nbremployes=clavier.nextInt();
		
		
		return new HabitationPro(prop, adresse, surface, nbremployes);
		
	}
	
	@Override
	public String toString() {
		return "HabitationPro [nbrEmployes=" + nbrEmployes + "]";
	}

	public int getNbrEmployes() {
		return nbrEmployes;
	}

	public void setNbrEmployes(int nbrEmployes) {
		this.nbrEmployes = nbrEmployes;
	}
	
	
}
