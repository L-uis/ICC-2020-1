/**
 * Esta clase te permite crear libros con parametros titulo,
 * autor y año de publicacion, ademas de permitirte asignarle
 * otro valor a esos parametros, y obtener los parametros.
 * @author Peña Mata Juan Luis
 * @version 1.0
 */
public class Libro{

	private String titulo="";
	private String autor="";
	private int añoPublicacion=0;

/**
 * Se crea un objeto libro con parametros establecidos 
 * al parametro titulo se le asigno "No se encontro ningun titulo"
 * al parametro autor se le asigno "No se encontro ningun autor"
 * al parametro añoPublicacin se le asigno 0000
 */

public Libro(){
	titulo= "No se encontro ningun titulo";
	autor= "No se encontro ningun autor";
	añoPublicacion= 0000;
}

/**
 * Se crea un objeto libro con los parametros dados
 * @param titulo titulo
 * @param autor autor
 * @param añoPublicacion año de publicacion
 */

public Libro(String titulo,String autor,int añoPublicacion){
	this.titulo=titulo;
	this.autor=autor;
	this.añoPublicacion=añoPublicacion;
}

/**
 * Regresa el titulo
 * @return el titulo 
 */

public String getTitulo(){
	return titulo;
}

/**
 * Asigna un nuevo titulo
 * @param titulo el nuevo titulo
 */

public void setTitulo(String titulo){
	this.titulo=titulo;	
}

/**
 * Regresa el autor
 * @return el autor
 */

public String getAutor(){
	return autor;
}

/**
 * Asigna un nuevo autor
 * @param autor el nuevo autor
 */

public void setAutor(String autor){
	this.autor=autor;
}

/**
 * Regresa el año de publicacion
 * @return el año de publicacion
 */

public int getAñoPublicacion(){
	return añoPublicacion;
}

/**
 * Asigna un nuevo año de publicacion
 * @param añoPublicacion el nuevo año de publicacion
 */

public void setAñoPublicacion(int añoPublicacion){
	this.añoPublicacion=añoPublicacion;
}

}
