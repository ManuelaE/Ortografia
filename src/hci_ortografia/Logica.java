package hci_ortografia;

import processing.core.PApplet;
import processing.core.PImage;

public class Logica {

	private PApplet p;
	private Sinonimos nivel2;
	private NivelDos nivel3;
	private int pantallas, puntos;
	private PImage n1_1, n1_2, n1_3, n1_4, n1_8, n2_9;

	public Logica(PApplet p) {
		this.p = p;

		pantallas = 0;
		puntos = 1200;

		nivel2 = new Sinonimos(p);
		nivel3 = new NivelDos(p);

		n1_1 = p.loadImage("../data/n1/n1_1.png");
		n1_2 = p.loadImage("../data/n1/n1_2.jpg");
		n1_3 = p.loadImage("../data/n1/n1_3.jpg");
		n1_4 = p.loadImage("../data/n1/n1_4.jpg");
		n1_8 = p.loadImage("../data/n1/n1_8.jpg");
		n2_9 = p.loadImage("../data/n1/n2_9.jpg");
	}

	public void pintar() {

		pantalla();
	}

	public void pantalla() {

		switch (pantallas) {

		case 0:
			p.image(n1_1, 0, 0, 393, 700);
			break;

		case 1:
			p.image(n1_2, 0, 0, 393, 700);
			break;

		case 2:
			p.image(n1_3, 0, 0, 393, 700);
			break;

		case 3:
			p.image(n1_4, 0, 0, 393, 700);
			break;

		case 4:

			nivel2.pintar();

			if (nivel2.isTermineNivel()) {

				pantallas=7;
			}

			break;

		case 5:
			p.image(n1_8, 0, 0, 393, 700);
			break;

		case 6:

			nivel3.pintar();

			break;
			
		case 7:
			p.image(n2_9, 0, 0, 393, 700);
			break;

		}
	}

	public void zonaSensible() {
		System.out.println(p.mouseX + "," + p.mouseY);

		switch (pantallas) {

		case 0:

			if (p.mouseX > 0 && p.mouseX < 393 && p.mouseY > 0 && p.mouseY < 700) {
				pantallas = 1;
			}

			break;

		case 1:

			if (p.mouseX > 77 && p.mouseX < 316 && p.mouseY > 501 && p.mouseY < 543) {
				pantallas = 2;
			}

			break;

		case 2:

			if (p.mouseX > 79 && p.mouseX < 315 && p.mouseY > 562 && p.mouseY < 604) {
				pantallas = 3;
			}

			break;

		case 3:

			if (p.mouseX > 78 && p.mouseX < 315 && p.mouseY > 492 && p.mouseY < 533) {
				pantallas = 5;
			}

			break;

		case 4:

			// nivel3.elegir();
			nivel2.zonasS();
			

			break;

		case 5:

			if (p.mouseX > 273 && p.mouseX < 339 && p.mouseY > 529 && p.mouseY < 586) {
				pantallas = 4;
			}

			break;

		case 6:

			nivel3.zonasS();

			break;
			
		case 7:
			
			if (p.mouseX > 203 && p.mouseX < 266 && p.mouseY > 475 && p.mouseY < 527) {
				pantallas = 6;
			}
			
			break;

		}
	}

}
