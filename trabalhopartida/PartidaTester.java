
package trabalhopartida;

import java.util.Scanner;


public class PartidaTester {

    public static void main(String[] args) {
       
            Partida p1 = new Partida();

	    Time l = new Time();      
	    Time v = new Time();

      	    Scanner leitura = new Scanner(System.in);
            int aux = 0;
            
		

	        System.out.println("Time Local: ");
		String t1 = leitura.next();
		l.setNome(t1);
		System.out.println("\nTime Visitante: ");
		String t2 = leitura.next();
		v.setNome(t2);   
                
            
            do{
		p1.iniciarPartida(l, v);
		p1.mostraResultado();
		p1.finalizarPartida();
                
                System.out.println("Deseja realizar outra partida?");
                String resp = leitura.next();
                if(resp.equalsIgnoreCase("sim")){
	         aux = 1;
                 }
               
            }while(aux == 1);

		v.listar();

		l.listar(); 

		

	 }
  
 }
