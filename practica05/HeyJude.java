
public class HeyJude {
	public static void main(String[]args){

	String HEY = "Hey Jude";

	String DONT = "don't";

	String MAKE = "make it bad";
	String BE ="be afraid";
	String LETME ="let me down";

	String TAKE = "take a sad song and make it better" ;
	String MADE = "you were made to go out and get her" ;
	String FOUND = "you have found her, now go and get her" ;
	
	String REMEMBER = "remember to" ;

	String INTO = "let her into you heart" ;
 	String UNDER = "let her under your skin" ;

	String THEN = "then you" ;

	String START = "can start" ;
	String BEGIN = "begin" ;

	String MAKEBETTER = "to meke it better" ; 

	String BETTER = "better";
	String OH = "oh";

	String NA = "na" ;

	int p=0,n=0;

	while (p < 7){
		if (p==2||p==4||p==6) {
			while (n<10){
				System.out.print(NA+" ");
				n++;
			}
			if (p==2||p==4){
			System.out.println("");
			}
		n=0;
		}
		// Primera lina
		if (p==0||p==1||p==3||p==5||p==6) {
			System.out.print(HEY+" ");
		}
		if (p==0||p==1||p==3||p==5) {
			System.out.print(DONT+" ");
		}
		if (p==0||p==5) {
			System.out.println(MAKE);
		}
		if (p==1) {
			System.out.println(BE);
		}
		if (p==3) {
			System.out.println(LETME);
		}

		//SegundaLinea
		if (p==0||p==5) {
			System.out.println(TAKE);
		}
		if (p==1){
			System.out.println(MADE);
		}
		if (p==3) {
			System.out.println(FOUND);
		}

		//Tercera linea
		if (p==0||p==1||p==3||p==5) {
			System.out.print(REMEMBER+" ");
		}
		if (p==0||p==3) {
			System.out.println(INTO);
		}
		if (p==1||p==5){
			System.out.println(UNDER);
		}
		

		//Cuarta linea
		if (p==0||p==1||p==3||p==5) {
			System.out.print(THEN+" ");
		}
		if (p==0||p==3) {
			System.out.print(START+" ");
		}
		if (p==1||p==5) {
			System.out.print(BEGIN+" ");
		}
		
		if (p==0||p==1||p==3||p==5) {
			System.out.println(MAKEBETTER);
		}

		//Quinta linea
		if (p==5) {
			while (n<5){
				System.out.print(BETTER+" ");
				n++;
			}
			System.out.println(OH);	
			n=0;
		}
		if (p<7) {
			System.out.println("");
		}
	p++;
	}
	}
}