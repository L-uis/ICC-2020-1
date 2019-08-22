import java.util.Scanner;

public class RFC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombrecompleto = new String(); 
        String fechaNacimiento = new String();
		System.out.println("Escribe tu nombre completo:");
		nombrecompleto=scanner.nextLine();
        /*
        * Fecha
        */
        System.out.println("Escribe Tu fecha de nacimiento en el formato dd/mm/aaaa");
        fechaNacimiento= scanner.nextLine();
        /*
        * obtencion de letras
        */
        char nombre = nombrecompleto.charAt(0);
        int apellidoPaterno = nombrecompleto.indexOf(" ");
        String letrados = nombrecompleto.substring(apellidoPaterno+1,apellidoPaterno+3);
        int apellidoMaterno = nombrecompleto.lastIndexOf(" ");
        String letradosMayuscula = letrados.toUpperCase();
        char letraTres = nombrecompleto.charAt(apellidoMaterno+1);
        /*
        * obtencion de la fecha
        */
        String dia = fechaNacimiento.substring(0,2);
        String mes = fechaNacimiento.substring(3,5);
        String año = fechaNacimiento.substring(8,10);
 
		System.out.println("El RFC de "+nombrecompleto+" es : "+letradosMayuscula+letraTres+nombre+año+mes+dia);
	}

}