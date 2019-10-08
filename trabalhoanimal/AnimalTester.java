//jonatan pereira 0050014780
package trabalhoanimal;


public class AnimalTester {

    public static void main(String[] args) {
       
        
        Mamifero m = new Mamifero();
        System.out.println("Mamifero");
        m.alimentar();
        m.emitirSom();
        m.locomover();
        
        System.out.println("-----------");
        
        Reptil r = new Reptil();
        System.out.println("Réptil");
        r.alimentar();
        r.emitirSom();
        r.locomover();
        
        System.out.println("-----------");
        
        Peixe p = new Peixe();
        System.out.println("Peixe");
        p.alimentar();
        p.emitirSom();
        p.locomover();
        p.soltarBolha();
        
        System.out.println("-----------");
        
        Ave a = new Ave();
        System.out.println("Ave");
        a.alimentar();
        a.emitirSom();
        a.locomover();
        a.fazerNinho();
       
    }
    
}
