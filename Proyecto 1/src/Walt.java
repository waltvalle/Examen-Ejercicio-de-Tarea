import java.util.Scanner;
public class Walt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int porce = 0;
		
		System.out.println("Quiz de Cultura General");
		
		System.out.println("Capital de Japon: ");
		String capital= s.next();
		{ 
			if (capital.toLowerCase().equals("tokio"))
			{
				System.out.println("Correcto");
			    porce = porce + 20;
			}
			else
				System.out.println("Incorrecto");
		}
		
			System.out.println("Capital de Francia: ");
			capital= s.next();
		{ 
			if (capital.toLowerCase().equals("paris"))
			{
				System.out.println("Correcto");
				porce = porce + 20;
			}
			else
				System.out.println("Incorrecto");
			
			
			System.out.println("Capital de Brasil: ");
			capital= s.next();
		{ 
			if (capital.toLowerCase().equals("brasilia"))
			{
				System.out.println("Correcto");
				porce = porce + 20;	
			}
			else
				System.out.println("Incorrecto");
			
			
			System.out.println("Capital de Alemania: ");
			capital= s.next();
		{ 
			if (capital.toLowerCase().equals("berlin"))
			{
				System.out.println("Correcto");
				porce = porce + 20;	
			}
			else
				System.out.println("Incorrecto");
			
			
			System.out.println("Capital de Rumania: ");
			capital= s.next();
		{ 
			if (capital.toLowerCase().equals("bucarest"))
			{
				System.out.println("Correcto");
				porce = porce + 20;	
			}
			else
				System.out.println("Incorrecto");
		
		}
		System.out.print("Porcentaje de respuestas correctas: " + porce + "%");
		}
		}
		}
	}
}