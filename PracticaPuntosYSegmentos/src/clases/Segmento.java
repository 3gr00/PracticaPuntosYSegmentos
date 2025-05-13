package clases;

public class Segmento {
	
	public Punto a;
	public Punto b;
	
	/**
	 * Constructor por defecto con segmentos (0,0) y (1,1)
	 */
	
	public Segmento() {
		
		this.a = new Punto(0, 0);
		this.b = new Punto(1, 1);
	}

	
	/**
	 * Constructor que recibe como parametro 2 puntos
	 * @param a
	 * @param b
	 */
	
	public Segmento (Punto a, Punto b) {
		
		this.a = a;
		this.b = b;
		if (a.toString() == b.toString()) {
			throw new IllegalArgumentException ("Los puntos son iguales");
		}
	}
	
	
	/**
	 * GETTERS
	 */
	
	public Punto getA() {
		
		return this.a;
		
	}
	
	public Punto getB() {
		
		return this.b;
		
	}
	
	
	/**
	 * SETTERS
	 */
	
	public void setA (Punto a) {
		
		this.a = a;
		
	}
	
	public void setB (Punto b) {
		
		this.b= b;
	}
	
	/**
	 * METODO distancia
	 */

	public double Distancia() {
		return Math.sqrt(Math.pow((b.getX() - a.getX()), 2)+ Math.pow((b.getY() - b.getX()), 2));
	}
	
	@Override
	public String toString() {
		return "[ " + this.a + "," + this.b + " ]";
	}


}
