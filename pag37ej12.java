package programacion;

public class pag37ej12 {
	//primer paso llamar al método main
	public static void main(String[]args) {
		
	//segundo paso definir variables
	int dinero=232, billete200, billete20, billete10, resto;
	
	//tercer paso definir operaciones claves
	billete200=dinero/200; //se realiza la operación resto
	resto=dinero%200;
	System.out.println(resto); //te saca el resto
	
	billete20=resto/20;
	resto=resto%20;
	System.out.println(resto);
	
	billete10=resto/10;
	resto=resto%10;
	//ponemos el system
	System.out.println("Dinero inicial= "+ billete200 +" Billetes de 200");
	
	System.out.println("Comprobación "+(billete200+200+billete20+20));
	}

}