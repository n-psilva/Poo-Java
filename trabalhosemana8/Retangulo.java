package trabalhoshape;

/**
 *
 * @author natan
 */
public class Retangulo implements IShape, IShow {

	private float base;
	private float altura;
	
	/*public Retangulo( float base, float altura) {

		setBase(base);
		setAltura(altura);
	}*/

	

	public float getBase() {
		return base;
	}



	public void setBase(float base) {

		this.base = base;
	}



	public float getAltura() {

		return altura;
	}



	public void setAltura(float altura) {

		this.altura = altura;
	}



	@Override
	public float getArea() {

		// TODO Auto-generated method stub
		return this.base * this.altura;
	}



	@Override
	public float getPerimetro() {

		// TODO Auto-generated method stub
		return 2*(this.base + this.altura);
	}



	@Override
	public void imprimir() {

		// TODO Auto-generated method stub
		System.out.println("Area retangulo =" + getArea());
		System.out.println("Perimetro retangulo = " + getPerimetro());
	}
	

}
