package aula1;

public class Losango extends Poligno{
	
	public Losango(double altura, double base) {
	super.setAltura(altura);
	super.setBase(base);
	}

	@Override
	double area() {
	return super.area();
	}

	@Override
	double perimetro() {
		return 4 * getAltura();
	}
	
	

}
