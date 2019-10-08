//jonatan pereira 0050014780
package trabalhoanimal;

import java.lang.reflect.Method;

public class Mamifero extends Animal {
    
    private String corPelo;

    @Override
    public Method locomover() {
        System.out.println("Correndo!");
       return null;
    }

    @Override
    public Method alimentar() {
        System.out.println("Mamando!");
        return null; 
    }

    @Override
    public Method emitirSom() {
        System.out.println("Emitindo som!");
        return null; 
    }

    public String getCorPelo() {
        return corPelo;
    }

    
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
    
}
