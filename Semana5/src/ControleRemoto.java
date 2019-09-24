
public class ControleRemoto implements Controlador{

	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//metodos getters/setters
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean isLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean isTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void menosVolume() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}
}
