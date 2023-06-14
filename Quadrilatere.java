package module_ardoise;
import java.util.ArrayList;
import ardoise.*;

public class Quadrilatere extends Forme{
	private String nom;
	private PointPlan p1;
	private PointPlan p2;
	private PointPlan p3;
	private PointPlan p4;
	private ArrayList<Segment>ensSegments;
	
	public Quadrilatere() {
		
	}
	
	public Quadrilatere(String nom,PointPlan p1, PointPlan p2) {
		this.setNomForme(nom);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = new PointPlan(p2.getAbscisse(), p1.getOrdonnee());
		this.p4 = new PointPlan(p1.getAbscisse(), p2.getOrdonnee());
		this.ensSegments = new ArrayList<Segment>();
	}
	
	public Quadrilatere(Quadrilatere q) {
		this(q.getNomQuad(), q.getp1(), q.getp2());
		this.ensSegments = q.getQuad();
		}
	
	public String getNomQuad() {
		return nom;
	}
	
	public PointPlan getp1() {
		return p1;
	}
	
	public PointPlan getp2() {
		return p2;
	}
	
	public ArrayList<Segment> getQuad() {
		return ensSegments;
	}
	
	public void setNomQuad(String nom) {
		this.nom = nom;
	}

	public void setp1(PointPlan p1) {
		this.p1 = p1;
	}

	public void setp2(PointPlan p2) {
		this.p2 = p2;
	}
	
	public void setQuad(ArrayList<Segment> ensSegments) {
		this.ensSegments = ensSegments;
	}
	
	@Override
	public void deplacer(int arg0, int arg1) {
		this.dessiner();
		this.ensSegments.get(0).deplacer(arg0,arg1);
		this.ensSegments.get(1).getPointArrivee().deplacer(arg0, arg1);
		this.ensSegments.get(2).getPointArrivee().deplacer(arg0, arg1);
	}

	@Override
	public ArrayList<Segment> dessiner() {
		Segment s1 = new Segment(p1,p3);
		Segment s2 = new Segment(p3,p2);
		Segment s3 = new Segment(p2,p4);
		Segment s4 = new Segment(p4,p1);
		this.ensSegments.add(s1);
		this.ensSegments.add(s2);
		this.ensSegments.add(s3);
		this.ensSegments.add(s4);
		return this.ensSegments;
	}

	@Override
	public String typeForme() {
		return "Q";
	}
	
}
