//jonatan pereira 0050014780

package trabalhoanimal;

import java.lang.reflect.Method;


public abstract class Animal {
    
    private float peso;
    private int idade;
    private int membros;
    
    public abstract Method locomover();
    public abstract Method alimentar();
    public abstract Method emitirSom();

    
    public float getPeso() {
        return peso;
    }

    
    public void setPeso(float peso) {
        this.peso = peso;
    }

 
    public int getIdade() {
        return idade;
    }

 
    public void setIdade(int idade) {
        this.idade = idade;
    }

  
    public int getMembros() {
        return membros;
    }

   
    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
    
}
