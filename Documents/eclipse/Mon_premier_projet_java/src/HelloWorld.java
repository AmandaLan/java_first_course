import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello world");
		String chaine = "Joris Poupoune";
		int num2 = 8;
		System.out.println(chaine + " " + num2 * 3 + "ans");
		if (num2 < 7) {
			System.out.println("Guillaume");
		} else {
			System.out.println("Briac");
		}
//		String[] apprenants = new String[4];
//		apprenants[0] = "Ibrahim";
//		apprenants[1] = "Kevin";
//		apprenants[2] = "Yasmine";
//		apprenants[3] = "Soumaya";
//		for (int i = 0; i < apprenants.length; i++) {
//			System.out.println(apprenants[i]);			
//		}
//		for (String Unapprenant:apprenants) {
//			System.out.println(Unapprenant);			
//		}
//		int note = 10;
//		if(note < 8) {
//			System.out.println("Recal�");
//		}else if(note < 10) {
//			System.out.println("Rattrapage");
//		}else if(note < 12) {
//			System.out.println("Passable");
//		}else if(note < 14) {
//			System.out.println("Assez bien");
//		}else if(note < 16) {
//			System.out.println("Bien");
//		}else {
//			System.out.println("Tr�s bien");
//		}
//		int[] note = new int[5];
//		note[0] = 12;
//		note[1] = 16;
//		note[2] = 9;
//		note[3] = 2;
//		note[4] = 15;
//		for (int i = 0; i < note.length; i++) {
//			if(note[i] < 8) {
//				System.out.println("Recal�");
//			}else if(note[i] < 10) {
//				System.out.println("Rattrapage");
//			}else if(note[i] < 12) {
//				System.out.println("Passable");
//			}else if(note[i] < 14) {
//				System.out.println("Assez bien");
//			}else if(note[i] < 16) {
//				System.out.println("Bien");
//			}else {
//				System.out.println("Tr�s bien");
//			}
//			
//		}
//		for (int unenote:note) {
//			if(unenote < 8) {
//				System.out.println("Recal�");
//			}else if(unenote < 10) {
//				System.out.println("Rattrapage");
//			}else if(unenote < 12) {
//				System.out.println("Passable");
//			}else if(unenote < 14) {
//				System.out.println("Assez bien");
//			}else if(unenote < 16) {
//				System.out.println("Bien");
//			}else {
//				System.out.println("Tr�s bien");
//			}
//		}

//		Personne joris = new Personne("Joris", "Poupoune", "Homme", 45, 104, 156);
//		int poids = joris.getWeight();
//		joris.setWeight(654);
//		System.out.println(joris.getWeight());
//		System.out.println(poids);

//		Apprenant[] apprenants = new Apprenant[4];
//		apprenants[0] = new Apprenant("fefe","freffr", 1, "ferfer");
//		apprenants[1] = new Apprenant("gtht","vfrr", 3, "hyjyj");
//		apprenants[2] = new Apprenant("hhthh","hyyjt", 2, "jjtujty");
//		apprenants[3] = new Apprenant("efergergr","ghtyjtj", 3, "kuilo");
//		for (Apprenant unapprenant:apprenants) {
//
//			if(unapprenant.getNiveau() == 3) {
//				System.out.println(unapprenant.toString());
//			}
//		}

//		ArrayList<Apprenant> list1 = new ArrayList<Apprenant>();
//		Apprenant A1 = new Apprenant("fefe", "freffr", 1, "ferfer");
//		Apprenant A2 = new Apprenant("gtht", "vfrr", 3, "hyjyj");
//		Apprenant A3 = new Apprenant("hhthh", "hyyjt", 2, "jjtujty");
//		Apprenant A4 = new Apprenant("efergergr", "ghtyjtj", 3, "kuilo");
//
//		list1.add(A1);
//		list1.add(A2);
//		list1.add(A3);
//		list1.add(A4);
//
//		for (Apprenant list : list1) {
//			if (list.getNiveau() == 3) {
//				System.out.println(list.toString());
//			}
//		}
//		Scanner myObj = new Scanner(System.in);
//		System.out.println("Entrer une description, une quantit� et un prix:");
//		String description = myObj.nextLine();
//		int quantite = myObj.nextInt();
//		int prix = myObj.nextInt();
//		
//		System.out.println("Description: " + description);
//		System.out.println("Quantit�: " + quantite);
//		System.out.println("Prix: " + prix);
//		System.out.println("Total: " + prix * quantite);
		
		ArrayList<Product> products = new ArrayList<Product>();
		String continu = "oui";
		while(continu.equals("oui")) {
			Scanner myObj = new Scanner(System.in);
			System.out.println("Entrer un nom, une quantit� et un prix:");
			String name = myObj.nextLine();
			int quantity = myObj.nextInt();
			int price = myObj.nextInt();
			
			Product product = new Product(name, quantity, price);
			
			products.add(product);
			System.out.println("Nom: " + name);
			System.out.println("Quantit�: " + quantity);
			System.out.println("Prix: " + price);
			System.out.println("Voulez-vous continuer ?");
			continu = myObj.next();
		}
		int globalTotal = 0;
		for (Product product:products) {
			System.out.println("--------------------------");
				System.out.println("Produit: " + product.getName());
				System.out.println("Quantit�: " + product.getQuantity());
				System.out.println("Prix: " + product.getPrice() + "�");
				System.out.println("--------------------------");
				globalTotal += product.getTotal();
		}
		System.out.println("==========================");
		System.out.println("Total: " + globalTotal + "�");
	}
}
