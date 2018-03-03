package aula1;

public class Piramide extends Poligno implements Volume{

	public Piramide(double base, double altura) {
		setBase(base);
		setAltura(altura);
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculaVolume() {
		return ((Math.pow(getBase(),2) * getAltura()) / 3);
	}

}
