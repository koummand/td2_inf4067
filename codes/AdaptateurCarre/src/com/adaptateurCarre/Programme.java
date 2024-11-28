package com.adaptateurCarre;

public class Programme {
	public static void main(String[] args) {

		Icarre adapteur = new AdapterCarre();

		float perimetre = adapteur.calculPerimettre(2, 3);
		float air = adapteur.calculAire(2, 3);
		System.out.println("perimetre= "+perimetre+" et aire= "+air);
	}
}
