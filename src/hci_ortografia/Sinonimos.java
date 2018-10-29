package hci_ortografia;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import processing.core.PApplet;
import processing.core.PImage;

public class Sinonimos {

	private PApplet p;
	private int xS, yS, xP, yP, sins, pCurso, puntos, pantallas, resultados;
	private boolean termineNivel;
	private PImage n2_1, n2_2,n2_4, n2_8, n2_10, n2_11, n5_2;
	private String sinonimo_uno, sinonimo_dos, sinonimo_tres, prueba;
	private ArrayList<String> palabraEnCurso;
	private ArrayList<ArrayList> sinonimos;
	private ArrayList<String> s_uno;
	private ArrayList<String> s_dos;
	private ArrayList<String> s_tres;
	private ArrayList<String> s_guardoRandom;
	String[] palabritas;
	String[] palabrotas_uno;
	String[] palabrotas_dos;
	String[] palabrotas_tres;

	public Sinonimos(PApplet p) {
		this.p = p;

		palabraEnCurso = new ArrayList<>();
		sinonimos = new ArrayList<>();
		s_uno = new ArrayList<>();
		s_dos = new ArrayList<>();
		s_tres = new ArrayList<>();
		s_guardoRandom = new ArrayList<>();

		palabraEnCurso.add("Amor");
		palabraEnCurso.add("Analizar");
		palabraEnCurso.add("Incomodidad");

		xS = 197;
		yS = 325;
		xP = 196;
		yP = 205;
		sins = 0;
		pCurso = 0;
		puntos = 0;
		pantallas = 0;
		resultados = 0;
		
		n2_1 = p.loadImage("../data/n2/n2_1.jpg");
		n2_2 = p.loadImage("../data/n2/n2_2.jpg");
		n2_4 = p.loadImage("../data/n2/n2_4.jpg");
		n2_8 = p.loadImage("../data/n2/n2_8.jpg");
		n2_10 = p.loadImage("../data/n2/n2_10.jpg");
		n2_11 = p.loadImage("../data/n2/n2_11.jpg");
		n5_2 = p.loadImage("../data/n2/n5_2.jpg");

		palabritas = p.loadStrings("../data/sinonimosPorPalabra.txt");
		palabrotas_uno = palabritas[3].split(",");
		palabrotas_dos = palabritas[4].split(",");
		palabrotas_tres = palabritas[5].split(",");

		cargarPalabras();

	}

	public void pintar() {
		
		pantalla();

	}
	
	public void pantalla () {
		
		switch (pantallas) {
		case 0:
			p.image(n2_1, 0, 0, 393, 700);
			break;
			
		case 1:
			p.image(n2_10, 0, 0, 393, 700);
			break;
			
		case 2:
			p.image(n2_11, 0, 0, 393, 700);
			break;
			
		case 3:
			p.image(n2_2, 0, 0, 393, 700);
			break;
			
		case 4:
			p.image(n5_2, 0, 0, 393, 700);
			
			juego();
			break;
			
		case 5:
			p.image(n2_4, 0, 0, 393, 700);
			//System.out.println("fuck");
			break;
			
		case 6:
			p.image(n2_8, 0, 0, 393, 700);
			break;
			
		case 7:
			termineNivel = true;
			break;
		}
	}

	public void pintarSinonimos() {

		if (pCurso == 0) {

			sinonimo_uno = s_uno.get(sins);

			p.fill(255);
			p.textSize(50);
			p.text(sinonimo_uno, xS, yS);

		} else if (pCurso == 1) {

			sinonimo_dos = s_dos.get(sins);

			p.fill(255);
			p.textSize(50);
			p.text(sinonimo_dos, xS, yS);

		} else if (pCurso == 2) {

			sinonimo_tres = s_tres.get(sins);

			p.fill(255);
			p.textSize(50);
			p.text(sinonimo_tres, xS, yS);
		}
	}
	
	public void juego () {
		
		pintarSinonimos();
		
		p.fill(255);
		p.textSize(13);
		p.text(puntos, 243, 154);

		String palabra = palabraEnCurso.get(pCurso);
		
		p.textAlign(p.CENTER, p.CENTER);
		p.fill(255);
		p.textSize(30);
		p.text(palabra, xP, yP);
		
		if (resultados == 1) {
			
			pantallas=5;
			
		}
	}

