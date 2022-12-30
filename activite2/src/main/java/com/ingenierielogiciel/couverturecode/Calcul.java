package com.ingenierielogiciel.couverturecode;

/**
 * Classe permettant d'effectuer certaines
 * opération de base sur les entiers.
 * @author Sebastien Choplin
 */
public class Calcul {
	
	/**
	 * la classe calcul n'a que des methodes static
	 * a ce fait il s'agit d'une classe utilitaire
	 * et ne peut etre instancier
	 * @author Justin Uwayo
	 */
	public Calcul() {
		throw new UnsupportedOperationException("impossible d'instancier une classe static");
	}
	
	/**
	 * calcul la somme de deux nombres.
	 * @author Sebastien Choplin
	 * @param a un entier
	 * @param b un entier
	 * @return la somme de a + b;
	 */
	public static int somme(int a, int b) {
		return a + b;
	}

	/**
	 * Renvoie la note, bornée par les valeurs min et max, exemples:
	 * noteBornee(12.5,0.0,20.0) doit renvoyer 12.2.
	 * noteBornee(25.0,0.0,20.0) doit renvoyer 20.0.
	 * noteBornee(-2.0,0.0,20.0) doit renvoyer 0.0.
	 * @author Sebastien Choplin
	 */
	public static double noteBornee(double note, double min, double max) {
		if (note >= max) {
			return max;
		}
		if (note <= min) {
			return min;
		}
		return note;
	}

	/**
	 * Methode de division de 2 entiers.
	 * @author Sebastien Choplin.
	 * @param a un entier.
	 * @param b un entier.
	 * @return a / b si b !=0.
	 * @throws IllegalArgumentException si b ==0
	 */
	public static int division(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("b ne doit pas etre 0");
		}
		return a / b;
	}

}
