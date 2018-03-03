package aula1;

public class Trapezio extends Poligno{
		double base;
	
	public Trapezio(double base, double segundaBase, double altura) {
		super.setAltura(altura);
		super.setBase(base);
		this.base = segundaBase;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return ((getBase() + base)*getAltura()) / 2;
	}
	
	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return Math.pow(super.getAltura(), 2) + getBase() + base;
	}

}
