package semana8;

public class Triangulo implements IShape, IShow {

	private float lado1;
	private float lado2;
	private float lado3;
	
	
	public Triangulo(float lado1, float lado2, float lado3){
		
		setLado1(lado1);
		setLado2(lado2);
		setLado3(lado3);
	}
	
	
	
	
	public float getLado1() {
		return lado1;
	}




	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}




	public float getLado2() {
		return lado2;
	}




	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}




	public float getLado3() {
		return lado3;
	}




	public void setLado3(float lado3) {
		this.lado3 = lado3;
	}




	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("Area triangulo=" + getArea());
		System.out.println("Perimetro triangulo=" + getPerimetro());
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return (this.lado1 + this.lado2 + this.lado3) / 2;
	}

	@Override
	public float getPerimetro() {
		// TODO Auto-generated method stub
		return this.lado1 + this.lado2 + this.lado3;
	}

	
}
