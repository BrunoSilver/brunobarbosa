package aula1;

public class Piramide extends Poligono implements Volume{

	public Piramide(double base, double altura) {
		setBase(base);
		setAltura(altura);
	}

	@Override
	double perimetro() {
		return 0;
	}

	@Override
	public double calculaVolume() {
		return ((Math.pow(getBase(),2) * getAltura()) / 3);
	}

}
