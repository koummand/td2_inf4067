package com.adaptateurCarre;

public class AdapterCarre implements Icarre {
	Rectangle rectangle = new Rectangle();

	@Override
	public float calculPerimettre(float longueur, float lageur) {
		float perimettre = rectangle.calculPerimettre(longueur, lageur);
		return perimettre;
	}

	@Override
	public float calculAire(float longueur, float lageur) {
		float aire = rectangle.caculAire(longueur, lageur);
		return aire;
	}
}
