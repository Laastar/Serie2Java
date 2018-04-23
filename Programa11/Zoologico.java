public class Zoologico {
	public static void main(String[] args) {

		Carnivoro tigre = new Tigre();
		Carnivoro leon = new Leon();
		Carnivoro puma = new Puma();

		Herbivoro antilope = new Antilope();
		Herbivoro cebra = new Cebra();
		Herbivoro venado = new Venado();

		tigre.comer();
		leon.comer();
		puma.jugar();

		antilope.comer();
		cebra.jugar();
		venado.jugar();
	}
}