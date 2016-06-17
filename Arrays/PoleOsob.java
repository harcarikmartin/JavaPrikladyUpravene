
public class PoleOsob {

	public static void main(String[] args) {
		//Definujte si triedu Osoba s menom a vekom, vytvorte pole osob 
		// (aspon 4), vytvorte metodu na najdenenie najmladsej/najstarsej osoby.
		Osoba[] osoba = new Osoba[5];
		
		osoba[0] = new Osoba("Jan", "Adam", 20);
		osoba[1] = new Osoba("Michal", "Peter", 23);
		osoba[2] = new Osoba("Pavol", "Maly", 50);
		osoba[3] = new Osoba("Maria", "Vargova", 19);
		osoba[4] = new Osoba("Lukas", "Juhas", 40);
		vypisNajmladsiu(osoba);
		vypisNajstarsiu(osoba);
	}

	private static void vypisNajstarsiu(Osoba[] osoba) {
		int max = osoba[0].getAge(), index = 0;
		for (int i = 1; i < osoba.length; i++) {
			if(osoba[i].getAge() > max) {
				max = osoba[i].getAge();
				index = i;
			}
		}
		System.out.println("Najstarsia osoba je " + osoba[index].getName() + " " 
		 + osoba[index].getSurname() + " vo veku " + osoba[index].getAge() + " rokov");
	}

	private static void vypisNajmladsiu(Osoba[] osoba) {
		int min = osoba[0].getAge(), index = 0;
		for (int i = 1; i < osoba.length; i++) {
			if(osoba[i].getAge() < min) {
				min = osoba[i].getAge();
				index = i;
			}
		}
		System.out.println("Najmladsia osoba je " + osoba[index].getName() + " " 
				 + osoba[index].getSurname() + " vo veku " + osoba[index].getAge() + " rokov");	
	}
}
