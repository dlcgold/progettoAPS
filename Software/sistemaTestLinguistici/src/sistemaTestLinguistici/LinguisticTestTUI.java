package sistemaTestLinguistici;

import java.util.Scanner;

public class LinguisticTestTUI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Effettuare il login:\n");
		System.out.print("User: ");
		String user = input.nextLine();
		System.out.print("Password: ");
		String passwd = input.nextLine();
		String id = "root";
		String password = "expert";
		while(!id.equals(user) || !password.equals(passwd)){
			System.out.println("Credenziali errate, inserire nuovamente:");
			System.out.print("User: ");
			user = input.nextLine();
			System.out.print("Password: ");
			passwd = input.nextLine();
		}
		boolean check = true;
		while(check) {
			visualizzaMenu();
			System.out.print("Inserire una scelta: ");
			int inp = input.nextInt();
			while(inp < 0 || inp >5) {
				visualizzaMenu();
				System.out.print("Scelta errata, inserire una nuova scelta: ");
				inp = input.nextInt();
			}
			switch(inp) {
				case 1:
					creaTest();
					break;
				case 2:
					editaElementoGrafico(new Label(0, 0, "default"));
					break;
				case 3:
					editMark(new CheckBox(0, 0, new Label(0, 0, "default")));
					break;
				case 4:
					somministraTest();
					break;
				case 5:
					check = false;
					System.out.println("Arrivederci!");
					break;
				default:
					break;
			}
		}

	}


	public static void visualizzaMenu() {
		System.out.println("Menù delle opzioni");
		System.out.println("1) Crea un test");
		System.out.println("2) Edita elemento grafico");
		System.out.println("3) Marca un test come definitivo");
		System.out.println("4) Somministra un test");
		System.out.println("5) Esci");

	}
	
	public static void creaTest() {
		System.out.println("Test creato!");
	}
	
	public static void editaElementoGrafico(ElementoGrafico e) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Menù delle opzioni");
		System.out.println("1)\t Edita testo della label");
		System.out.println("2)\t Edita dimensioni della label");
		int inpElem = input.nextInt();
		while(inpElem < 0 || inpElem > 2) {
			System.out.println("Menù delle opzioni");
			System.out.println("1) Edita label");
			System.out.println("2) Edita checkbox");
			System.out.print("Scelta errata, inserire una nuova scelta: ");
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
		System.out.print("Inserire il testo: ");
		Scanner input = new Scanner(System.in);
		String inpText = input.nextLine();
		l.changeText(inpText);
		System.out.println(l.toString());
	}
	
	public static void editaDimensioneLabel(Label l) {
		System.out.print("Inserire l'altezza: ");
		Scanner input = new Scanner(System.in);
		int inpY = input.nextInt();
		l.resizeLabel(inpY);
		System.out.println(l.toString());
	}
	

	private static void editMark(CheckBox c) {
		/**
		TODO
		Sono stati utilizzati i metodi della classe CheckBox a scopo illustrativo.
		Sarebbe necessario avere classi e metodi opportune per il check di un test
		in modo da poterlo segnare come definitivo. 
		*/

		if(!c.isChecked()) {
			c.setRispostaCheckBox(true);
		}
		System.out.println(c.toString());
	}

	private static void somministraTest() {
		System.out.println("Test somministrato!");
	}


}
