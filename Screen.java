package odev2;


public class Screen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Referans olu�turma: E�itmen ve programlama kurslar� i�in referans olu�turdum.
		 Educator educator1 = new Educator (1, "Engin Demiro�");
		 
		 Programming programming1 = new Programming (1, "JAVA+REACT", educator1,0);
		 Programming programming2 = new Programming (2, "C#+ANGULAR", educator1, 36);
		 Programming programming3 = new Programming (3, "TEMEL KURS", educator1, 0);
		 
		 //Programlama kursunun ad�, e�itmenin ismi ve %ka� ilerleme kaydedildi�ini
		 //ekrana yazd�rd�m.
		 Programming [] programmings = {programming1,programming2,programming3};
		 for (Programming programming : programmings) {
			 System.out.println(programming.name+"\n"+programming.educator.name+ "    %"+ programming.progress+" TAMAMLANDI"+"\n");
			
		}
		
		//E�itmenin ismini ekrana yazd�rd�m.
		Educator[] educators = {educator1};
		for (Educator educator : educators) {
			System.out.println("E�itmen: " + educator.name); 
			}
		
			
			
		ProgrammingManager programmingManager = new ProgrammingManager();
		programmingManager.addToCourse(programming1);
		programmingManager.addToCourse(programming2);
		programmingManager.addToCourse(programming3);
				
			
					
			
	}
		
		
		
		
		
		
		

	}


