package paquete;

import processing.core.PApplet;

public class Ajedres extends PApplet{

	public static void main(String [] args){
			PApplet.main("paquete.Ajedres");
	}
	@Override
	public void settings(){
			size(800,800);
	}

	@Override
	public void setup(){
		
	}
	
	@Override
	public void draw(){
		int b,n
		;
		for (int y = 0 ; y <= 800 ; y +=100 ) {
			for ( int i=0 ; i<=1000 ;i+=200 ) {
				if(y == 0 || y == 200 || y == 400 || y == 600 || y == 800){
					n =0;
					b =100;
				}else {
					n = 100;
					b = 0;
				}
					fill(0xFFFFFFFF);
					rect(i+n,y,100,100);
					fill(0xFF000000);
		 			rect(i+b,y,100,100);		
			}
		}	
	}
}