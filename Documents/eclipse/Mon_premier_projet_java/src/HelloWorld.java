import java.util.ArrayList;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		String chaine = "Joris Poupoune";
		int num2 = 8;
		System.out.println(chaine + " " + num2 * 3 + "ans");
		if(num2 < 7) {
			System.out.println("Guillaume");
		}else {
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
//			System.out.println("Recalé");
//		}else if(note < 10) {
//			System.out.println("Rattrapage");
//		}else if(note < 12) {
//			System.out.println("Passable");
//		}else if(note < 14) {
//			System.out.println("Assez bien");
//		}else if(note < 16) {
//			System.out.println("Bien");
//		}else {
//			System.out.println("Très bien");
//		}
//		int[] note = new int[5];
//		note[0] = 12;
//		note[1] = 16;
//		note[2] = 9;
//		note[3] = 2;
//		note[4] = 15;
//		for (int i = 0; i < note.length; i++) {
//			if(note[i] < 8) {
//				System.out.println("Recalé");
//			}else if(note[i] < 10) {
//				System.out.println("Rattrapage");
//			}else if(note[i] < 12) {
//				System.out.println("Passable");
//			}else if(note[i] < 14) {
//				System.out.println("Assez bien");
//			}else if(note[i] < 16) {
//				System.out.println("Bien");
//			}else {
//				System.out.println("Très bien");
//			}
//			
//		}
//		for (int unenote:note) {
//			if(unenote < 8) {
//				System.out.println("Recalé");
//			}else if(unenote < 10) {
//				System.out.println("Rattrapage");
//			}else if(unenote < 12) {
//				System.out.println("Passable");
//			}else if(unenote < 14) {
//				System.out.println("Assez bien");
//			}else if(unenote < 16) {
//				System.out.println("Bien");
//			}else {
//				System.out.println("Très bien");
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
		
		  ArrayList<Apprenant> list1 = new ArrayList<Apprenant>(); 
			Apprenant A1 = new Apprenant("fefe","freffr", 1, "ferfer");
			Apprenant A2 = new Apprenant("gtht","vfrr", 3, "hyjyj");
			Apprenant A3 = new Apprenant("hhthh","hyyjt", 2, "jjtujty");
			Apprenant A4 = new Apprenant("efergergr","ghtyjtj", 3, "kuilo");
			
			list1.add(A1);
			list1.add(A2);
			list1.add(A3);
			list1.add(A4);
			
			for (Apprenant list:list1) {
				if(list.getNiveau() == 3) {
					System.out.println(list.toString());
				}
			}
	}
}
