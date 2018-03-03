package aula1;

public class Losango extends Poligno{
	
	public Losango(double altura, double base) {
	super.setAltura(altura);
	super.setBase(base);
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
	return super.area();
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return 4 * getAltura();
	}
	
	

}
