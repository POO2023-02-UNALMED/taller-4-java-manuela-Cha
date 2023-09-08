package classroom;

public enum Tipo {
	DISCIPLINAR(10) ,FUNDAMENTACION(20),ELECTIVA(30);
	
	private final int codigo;
	private final String nombre;
	
	private Tipo(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
