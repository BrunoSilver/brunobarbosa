package aula1;

public class Triangulo extends Poligno{
	private double lateral;
	
	public Triangulo(double altura, double base, double lateral) {
		super.setAltura(altura);
		super.setBase(base);
		this.lateral = lateral;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return super.area() / 2;
	}
	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return getAltura() + getBase() + lateral;
	}
	
	

}