public class test {
	public static void main(String[] args) {
		Mazo m = new Mazo(); //Creates the main deck
		System.out.println(m.toString());
		System.out.println(m.darCarta().toString());
		System.out.println(m.toString());
		Familia f1 = FamiliasJuego.getFamilia(1); //Gets an array of characters
		System.out.println(f1.toString());
		
	}
}
