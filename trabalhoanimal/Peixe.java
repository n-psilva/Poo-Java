//jonatan pereira 0050014780
package trabalhoanimal;

import java.lang.reflect.Method;


public class Peixe extends Animal {

    private String corEscama;
    
    
    @Override
    public Method locomover() {
        System.out.println("Nadando");
        return null; 
    }

    @Override
    public Method alimentar() {
        System.out.println("Comendo substâncias");
        return null; 
    }

    @Override
    public Method emitirSom() {
        System.out.println("Peixe não faz som");
        return null; 
    }
    
    public Method soltarBolha(){
        System.out.println("Bluup!");
        return null;
    }

  
    public String getCorEscama() {
        return corEscama;
    }

   
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
