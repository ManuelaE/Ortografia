package hci_ortografia;

import processing.core.PApplet;

public class Main extends PApplet{
	
	Logica log;

	public static void main(String[] args) {
		PApplet.main("hci_ortografia.Main");
	}
	
	public void settings () {
		size(408, 700);
	}
	
	public void setup () {
		log = new Logica(this);
	}
	
	public void draw ( ) {
		background(255);
		log.pintar();
	}
	
	public void mousePressed () {
		
		log.zonaSensible();
	}

}
