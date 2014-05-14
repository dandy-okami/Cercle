package cour;

import java.math.*;

public class Cercle {
	private double rayon;
	private double x;
	private double y;
	private double surface;

	public Cercle() {//constructeur qui créer un cercle
	}

	public void setRayon(double r) {
		rayon = r;
	}

	public void setPosition(double px, double py) {
		y = py;
		x = px;
	}

	public double surface() {//methode qui calcul la surface
		surface = Math.PI * Math.pow(rayon, 2);
		return surface;
	}

	public void testPosition() {//methode qui test si les points sont inscrient dans le cercle
		if ((rayon >= y) && (rayon >= x)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public void affiche() {
		System.out.println(surface);
	}
}
