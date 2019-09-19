package geometria;

/**
 * Representa un polígono de tres lados. Está definido 
 * por tres puntos en el plano cartesiano.
 * @since 1.0
 */

public class Triangulo{

	/**
	 * Triángulo con todos sus lados de la misma longitud.
	 */
	public static final int EQUILATERO=0;
	/**
	 * Triángulo con todos sus lados de longitud distinta.
	 */
	public static final int ESCALENO=2;
	/**
	 * Triángulo con exactamente dos lados de la misma longitud.
	 */
	public static final int ISOSCELES=1;

	private Punto a;
	private Punto b;
	private Punto c;

	/**
	 * Crea un triángulo equilátero de lado 1 con
	 * vértices en (0, 0), (1, 0) y (0.5, sin(π / 3)).
	 */
	public Triangulo(){
		a=new Punto(0,0);
		b=new Punto(1,0);
		c=new Punto(0.5,Math.sin(Math.PI/3.0));
	}

	/**
	 * Crea un triángulo con los tres puntos dados.
	 * @param a Punto a
	 * @param b Punto b
	 * @param c Punto c
	 */	
	public Triangulo(Punto a, Punto b, Punto c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	/**
	 * Determina so los vértices de este triángulo están alinados.
	 * @return true si lis vértices están alineados.
	 */

	public boolean tieneVerticesAlineados(){
		return a.estanAlineados(b,c);
	}

	 /**
	  * Regresa el tipo de este triángulo según la longitud de sus lados;
	  * puede ser equilátero, isósceles o escaleno.
	  * @return el tipo de este triangulo.
	  */

	public int tipo(){

		if (a.distancia(b)==a.distancia(c) && b.distancia(c) == a.distancia(c) && a.distancia(b)==b.distancia(c)) {
			return EQUILATERO;
		}else{
			if (a.distancia(b)==b.distancia(c) || b.distancia(c)==c.distancia(a) || c.distancia(a)==a.distancia(b)) {
				return ISOSCELES;		
			}else{
					return ESCALENO;	
			}
		}
				
	}

	public Punto getVerticeA(){
		return a;
	}

	public Punto getVerticeB(){
		return b;
	}

	public Punto getVerticeC(){
		return c;
	}
}
