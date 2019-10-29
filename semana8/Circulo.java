package semana8;

public class Circulo implements IShape, IShow {

	public float raio;
	
	public Circulo(float raio){
		
		setRaio(raio);
	}
	
	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("Area circulo = " + getArea());
		System.out.println("Perimetro circulo =" + getPerimetro());
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return 3.14f * (this.raio * this.raio);
	}

	@Override
	public float getPerimetro() {
		// TODO Auto-generated method stub
		return (2*3.14f) * this.raio;
	}

}
