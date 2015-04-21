package TPanual;

public class Usuario {
	private Double peso;
	private Double altura;
	
	public Usuario(Double peso, Double altura){
		this.peso=peso;
		this.altura=altura;
	}
	
	public Double obtenerIndiceDeMasaCorporal(){
		return peso/(altura*altura);
	}
}
