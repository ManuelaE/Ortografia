package hci_ortografia;

import processing.core.PApplet;

public class Logica {

	private PApplet p;
	private Sinonimos nivel2;
	private Homofonas nivel3;
	private int pantallas;

	public Logica(PApplet p) {
		this.p = p;
		
		pantallas = 4;
		
		
		nivel2 = new Sinonimos(p);
		nivel3 = new Homofonas(p);
	}

	public void pintar() {

		pantalla();
	}

	public void pantalla() {

		switch (pantallas) {

		case 0:

			break;

		case 1:

			break;

		case 2:
			
			nivel2.pintar();

			if (nivel2.isTermineNivel()) {

				pantallas++;
			}

			break;

		case 3:
			
			
			break;
			
		case 4:

			nivel3.pintar();

			break;

		}
	}

	public void zonaSensible() {
		System.out.println(p.mouseX + "," + p.mouseY);
		
		switch (pantallas) {

		case 0:
			
			if (p.mouseX > 0 && p.mouseX < 420 && p.mouseY > 0 && p.mouseY < 700) {
				pantallas = 1;
			}
			
			break;

		case 1:
			
			if (p.mouseX > 0 && p.mouseX < 420 && p.mouseY > 0 && p.mouseY < 700) {
				pantallas = 2;
			}

			break;

		case 2:

			nivel2.validarCambio();
			break;

		case 3:
			
			if (p.mouseX > 0 && p.mouseX < 420 && p.mouseY > 0 && p.mouseY < 700) {
				pantallas = 4;
			}

			break;
			
		case 4:

			break;

		}
	}

}
