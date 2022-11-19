
package Questao3;

import java.io.*;
import java.util.*;
import static java.util.stream.Collectors.toList;

public class Principal3 {

    public static void main(String[] args) throws IOException{       
        
        ArrayList<Resposta> valores = new ArrayList<Resposta>();
        
        File f = new File("C:\\Users\\Usuário\\Documents\\NetBeansProjects\\Questao3\\src\\questao3\\respostas.txt"); // Mudar o diretorio do arquivo 
        FileReader lerf = new FileReader(f);
        BufferedReader lerb = new BufferedReader(lerf);
        
        while(lerb.ready())
        {
            int ct = 0;
            String ler = lerb.readLine(); // Ler tudo botar na string
            String vetaux[] = ler.split(" ",4); // Separar por espaço
            for(String vet: vetaux)
            {
                ct++;
            }
            int Nfam = vetaux[0].charAt(0)-48; // -48 para concertar o int por causa tabela ASCII e Pegar NFam
            double Renda = Double.parseDouble(vetaux[1]); // Pegar renda
            String aux = vetaux.toString();
            String Estado = vetaux[2]; // Pegar estado
            
            if(ct>3 && ct<5)
            {
                Estado = vetaux[2]+" "+vetaux[3]; // Pegar estado com nome compostos
            }
            
            Resposta r = new Resposta(Nfam,Renda,Estado); // Usa o construtor 
            valores.add(r); // Botar os valores do construtor no Array
        }
        
        Comparador c = new Comparador();
        
        List<Resposta> ord = valores.stream().sorted(c).collect(toList()); // Ordena os valores e transforma para lista
        
        for (Resposta rord : ord) //Percorre a classe
        {
            System.out.println("Estado = "+rord.getEstado()+" / Qnt de Pessoas = "+rord.getNFam()+" / Renda = R$"+rord.getRenda()); //Imprime os valores
        }
       
        lerf.close(); // Fecha o buffer
        lerb.close(); // Fecha o leitor
    }   
}
