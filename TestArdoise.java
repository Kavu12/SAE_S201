package module_ardoise;
import ardoise.*;

public class TestArdoise {
	public static void main(String []args) {
	Ardoise a1 = new Ardoise();
	PointPlan o1 = new PointPlan(118,13);
	PointPlan o2 = new PointPlan(123,20);
	PointPlan o3 = new PointPlan(128,13);
	Forme oiseau1 = new Chapeau("oiseau 1", o1, o2, o3);
	a1.ajouterForme(oiseau1);
	
	PointPlan o4 = new PointPlan(133,30);
	PointPlan o5 = new PointPlan(136,32);
	PointPlan o6 = new PointPlan(138,30);
	Forme oiseau2 = new Chapeau("oiseau 2", o4, o5, o6);
	a1.ajouterForme(oiseau2);
	
	PointPlan o7 = new PointPlan(142,14);
	PointPlan o8 = new PointPlan(144,17);
	PointPlan o9 = new PointPlan(146,14);
	Forme oiseau3 = new Chapeau("oiseau 3", o7, o8, o9);
	a1.ajouterForme(oiseau3);
	
	PointPlan b1 = new PointPlan(170,52);
	PointPlan b2 = new PointPlan(173,45);
	PointPlan b3 = new PointPlan(177,52);
	Forme branche1 = new Chapeau("branche1", b1, b2, b3);
	
	PointPlan b4 = new PointPlan(177,52);
	PointPlan b5 = new PointPlan(184,57);
	PointPlan b6 = new PointPlan(177,60);
	Forme branche2 = new Chapeau("branche 2", b4, b5, b6);
	
	PointPlan b7 = new PointPlan(177,60);
	PointPlan b8 = new PointPlan(174,66);
	PointPlan b9 = new PointPlan(170,60);
	Forme branche3 = new Chapeau("branche 3", b7, b8, b9);

	PointPlan b10 = new PointPlan(170,60);
	PointPlan b11 = new PointPlan(164,57);
	PointPlan b12 = new PointPlan(170,52);
	Forme branche4 = new Chapeau("branche 4", b10, b11, b12);
	
	Forme etoile = new Etoile("Etoile", branche1, branche2, branche3, branche4);
	a1.ajouterForme(etoile);
	
	PointPlan t1 = new PointPlan(80,140);
	PointPlan t2 = new PointPlan(130,100);
	PointPlan t3 = new PointPlan(180,140);
	Forme toitmaison = new Chapeau("toitmaison", t1, t2, t3);
	
	PointPlan m1 = new PointPlan(3,14);
	PointPlan m2 = new PointPlan(43,3);
	PointPlan m3 = new PointPlan(112,14);
	Forme montagne1 = new Triangle("Montagne 1", m1, m2, m3);
	a1.ajouterForme(montagne1);
	
	PointPlan m4 = new PointPlan(152,7);
	PointPlan m5 = new PointPlan(166,3);
	PointPlan m6 = new PointPlan(172,7);
	Forme montagne2 = new Triangle("Montagne 2", m4, m5, m6);
	a1.ajouterForme(montagne2);
	
	PointPlan tr1 = new PointPlan(9,100);
	PointPlan tr2 = new PointPlan(20,198);
	Forme tour = new Quadrilatere("Tour", tr1, tr2);
	a1.ajouterForme(tour);
	
	PointPlan tr3 = new PointPlan(80,140);
	PointPlan tr4 = new PointPlan(180,198);
	Forme corpsmaison = new Quadrilatere("Corps maison", tr3, tr4);
	
	PointPlan tm1 = new PointPlan(120,170);
	PointPlan tm2 = new PointPlan(140,198);
	Forme portemaison = new Quadrilatere("Porte Maison", tm1, tm2);
	
	Forme maison = new Maison("maison", portemaison, corpsmaison, toitmaison);
	a1.ajouterForme(maison);
	
	a1.dessinerGraphique();
	
	while (true) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        a1.deplacer("GF",5, 0);
        a1.deplacer("Q", 5, 0);
        a1.deplacer("C", 5, 0);
        a1.deplacer("E", 5, 0);
    }
		
	}
}