	public void validar(boolean comprobar) {

		String palabra_1 = palabritas[pCurso];

		if (comprobar == true) {

			switch (pCurso) {
			case 0:

				if (palabra_1.contains(sinonimo_uno)) {
					puntos += 30;
				}
				break;

			case 1:

				if (palabra_1.contains(sinonimo_dos)) {
					puntos += 30;
				}
				break;

			case 2:

				if (palabra_1.contains(sinonimo_tres)) {
					puntos += 30;
				}
				break;

			}

		} else {

			switch (pCurso) {
			case 0:

				if (palabra_1.contains(sinonimo_uno) == false) {
					puntos += 30;
				}
				
				break;

			case 1:

				if (palabra_1.contains(sinonimo_dos) == false) {
					puntos += 30;
				}
				
				break;

			case 2:

				if (palabra_1.contains(sinonimo_tres) == false) {
					puntos += 30;
				}
				
				break;

			}
		}

	}

	public void validarCambio() {
		// System.out.println(p.mouseX + "," + p.mouseY);

		if (p.mouseX > 77 && p.mouseX < 144 && p.mouseY > 548 && p.mouseY < 601) {

			validar(false);

			if (sins < 19) {
				sins++;

			} else if (sins == 19) {
				
				sins = 0;
				resultados = 1;

				/*if (pCurso < 3) {
					sins = 0;

					if (pCurso == 2) {
						termineNivel = true;
					} else {

						pCurso++;
					}

				}*/
			}

		}

		if (p.mouseX > 249 && p.mouseX < 314 && p.mouseY > 548 && p.mouseY < 601) {

			validar(true);

			if (sins < 19) {
				sins++;

			} else if (sins == 19) {

				sins = 0;
				resultados = 1;

				/*if (pCurso < 3) {
					sins = 0;

					if (pCurso == 2) {
						termineNivel = true;
					} else {

						pCurso++;
					}

				}*/
			}
		}
	}

	public void zonasS () {
		
		switch (pantallas) {
		case 0:
			if (p.mouseX > 79 && p.mouseX < 315 && p.mouseY > 562 && p.mouseY < 604) {
				pantallas = 1;
			}
			break;
			
		case 1:
			if (p.mouseX > 79 && p.mouseX < 315 && p.mouseY > 562 && p.mouseY < 604) {
				pantallas = 2;
			}
			
			break;
			
		case 2:
			if (p.mouseX > 79 && p.mouseX < 315 && p.mouseY > 562 && p.mouseY < 604) {
				pantallas = 3;
			}
			break;
			
		case 3:
			if (p.mouseX > 0 && p.mouseX < 391 && p.mouseY > 120 && p.mouseY < 516) {
				pantallas = 4;
			}
			break;
			
		case 4:
			validarCambio();
			break;
			
		case 5:
			if (p.mouseX > 79 && p.mouseX < 315 && p.mouseY > 562 && p.mouseY < 604) {
				pantallas = 6;
			}
			break;
			
		case 6:
			if (p.mouseX > 115 && p.mouseX < 351 && p.mouseY > 449 && p.mouseY < 513) {
				pantallas = 7;
			}
			break;

		}
	}
	
	public void cargarPalabras() {

		for (int i = 0; i < palabrotas_uno.length; i++) {

			s_uno.add(palabrotas_uno[i].trim());
			// System.out.println(palabrotas_uno[i].trim());
		}

		Collections.shuffle(s_uno);

		for (int i = 0; i < palabrotas_dos.length; i++) {

			s_dos.add(palabrotas_dos[i].trim());
			// System.out.println(palabrotas_dos[i].trim());
		}

		Collections.shuffle(s_dos);

		for (int i = 0; i < palabrotas_tres.length; i++) {

			s_tres.add(palabrotas_tres[i].trim());
			// System.out.println(palabrotas_tres[i].trim());
		}

		Collections.shuffle(s_tres);
		/*
		 * for (int i = 0; i < s_tres.size(); i++) {
		 * 
		 * System.out.println(s_tres.get(i)); }
		 */

	}

	public boolean isTermineNivel() {
		return termineNivel;
	}

	public void setTermineNivel(boolean termineNivel) {
		this.termineNivel = termineNivel;
	}
}
