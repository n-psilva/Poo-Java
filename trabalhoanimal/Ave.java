//jonatan pereira 0050014780
package trabalhoanimal;

import java.lang.reflect.Method;

public class Ave extends Animal{
    
    
    private String corPena;

    @Override
    public Method locomover() {
        System.out.println("Voando");
        return null; 
    }

    @Override
    public Method alimentar() {
        System.out.println("Comendo frutas");
        return null; 
    }

    @Override
    public Method emitirSom() {
        System.out.println("Som de ave");
        return null; 
    }
    
    public Method fazerNinho(){
        System.out.println("Construir ninho!");
        return null;
    }

   
    public String getCorPena() {
        return corPena;
    }

    
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
