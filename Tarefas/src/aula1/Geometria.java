package aula1;

import java.util.ArrayList;

public class Geometria {
	
		public static String cut(String a) {
			int b = a.length();
			return a.substring(11, b);
		}
	
	public static void main(String args[]) {
		
		ArrayList<Figura> figuras = new ArrayList<>();
		
		//Digite o raio para o circulo
		figuras.add(new Circulo(30));
		
		//Digite parametro altura, parametro base
		figuras.add(new Quadrado(30, 30));
		//Digite parametro altura, parametro base
		figuras.add(new Retangulo(35, 45));
		//Digite parametro altura, parametro base
		figuras.add(new Losango(30, 30));
		//Digite parametro base, parametro altura, parametro lateral
		figuras.add(new Triangulo(30, 30, 30));
		
		for (Figura a : figuras) {
			System.out.println("\n" + a.getClass().getSimpleName() + 
								"\nArea: " + a.area() +
								"\nPerimetro: " + a.perimetro()
								);

		if(a instanceof Diagonal) {
				System.out.println("Diagonal: " + ((Diagonal)a).calculaDiagonal());
				}
		
		}
		
		
		
	}


}
