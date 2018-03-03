package aula1;

public class Quadrado extends Poligno implements Diagonal{
	
	public Quadrado(double altura, double base) {
		super.setAltura(altura);
		super.setBase(base);
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return super.area();
	}

	@Override
	public double calculaDiagonal() {
		// TODO Auto-generated method stub
		return super.getAltura() * Math.sqrt(2);
	}
	
	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return 4 * super.getAltura();
	}

}
