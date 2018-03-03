package aula1;

public class Cilindro extends Circulo implements Volume{
	
	private double altura;
	
	public Cilindro(double raio, double altura) {
		super(raio);
		this.altura = altura;
	}
	
	@Override
	double area() {
		return Math.PI * Math.pow(raio, 2);
	}
	
	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return ( 2 * Math.PI) * raio;
	}

	@Override
	public double calculaVolume() {
		return (Math.PI * Math.pow(raio, 2)) * altura;
	}
}
