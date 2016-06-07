package Principal;

//"blibliotecas" para printf y scanf

import java.io.BufferedReader;  
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public static void  main(String[] args) throws IOException 
	{
		
		Fabricante f1 = new Fabricante();
		Fabricante f2 = new Fabricante();
		
		System.out.println("Ingrese el nombre del fabricante");
		String s9 = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		f1.nombre = s9;
		System.out.println("Ingrese el telefono del fabricante");
		String s10 = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		f1.telefono = s10;
		System.out.println("Ingrese la dirección del fabricante");
		String s11 = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		f1.direccion = s11;
		
		
		System.out.println("Ingrese el nombre del fabricante");
		String s9bi = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		f2.nombre = s9bi;
		System.out.println("Ingrese el telefono del fabricante");
		String s10bi = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		f2.telefono = s10bi;
		System.out.println("Ingrese la dirección del fabricante");
		String s11bi = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		f2.direccion = s11bi;
		
		
		AireAcondicionado aire1 = new AireAcondicionado();
		
		System.out.println("Ingrese el modelo del aire acondicionado");
		String s3 = (new BufferedReader(new InputStreamReader(System.in))).readLine(); // como el scanf
		aire1.modelo =  s3; //Integer.valueof (s) para convertir de string  (s) a entero
       
        System.out.println("Ingrese el precio del aire acondicionado");
		String s2 = (new BufferedReader(new InputStreamReader(System.in))).readLine(); // como el scanf
		aire1.precio = Double.valueOf(s2); //Integer.valueof (s) para convertir de string  (s) a entero
        
		System.out.println("Ingrese el stock del aire acondicionado");
		String s = (new BufferedReader(new InputStreamReader(System.in))).readLine(); // como el scanf
		aire1.stock =  Integer.valueOf( s ); //Integer.valueof (s) para convertir de string  (s) a entero
		
        aire1.fabricante = f1;
        
        System.out.println("Ingrese las frigorias del aire acondicionado");
		String s13 = (new BufferedReader(new InputStreamReader(System.in))).readLine(); // como el scanf
        aire1.frigorias = Integer.valueOf(s13);
        
       
        System.out.println( "El fabricante del aires es: " + aire1.fabricante );
        System.out.println( "El modelo del aire acondicionado es: " + aire1.modelo );
        System.out.println( "El precio del aire acondicionado es de: " + aire1.precio );
        System.out.println( "El stock de aires es de: " + aire1.stock );
        System.out.println("Frigorias del aire: " + aire1.frigorias);
        
        
        
        AireAcondicionado aire2 = new AireAcondicionado();
		
		
		System.out.println("Ingrese el modelo del aire acondicionado");
		String s4 = (new BufferedReader(new InputStreamReader(System.in))).readLine(); // como el scanf
		aire2.modelo =  s4; //Integer.valueof (s) para convertir de string  (s) a entero
       
        System.out.println("Ingrese el precio del aire acondicionado");
		String s5 = (new BufferedReader(new InputStreamReader(System.in))).readLine(); // como el scanf
		aire2.precio = Double.valueOf(s5); //Integer.valueof (s) para convertir de string  (s) a entero
        
		System.out.println("Ingrese el stock del aire acondicionado");
		String s6 = (new BufferedReader(new InputStreamReader(System.in))).readLine(); // como el scanf
		aire2.stock =  Integer.valueOf( s6 ); //Integer.valueof (s) para convertir de string  (s) a entero
		
		aire2.fabricante = f2;
		
		System.out.println("Ingrese las frigorias del aire acondicionado");
		String s13bi = (new BufferedReader(new InputStreamReader(System.in))).readLine(); // como el scanf
        aire1.frigorias = Integer.valueOf(s13bi);
		
       
        System.out.println( "El fabricante del aires es: " + aire1.fabricante );
        System.out.println( "El modelo del aire acondicionado es: " + aire2.modelo );
        System.out.println( "El precio del aire acondicionado es de: " + aire2.precio );
        System.out.println( "El stock de aires es de: " + aire2.stock );
        System.out.println("Frigorias del aire: " + aire1.frigorias);
        
        
        
        Televisor tv1 = new Televisor();
		
		
		System.out.println("Ingrese el modelo del televisor");
		String s3bi = (new BufferedReader(new InputStreamReader(System.in))).readLine(); // como el scanf
		tv1.modelo =  s3bi; //Integer.valueof (s) para convertir de string  (s) a entero
       
        System.out.println("Ingrese el precio del televisor");
		String s2bi = (new BufferedReader(new InputStreamReader(System.in))).readLine(); // como el scanf
		tv1.precio = Double.valueOf(s2bi); //Integer.valueof (s) para convertir de string  (s) a entero
        
		System.out.println("Ingrese el stock del televisor");
		String sbi = (new BufferedReader(new InputStreamReader(System.in))).readLine(); // como el scanf
		tv1.stock =  Integer.valueOf( sbi ); //Integer.valueof (s) para convertir de string  (s) a entero
		
		tv1.fabricante = f1;
		
		System.out.println("Posee HDMI?");
		String s14 = (new BufferedReader(new InputStreamReader(System.in))).readLine(); // como el scanf
		tv1.poseeHDMI =  Boolean.valueOf( s14 ); //Integer.valueof (s) para convertir de string  (s) a entero
		
		System.out.println("Ingrese las pulgadas del televisor");
		String s15 = (new BufferedReader(new InputStreamReader(System.in))).readLine(); // como el scanf
		tv1.pulgadas =  Integer.valueOf( s15 ); //Integer.valueof (s) para convertir de string  (s) a entero
        
		
		System.out.println("El fabricante del televisor es: " + tv1.fabricante);
        System.out.println( "El modelo del televisor  es: " + tv1.modelo );
        System.out.println( "El precio del televisor  es de: " + tv1.precio );
        System.out.println( "El stock de televisores es de: " + tv1.stock );
        System.out.println("Posee HDMI: " + tv1.poseeHDMI);
        System.out.println("Pulgadas del televisor:" + tv1.pulgadas);
        
        
        Televisor tv2 = new Televisor();
		
		
		System.out.println("Ingrese el modelo del televisor");
		String s4bi = (new BufferedReader(new InputStreamReader(System.in))).readLine(); // como el scanf
		tv2.modelo =  s4bi; //Integer.valueof (s) para convertir de string  (s) a entero
        
        System.out.println("Ingrese el precio del televisor");
		String s5bi = (new BufferedReader(new InputStreamReader(System.in))).readLine(); // como el scanf
		tv2.precio = Double.valueOf(s5bi); //Integer.valueof (s) para convertir de string  (s) a entero
       
		System.out.println("Ingrese el stock del televisor");
		String s6bi = (new BufferedReader(new InputStreamReader(System.in))).readLine(); // como el scanf
		tv2.stock =  Integer.valueOf( s6bi ); //Integer.valueof (s) para convertir de string  (s) a entero
		
		tv2.fabricante = f2;
       
		System.out.println("Posee HDMI?");
		String s14bi = (new BufferedReader(new InputStreamReader(System.in))).readLine(); // como el scanf
		tv1.poseeHDMI =  Boolean.valueOf( s14bi ); //Integer.valueof (s) para convertir de string  (s) a entero
		
		System.out.println("Ingrese las pulgadas del televisor");
		String s15bi = (new BufferedReader(new InputStreamReader(System.in))).readLine(); // como el scanf
		tv1.pulgadas =  Integer.valueOf( s15bi ); //Integer.valueof (s) para convertir de string  (s) a entero
		
		 
		System.out.println("El fabricante del televisor es: " + tv2.fabricante);
		System.out.println( "El modelo del televisor es: " + tv2.modelo );
        System.out.println( "El precio del televisor  es de: " + tv2.precio );
        System.out.println( "El stock de televisores es de: " + tv2.stock );
        System.out.println("Posee HDMI: " + tv2.poseeHDMI);
        System.out.println("Pulgadas del televisor:" + tv2.pulgadas);
        
        
        
        
        
	}
	
}
