
//Déclaration de la classe principale
//La classe implémente l'interface comparable (Cette notion sera abordé dans le cours 4)
//==> Déclaration de la méthode abstraite compareTo qui figure dans l'interface comparable
public class Habitation implements Comparable {

	private String nomP;
	private String adresse;
	private double surface;
	
	//Déclaration d'une méthode afficher qui affiche les attributs
	//de l'instance qui a appelée la méthode affiche
	public void affiche()
	{
		System.out.println("nom : "+nomP+" adresse :"+adresse+" surface : "+surface);
	}
	
	//Déclaration de la méthode Impot qui calcule et retourne l'impot
	public double Impot()
	{
		return 2*surface;
	}
	
	//Déclaration de la méthode compareTo
	//Elle permet de comparer deux objects qui doivent être de type Habitation
	//Le premier objet : l'instance qui a appelée la fonction compareTo
	//Le deuxième objet : la variable o ==> de type Object
	//La méthode retourne :
	//		0 si la surface des deux objets est la même
	//		1 si l'instance qui a appelée la fonction possède une surface inférieur à celle de l'objet o
	//		-1 dans le cas contraire
	@Override
	public int compareTo(Object o) {
		
		//la variable o est de type Object
		//il est nécèssaire de faire un cast à Habitation
		Habitation autre=(Habitation) o;
		if(this.getSurface()>autre.getSurface())
			return -1;
		else if(this.getSurface()<autre.getSurface())
			return 1;
		else
		return 0;
	}
	
	//méthode qui permet d'afficher les informationsdes habitations dans T
	//LA méthode est déclarés comme STATIC 
	//==> elle ne peut pas être redéfinir dans les sous classes
	public static void affichertableau(Habitation[]T)
	{
		for(int i=0;i<T.length;i++)
			T[i].affiche();
	}
	
	//Déclaration d'un constructeur avec trois paramètres
	//On aura des classes qui hérite de cette classe
	//il faut obligatoirement un constructeur soit avec paramètres
	//ou un constructeur par défaut
	public Habitation(String nomP, String adresse, double surface) {
		
		this.nomP = nomP;
		this.adresse = adresse;
		this.surface = surface;
	}
	
	//Puisque les attributs sont déclarés private
	// on est obligé de déclarés les getteurs et setteurs
	public String getNomP() {
		return nomP;
	}
	public void setNomP(String nomP) {
		this.nomP = nomP;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public double getSurface() {
		return surface;
	}
	public void setSurface(double surface) {
		this.surface = surface;
	}

	
}
