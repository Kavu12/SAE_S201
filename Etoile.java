package module_ardoise;
import ardoise.*;
import java.util.ArrayList;

public class Etoile extends Forme {
	private String nom;
	private Forme chapeau1;
	private Forme chapeau2;
	private Forme chapeau3;
	private Forme chapeau4;
	private ArrayList<Segment>ensSegments;
	
	public Etoile() {
		
	}
	
	public Etoile(String nom, Forme chapeau1, Forme chapeau2, Forme chapeau3, Forme chapeau4) { 
		this.setNomForme(nom);
		this.chapeau1 = chapeau1;
		this.chapeau2 = chapeau2;
		this.chapeau3 = chapeau3;
		this.chapeau4 = chapeau4;
		this.ensSegments = new ArrayList<Segment>();
	}
	
	public Etoile(Etoile e) {
		this(e.getNomEtoile(), e.getChapeau1(), e.getChapeau2(), e.getChapeau3(), e.getChapeau4());
		this.ensSegments = e.getEtoile();
	}
	
	public String getNomEtoile() {
		return nom;
	}
	
	public Forme getChapeau1() {
		return chapeau1;
	}
	
	public Forme getChapeau2() {
		return chapeau2;
	}
	
	public Forme getChapeau3() {
		return chapeau3;
	}
	
	public Forme getChapeau4() {
		return chapeau4;
	}
	
	public ArrayList<Segment> getEtoile() {
		return ensSegments;
	}
	
	public void setNomEtoile(String nom) {
		this.nom = nom;
	}

	public void setChapeau1(Forme chapeau1) {
		this.chapeau1 = chapeau1;
	}

	public void setChapeau2(Forme chapeau2) {
		this.chapeau2 = chapeau2;
	}

	public void setChapeau3(Forme chapeau3) {
		this.chapeau3 = chapeau3;
	}

	public void setChapeau4(Forme chapeau4) {
		this.chapeau4 = chapeau4;
	}

	public void setEtoile(ArrayList<Segment> enSegments) {
		this.ensSegments = ensSegments;
	}
	
	public void deplacer(int arg0, int arg1) {
	        chapeau1.deplacer(arg0, arg1);
	        chapeau2.deplacer(arg0, arg1);
	        chapeau3.deplacer(arg0, arg1);
	        chapeau4.deplacer(arg0, arg1);
	}
	
	public ArrayList<Segment> dessiner(){
		ensSegments.addAll(chapeau1.dessiner());
        ensSegments.addAll(chapeau2.dessiner());
        ensSegments.addAll(chapeau3.dessiner());
        ensSegments.addAll(chapeau4.dessiner());
        return ensSegments;
	}
	
	public String typeForme() {
        return "E";
    }

}
