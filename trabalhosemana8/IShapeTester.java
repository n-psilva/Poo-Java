package trabalhoshape;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author natan
 */
public class IShapeTester {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Retangulo ret = new Retangulo();

	Scanner ler = new Scanner(System.in); 
        boolean aux = true;
       
        
        do
        {
            
        try
        {
            System.out.println("Entre com a base do retangulo: ");
            float base = ler.nextFloat();
            ret.setBase(base);
            System.out.println("Entre com a altura do retangulo: ");
            float alt = ler.nextFloat();
            ret.setAltura(alt);
            ret.imprimir();
            aux = false;
        }
        catch(InputMismatchException e)
           {
               System.out.println("Digite apenas numeros!");
           }
        finally
	{
		ler.nextLine();
	}

        }while( aux == true );
       
        
    }
    
}
