package clases;

public class Punto {
	
	
	private int x;
	private int y;

	/**
	 * Constructor por defecto con coordenadas (0,0)
	 */
	public Punto () {
		
		this.x = 0;
		this.y = 0;
		
	}
	
	/**
	 * Constructor que recibe 2 parametros
	 * @param x
	 * @param y
	 */
	
	public Punto (int x, int y) {
		
		this.x= x;
		this.y= y;
		
	}
	
	/**
	 * GETTERS
	 */
	
	/**
	 * Getter de x
	 * @return Nos devuelve X
	 */
	
	public int getX() {
		
		return this.x;
	}
	
	/**
	 * Getter de y
	 * @return Nos devuelve Y
	 */
	
	public int getY() {
		
		return this.y;
	}
	
	
	/**
	 * SETTERS
	 */
	
	/**
	 * Cambiar parametro x
	 * @param x
	 */
	
	public void setX (int x) {
		
		this.x = x;
		
	}
	
	/**
	 * Cambiar parametro y
	 * @param y
	 */
	
	public void setY (int y) {
		
		this.y = y;
	}
	
	/**
	 * Nos devuelve las coordenadas formato (X,Y)
	 */
	
	@Override
    public String toString (){
        
        String mensaje= "";
        
        mensaje += "( " + this.getX() + " , " + this.getY() + " )";
        
        
        return mensaje;
    }
	
	
	
	
	
	
	
	

}
