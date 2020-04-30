import java.util.Arrays;
import java.util.Scanner;

//Cette représente une classe main
//==> va nous permettre de tester nos classes et fonctions
//Puisque cette classe possède la méthode main
// il faut déclarer tous les attributs et toutes les fonctions dans cette classe comme static
//cela pour pouvoir les utilisés directement
//Sinon on doit déclarer dans la méthode main un objet de type Mairie pour pouvoir
//appeler la méthode menu, ajouterHabitation
//aussi pour pouvoir utiliser les attributs tableau et tailleeffective
public class Mairie {
	
	public static Habitation[]tableau=new Habitation[10];
	//tailleeffective : attribut static va compter le nombre d'objets Habitation ajoutés dans le tableau
	public static int tailleeffective=0;

	public static void main(String[] args) {
		
		//Exemple 1 : l'utilisation d'un menu
		/*Habitation h;
		while(true)
		{
			switch(menu())
			{
			case 1 : h=HabitationIndiv.saisieIndiv();
					if(ajouterHabitation(h))
						System.out.println("ajout avec succes");
					else
						System.out.println("echec d'ajout!!!");
						
			break;
			
			case 2 : h=HabitationPro.saisie();
			if(ajouterHabitation(h))
				System.out.println("ajout avec succes");
			else
				System.out.println("echec d'ajout!!!");
			break;
			
			
			case 3 : for(int i=0;i<tailleeffective;i++)
					tableau[i].affiche();
			break;
			
			case 4 : double somme=0;
				
				for(int i=0;i<tailleeffective;i++)
				somme+=tableau[i].Impot();
				
				
				System.out.println("l'impot totalest : "+somme+ "DH");
		break;
			case 5 : System.exit(0);
			
			}*/
			
			
		//}
		
		//Exemple 2 : teste directe des méthodes
		Habitation []tableau=new Habitation[3];
		Habitation h1,h2,h3;
		h1=new Habitation("nom1","adresse 1",12);
		h2=new Habitation("nom2","adresse 2",30);
		h3=new Habitation("nom3","adresse 3",6);
		
		tableau[0]=h1;tableau[1]=h2;tableau[2]=h3;
		Habitation.affichertableau(tableau);
		System.out.println("apres traiement");
		//les instances seront classés selon la surface
		//puisque dans la classe Habitation on a redéfinit la méthode compareTo
		Arrays.sort(tableau);
		Habitation.affichertableau(tableau);
		HabitationIndiv hi1;		
		
	}
	
	//Méthode qui permet d'afficher un menu 
	//elle retourne le choix saisie par l'utilisateur
	public static int menu()
	{
		Scanner clavier=new Scanner(System.in);
		System.out.println("--------Menu Mairie ----------");
		System.out.println("1 - Ajouter une habitation Inidividuelle");
		System.out.println("2 - Ajouter une habitation Professionelle");
		System.out.println("3 - Lister toutes les habitations");
		System.out.println("4 - Impot total s");
		
		System.out.println("5 - Quitter l'appllication");
		
		System.out.println("Merci de choisir une fonction ? ");

		return clavier.nextInt();
	
	}
	
	//
	public static boolean ajouterHabitation(Habitation h)
	{
		
		if(tailleeffective<10)
		{
		tableau[tailleeffective]=h;
		tailleeffective++;
		return true;
		}
		return false;
		
	}

}
