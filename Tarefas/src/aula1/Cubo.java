package aula1;

public class Cubo extends Losango implements Volume{

	public Cubo(double altura, double base) {
		super(altura, base);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaVolume() {
		return Math.pow(getAltura(), 3);
	}

}
