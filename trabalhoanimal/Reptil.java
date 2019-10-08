//jonatan pereira 0050014780
package trabalhoanimal;

import java.lang.reflect.Method;

public class Reptil extends Animal {
    
    private String corPele;

    @Override
    public Method locomover() {
        System.out.println("Rastejando!");
        return null; 
    }

    @Override
    public Method alimentar() {
        System.out.println("Comendo insetos!");
        return null; 
    }

    @Override
    public Method emitirSom() {
        System.out.println("Som de réptil");
        return null; 
    }


    public String getCorPele() {
        return corPele;
    }


    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }
    
    
}
