public class Jugador {
	private String nombre;
	private Mano mano;
	private Familia familia;
	
	public Jugador(String nombre){
		this.nombre = nombre;
	}
	
	public void setFamilia(Familia familia){
		this.familia = familia;
	}
	
	public void setMano(Mano mano){
		this.mano = mano;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public Familia getFamilia(){
		return this.familia;
	}
	
	public Mano getMano(){
		return this.mano;
	}
	
	public String toString(){
		String data = "Familia:\n"+this.getFamilia().toString();
		data += "Mano:\n"+this.getMano().toString();
		return data;
	}
}
