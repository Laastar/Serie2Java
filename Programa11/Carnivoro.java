public class Carnivoro implements Animal {
	private String nombre;
	private String comida;
	private String juego;

	public Carnivoro(String nombre, String comida, String juego){
		this.nombre = nombre;
		this.comida = comida;
		this.juego = juego;
	}
	public String getNombre(){
		return nombre;
	}

	public String getComida(){
		return comida;
	}

	public String getJuego(){
		return juego;
	}

	@Override
	public void comer() {
		System.out.println("El " + getNombre() + " esta comiendo " + getComida());
	}

	@Override
	public void jugar() {
		System.out.println("El " + getNombre() + " esta jugando " + getJuego());
	}
}