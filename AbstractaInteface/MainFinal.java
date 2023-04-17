package AbstractaInteface;

public class MainFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro[] producto=new Libro[3];
		
		producto[0]= new Libro("La Encrucijada Mundial","Filosofia",20.95,"Pedro Baños");
		producto[1]= new Libro("Don Quijote","Cultura",30.99,"Miguel Cervantes");
		producto[2]= new Libro("La Chica de Nieve","Suspense",15.95,"Javier Castillo");
		
		Electrodomestico[] producto1= new Electrodomestico[3];
		
		producto1[0]=  new Electrodomestico("Nevera","Para enfriar",121.1,"Boscho");
		producto1[1]=  new Electrodomestico("Horno","Para calentar",1000.71,"Balay");
		producto1[2]= new Electrodomestico("Tostadora","Para tostar",41.43,"Philipps");
		
		System.out.println("Informacion de los libros:");
		
		for(Libro libro: producto)
		{
			libro.mostrarInformacion();
			System.out.println();
		}
		
		System.out.println("Informacion de los electrodomesticos: ");
		
		for(Electrodomestico electrodomestico: producto1)
		{
			electrodomestico.mostrarInformacion();
			System.out.println();
		}
			
	}
}







/*
producto Libro= new Libro("La Encrucijada Mundial","Filosofia",20.95,"Pedro Baños");
producto Electrodomestico=new Electrodomestico("Nevera","Para enfriar",121.1,"Boscho");

Libro.mostrarInformacion();
System.out.println();
Electrodomestico.mostrarInformacion();
System.out.println();
*/
