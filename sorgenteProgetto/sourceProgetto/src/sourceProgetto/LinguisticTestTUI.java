package sourceProgetto;
import java.util.Scanner;
public class LinguisticTestTUI {

	public static void main(String[] args) {
		boolean check = true;
		while(check) {
			visualizzaMenu();
			Scanner input = new Scanner(System.in);
			System.out.println("Inserire una scelta");
			int inp = input.nextInt();
			while(inp < 0 || inp >5) {
				System.out.println("Scelta errata, inserire una nuova scelta");
				visualizzaMenu();
				inp = input.nextInt();
			}
			switch(inp) {
			case 1:
				creaTest();
				break;
			case 2:
				editaElementoGrafico(new Label(0, 0, "defualt"));
				break;
			case 3:
				editMark(new CheckBox(0, 0, new Label(0, 0, "defualt")));
				break;
			case 4:
				somministraTest();
				break;
			case 5:
				check = false;
				System.out.println("Arrivederci");
				break;
			default:
				break;
			}
		}

	}


	public static void visualizzaMenu() {
		System.out.println("Menù delle opzioni");
		System.out.println("1)\t crea un test");
		System.out.println("2)\t edita elemento grafico");
		System.out.println("3)\t marca un test come definitivo");
		System.out.println("4)\t somministra un test");
		System.out.println("5)\t esci");

	}
	
	public static void creaTest() {
		System.out.println("test creato!");
	}
	
	public static void editaElementoGrafico(ElementoGrafico e) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Menù delle opzioni");
		System.out.println("1)\t edita testo della label");
		System.out.println("2)\t edita dimensioni della label");
		int inpElem = input.nextInt();
		while(inpElem < 0 || inpElem >2) {
			System.out.println("Scelta errata, inserire una nuova scelta");
			System.out.println("Menù delle opzioni");
			System.out.println("1)\t edita label");
			System.out.println("2)\t edita checkbox");
			inpElem = input.nextInt();
		}
		switch(inpElem) {
		case 1:
			editaTestoLabel((Label) e);
			break;
		case 2:
			editaDimensioneLabel((Label) e);
			break;
		}
		
	}
	
	
	public static void editaTestoLabel(Label l) {
		//System.out.println(l.toString());
		System.out.println("Inserire il testo");
		Scanner input = new Scanner(System.in);
		String inpText = input.nextLine();
		l.changeText(inpText);
		System.out.println(l.toString());
	}
	
	public static void editaDimensioneLabel(Label l) {
		//System.out.println(l.toString());
		System.out.println("Inserire l'altezza");
		Scanner input = new Scanner(System.in);
		int inpY = input.nextInt();
		l.resizeLabel(inpY);
		System.out.println(l.toString());
	}
	

	private static void editMark(CheckBox c) {
		//System.out.println(c.toString());
		if(!c.isChecked()) {
			c.setRispostaCheckbox(true);
		}
		System.out.println(c.toString());
	}

	private static void somministraTest() {
		System.out.println("test somministrato");
	}


}