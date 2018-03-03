package aula1;

public class Retangulo extends Poligno implements Diagonal{
	
	public Retangulo(double altura, double base) {
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
		return Math.sqrt(Math.pow(getAltura(), 2) + Math.pow(getBase(), 2));
	}
	
	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return 2 * (super.getAltura() + super.getBase());
	}
	

}
