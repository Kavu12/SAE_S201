package module_ardoise;
import ardoise.*;
import java.util.ArrayList;

public class Maison extends Forme{
	private String nom;
	private Forme quad1;
	private Forme quad2;
	private Forme chapeau;
	private ArrayList<Segment>ensSegments;
	
	public Maison() {
		
	}
	
	public Maison(String nom, Forme quad1, Forme quad2, Forme chapeau) {
		this.setNomForme(nom);
		this.quad1 = quad1;
		this.quad2 = quad2;
		this.chapeau = chapeau;
		this.ensSegments = new ArrayList<Segment>();
	}
	
	public Maison(Maison m){
		this(m.getNomMaison(), m.getquad1(), m.getquad2(), m.getChapeau());
		this.ensSegments = m.ensSegments;
	}
	
	public String getNomMaison() {
		return this.nom;
	}
	
	public Forme getquad1() {
		return this.quad1;
	}
	
	public Forme getquad2() {
		return this.quad2;
	}
	
	public Forme getChapeau() {
		return this.chapeau;
	}
	
	public ArrayList<Segment> getMaison() {
		return this.ensSegments;
	}
	
	public void setNomMaison(String nom) {
		this.nom = nom;
	}
	
	public void setquad1(Forme quad1) {
		this.quad1 = quad1;
	}
	
	public void setquad2(Forme quad2) {
		this.quad2 = quad2;
	}
	
	public void setchapeau(Forme chapeau) {
		this.chapeau = chapeau;
	}
	
	public void setMaison(ArrayList<Segment> enSegments) {
		this.ensSegments = ensSegments;
	}
	
	public void deplacer(int arg0, int arg1) {
		quad1.deplacer(arg0, arg1);
		quad2.deplacer(arg0, arg1);
		chapeau.deplacer(arg0, arg1);
	}
	
	public ArrayList<Segment> dessiner(){
		ensSegments.addAll(quad1.dessiner());
		ensSegments.addAll(quad2.dessiner());
		ensSegments.addAll(chapeau.dessiner());
		return ensSegments;
	}
	
	public String typeForme() {
		return "GF";
	}
}
