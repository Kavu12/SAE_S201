package module_ardoise;
import java.util.ArrayList;
import ardoise.*;

public class Triangle extends Forme {
	private String nom;
	private PointPlan p1;
	private PointPlan p2;
	private PointPlan p3;
	private ArrayList<Segment>ensSegments;
	
	public Triangle() {
		
	}
	
	public Triangle(String nom,PointPlan p1, PointPlan p2, PointPlan p3) {
		this.setNomForme(nom);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.ensSegments = new ArrayList<Segment>();
	}
	public Triangle(Triangle t) {
		this(t.getNomTrig(), t.getp1(), t.getp2(), t.getp3());
		this.ensSegments = t.getTrig();
	}
	
	public String getNomTrig() {
		return nom; 
	}
	
	public PointPlan getp1() {
		return p1;
	}
	
	public PointPlan getp2() {
		return p2;
	}
	
	public PointPlan getp3() {
		return p3;
	}
	
	public ArrayList<Segment> getTrig(){
		return ensSegments;
	}
	
	public void setNomTrig(String nom) {
		this.nom = nom;
	}
	
	public void setp1(PointPlan p1) {
		this.p1 = p1;
	}
	
	public void setp2(PointPlan p2) {
		this.p2 = p2;
	}
	
	public void setp3(PointPlan p3) {
		this.p3 = p3;
	}
	
	public void SetTrig(ArrayList<Segment> ensSegments) {
		this.ensSegments = ensSegments;
	}
	
	@Override
	public void deplacer(int arg0, int arg1) {
		p1.deplacer(arg0, arg1);
		p2.deplacer(arg0, arg1);
		p3.deplacer(arg0, arg1);
	}

	@Override
	public ArrayList<Segment> dessiner(){
		Segment s1 = new Segment(p1,p2);
		Segment s2 = new Segment(p2,p3);
		Segment s3 = new Segment(p3,p1);
		this.ensSegments.add(s1);
		this.ensSegments.add(s2);
		this.ensSegments.add(s3);
		return this.ensSegments;
	}

	@Override
	public String typeForme() {
		// TODO Auto-generated method stub
		return "T";
	}
	
}
