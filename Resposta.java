package Questao3;

public class Resposta implements Comparable<Resposta>{
    private int nfam;
    private double renda;
    private String estado;

    @Override
    public int compareTo(Resposta r)
    {
        int aux;
        
        aux = estado.compareTo(r.estado); //Comparar os estados
        if(aux != 0) 
        {
            return aux; //Se não for igual vai ordenar pelo maior, se não vai para o desempate
        }

        aux = Integer.compare(nfam,r.nfam); //Usar o compare para usar o compareTo normal
        if(aux != 0)
        {
            return aux * -1; // Se não for igual ordena pelo maior, se não vai para o desempate
                             // * -1 Inverte a ordem na Lista de NFam
        }
           
        return Double.compare(renda, r.renda); //Usar o compare para usar o compareTo normal e retorna ordenado
    }
     
    public Resposta(int nfam_, double renda_, String estado_) // Construtor
    {
        nfam=nfam_;
        renda=renda_;
        estado= estado_;
    }
    
    public String getEstado() //Pega o estado
    {
        return estado;
    } 
    
    public int getNFam() //Pega número da familia
    {
        return nfam;
    }
    
    public double getRenda() // Pega a renda 
    {
        return renda;
    }
   
}

    
    
    
    
    
   
