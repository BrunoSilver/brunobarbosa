package aula1;

public class Circulo extends Figura {
	
	double raio;
	
	public Circulo(double volume) {
		this.raio = volume;
	}
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * raio;
	}
	
	
	
}