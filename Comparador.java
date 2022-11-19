
package Questao3;

import java.util.Comparator;

public class Comparador implements Comparator<Resposta>{
    
    @Override
    public int compare(Resposta r_, Resposta r__)//Fazer esse override para fazer um compareTo normal
    {
        return r_.compareTo(r__); //Comparar Duas Respostas com o CompareTo
    }
    
}
