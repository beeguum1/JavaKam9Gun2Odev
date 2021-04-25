package odev2;


public class Screen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Referans oluþturma: Eðitmen ve programlama kurslarý için referans oluþturdum.
		 Educator educator1 = new Educator (1, "Engin Demiroð");
		 
		 Programming programming1 = new Programming (1, "JAVA+REACT", educator1,0);
		 Programming programming2 = new Programming (2, "C#+ANGULAR", educator1, 36);
		 Programming programming3 = new Programming (3, "TEMEL KURS", educator1, 0);
		 
		 //Programlama kursunun adý, eðitmenin ismi ve %kaç ilerleme kaydedildiðini
		 //ekrana yazdýrdým.
		 Programming [] programmings = {programming1,programming2,programming3};
		 for (Programming programming : programmings) {
			 System.out.println(programming.name+"\n"+programming.educator.name+ "    %"+ programming.progress+" TAMAMLANDI"+"\n");
			
		}
		
		//Eðitmenin ismini ekrana yazdýrdým.
		Educator[] educators = {educator1};
		for (Educator educator : educators) {
			System.out.println("Eðitmen: " + educator.name); 
			}
		
			
			
		ProgrammingManager programmingManager = new ProgrammingManager();
		programmingManager.addToCourse(programming1);
		programmingManager.addToCourse(programming2);
		programmingManager.addToCourse(programming3);
				
			
					
			
	}
		
		
		
		
		
		
		

	}


