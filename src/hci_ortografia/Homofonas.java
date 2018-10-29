package hci_ortografia;

import processing.core.PApplet;
import processing.core.PImage;

public class Homofonas {

	private PApplet p;
	private String[] homo;
	private int casos, ejercicio, verificar, opcion, palabra, def;
	private PImage n3_1, n3_2, n3_3, n3_4, n3_5, n3_6, n3_7, n3_8, n3_9, n3_10, n3_11, n3_12, n3_13, n3_14;

	public Homofonas(PApplet p) {
		this.p = p;

		casos = 0;
		opcion = 2;

		homo = p.loadStrings("../data/homofonas.txt");

		n3_1 = p.loadImage("../data/n3_1.png");
		n3_2 = p.loadImage("../data/n3_2.png");
		n3_3 = p.loadImage("../data/n3_3.png");
		n3_4 = p.loadImage("../data/n3_4.png");
		n3_5 = p.loadImage("../data/n3_5.png");
		n3_6 = p.loadImage("../data/n3_6.png");
		n3_7 = p.loadImage("../data/n3_7.png");
		n3_8 = p.loadImage("../data/n3_8.png");
		n3_9 = p.loadImage("../data/n3_9.png");
		n3_10 = p.loadImage("../data/n3_10.png");
		n3_11 = p.loadImage("../data/n3_11.png");
		n3_12 = p.loadImage("../data/n3_12.png");
		n3_13 = p.loadImage("../data/n3_13.png");
		n3_14 = p.loadImage("../data/n3_14.png");

	}

	public void pintar() {

		// p.image(n3_13, 0, 0);//y:279 el excelente

		switch (casos) {
		case 0:

			p.image(n3_2, 0, 0);

//			p.textAlign(p.CENTER, p.CENTER);
//			p.fill(255, 200, 0);
//			p.textSize(17);
//			p.text(homo[0] + "\n" + homo[1] + "\n" + homo[2] + "\n" + homo[3] + "\n" + homo[4], 204, 265);

			break;

		case 1:

			p.image(n3_4, 0, 0);

			break;

		case 2:

			switch (ejercicio) {
			case 0:

				p.image(n3_3, 0, 0);

				break;

			case 1:

				p.image(n3_8, 0, 0);

				break;

			case 2:

				p.image(n3_11, 0, 0);

				break;
			}

			switch (opcion) {
			case 0:
				p.image(n3_6, 0, 0);
				break;

			case 1:
				p.image(n3_7, 0, 0);
				break;
			}

			switch (palabra) {

			case 0:
				if (def == 1) {

					p.textAlign(p.CENTER, p.CENTER);
					p.fill(255);
					p.textSize(16);
					p.text("hay", 108, 297);

				} else if (def == 2) {

					p.textAlign(p.CENTER, p.CENTER);
					p.fill(255);
					p.textSize(16);
					p.text("hay", 286, 326);

				} else if (def == 3) {

					p.textAlign(p.CENTER, p.CENTER);
					p.fill(255);
					p.textSize(16);
					p.text("hay", 190, 406);

				}
				break;

			case 1:

				if (def == 1) {

					p.textAlign(p.CENTER, p.CENTER);
					p.fill(255);
					p.textSize(16);
					p.text("¡ay!", 108, 297);

				} else if (def == 2) {

					p.textAlign(p.CENTER, p.CENTER);
					p.fill(255);
					p.textSize(16);
					p.text("¡ay!", 286, 326);

				} else if (def == 3) {

					p.textAlign(p.CENTER, p.CENTER);
					p.fill(255);
					p.textSize(16);
					p.text("¡ay!", 190, 406);

				}
				break;

			case 2:

				if (def == 1) {

					p.textAlign(p.CENTER, p.CENTER);
					p.fill(255);
					p.textSize(16);
					p.text("ahí", 108, 297);

				} else if (def == 2) {

					p.textAlign(p.CENTER, p.CENTER);
					p.fill(255);
					p.textSize(16);
					p.text("ahí", 286, 326);

				} else if (def == 3) {

					p.textAlign(p.CENTER, p.CENTER);
					p.fill(255);
					p.textSize(16);
					p.text("ahí", 190, 406);

					
				}
				break;
			}

			break;

		case 3:

			switch (verificar) {
			case 0:

				p.image(n3_10, 0, 0);

				break;

			case 1:

				p.image(n3_9, 0, 0);

				break;

			case 2:

				p.image(n3_12, 0, 0);

				break;
			}

			break;

		case 4:

			p.image(n3_5, 0, 0);

			break;

		case 5:

			p.image(n3_14, 0, 0);

			break;

		}

	}

	public void elegir() {
		// System.out.println(p.mouseX + "," + p.mouseY);

		switch (casos) {

		case 0:

			if (p.mouseX > 79 && p.mouseX < 315 && p.mouseY > 562 && p.mouseY < 604) {
				casos = 1;
			}

			break;

		case 1:

			if (p.mouseX > 79 && p.mouseX < 315 && p.mouseY > 562 && p.mouseY < 604) {
				casos = 2;
				ejercicio = 0;
			}

			break;

		case 2:

			if (p.mouseX > 74 && p.mouseX < 141 && p.mouseY > 274 && p.mouseY < 299) {
				opcion = 0;
				def = 1;
			}

			if (p.mouseX > 254 && p.mouseX < 324 && p.mouseY > 302 && p.mouseY < 326) {
				opcion = 0;
				def = 2;
			}

			if (p.mouseX > 158 && p.mouseX < 227 && p.mouseY > 380 && p.mouseY < 404) {
				opcion = 0;
				def = 3;
			}

			opcionesHomo();

			break;
		}

	}

	public void opcionesHomo() {

		switch (opcion) {
		case 0:

			if (p.mouseX > 34 && p.mouseX < 133 && p.mouseY > 562 && p.mouseY < 602) {
				palabra = 0;
			}

			if (p.mouseX > 148 && p.mouseX < 251 && p.mouseY > 562 && p.mouseY < 602) {
				palabra = 1;
			}

			if (p.mouseX > 267 && p.mouseX < 364 && p.mouseY > 562 && p.mouseY < 602) {
				palabra = 2;
			}

			break;

		case 1:

			if (p.mouseX > 34 && p.mouseX < 133 && p.mouseY > 562 && p.mouseY < 602) {
				palabra = 0;
			}

			if (p.mouseX > 148 && p.mouseX < 251 && p.mouseY > 562 && p.mouseY < 602) {
				palabra = 1;
			}

			if (p.mouseX > 267 && p.mouseX < 364 && p.mouseY > 562 && p.mouseY < 602) {
				palabra = 2;
			}

			break;

		}

	}
}
