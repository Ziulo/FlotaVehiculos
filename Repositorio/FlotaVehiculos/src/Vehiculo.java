
public class Vehiculo {
	
	//ATRIBUTOS
	
	private int id;
	private String marca;
	private String modelo; 
	private String bastidor;
	private String color;
	private String matrícula;
	private Cliente idCliente; 
	
	//CONSTRUCTORES
	
		public void CLIENTE(int id, String marca, String modelo, String bastidor, String color, String matrícula)
	    {
			this.id = id;
			this.marca = marca;
			this.modelo = modelo;
			this.bastidor = bastidor;
			this.color = color;
			this.matrícula = matrícula;
	    }
}
