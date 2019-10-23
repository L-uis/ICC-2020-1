package ajedrez.piezas;

public class Prueba{
	public static void main(String[] args) {
		Posicion lugar = new Posicion(4,2);
		Peon peon = new Peon(Color.BLANCO,lugar);
		System.out.println("El peon se puede mover a las casillas: " + peon.obtenerJugadasLegales());

		Posicion lugarU = new Posicion(2,7);
		Peon peonU = new Peon(Color.NEGRO,lugarU);
		System.out.println("El peon se puede mover a las casillas: " + peonU.obtenerJugadasLegales());

		Posicion lugarD = new Posicion(6,4);
		Peon peonD = new Peon(Color.BLANCO,lugarD);
		System.out.println("El peon se puede mover a las casillas: " + peonD.obtenerJugadasLegales());
	
		Posicion lugarT = new Posicion(1,2);
		Peon peonT = new Peon(Color.NEGRO,lugarT);
		System.out.println("El peon se puede mover a las casillas: " + peonT.obtenerJugadasLegales());
	}
}