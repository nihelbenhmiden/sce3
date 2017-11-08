package Formation;

public class Etudiant {
	private int code;
public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}

private float moyenne;	
private String nom;
public float getMoyenne() {
	return moyenne;
}
public void setMoyenne(float moyenne) {
	this.moyenne = moyenne;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}

public String succed(){
	if (moyenne<10){ return "non";}
	else {return "oui";}
}
}
