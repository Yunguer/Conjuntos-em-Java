/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;
import java.util.ArrayList;

/**
 *
 * @author Usuário
 */
public class Conjunto {
    private int maxQnt;
    private ArrayList<Integer> conjunto;
    
    public Conjunto(int maxQnt_) // Construtor
    {
        maxQnt = maxQnt_;
        conjunto = new ArrayList();
    }
    
    public ArrayList Inserir(int x) // Inserir na lista
    {
       int ct = 0;
       for(int i = 0; i < conjunto.size(); i++)
       {
           if(x == conjunto.get(i))
           {
               ct++; // Percorre a lista contando qnts números existem
           }
       }
       if(ct < maxQnt) // Se for menor q a maxQnt de repetição Insere
       {
           conjunto.add(x);
           return conjunto;
       }
       return conjunto;
    }
    
  
    public Conjunto Uniao(Conjunto p) // União
    {
        int y = 0;
        if(maxQnt <= p.maxQnt) // Pega o maior maxQnt
        {
            y = p.maxQnt;
        }
        if(maxQnt >= p.maxQnt) // Pega o maior maxQnt
        {
            y = maxQnt;
        }
        
        Conjunto a = new Conjunto(y);
        
        for(int i = 0; i < conjunto.size(); i++)
        {
            a.conjunto = a.Inserir(conjunto.get(i)); // Percorre a lista e vai inserindo os elementos se maxQnt for <
        }
        for(int i = 0; i < p.conjunto.size(); i++)
        {
            a.conjunto = a.Inserir(p.conjunto.get(i)); // Percorre a lista e vai inserindo os elementos se maxQnt for <
        }
        
        return a;
    }
    
    public Conjunto Intersecao(Conjunto p) // Intersecao
    {
        int y = 0;

        if(maxQnt <= p.maxQnt) // Pega o menor maxQnt
        {
            y = maxQnt; 
        }
        if(maxQnt >= p.maxQnt) // Pega o menor maxQnt
        {
            y = p.maxQnt;
        }
        
        Conjunto a = new Conjunto(y);
        
        for(int i = 0; i < conjunto.size(); i++)
        {
            for(int j = 0; j < p.conjunto.size(); j++)
            {
                if(conjunto.get(i) == p.conjunto.get(j))
                {
                    a.conjunto = a.Inserir(conjunto.get(i)); // Percorre as listas e insere se os elementos forem iguais e maxQnt for <
                }
            }
        }
        
        for(int i = 0; i < p.conjunto.size(); i++)
        {
            for(int j = 0; j < conjunto.size(); j++)
            {
                if(conjunto.get(i) == p.conjunto.get(j))
                {
                    a.conjunto = a.Inserir(p.conjunto.get(i)); // Percorre as listas e insere se os elementos forem iguais e maxQnt for <
                }
            }
        }
        
        return a;
    }
    
    public ArrayList getUnicos()
    {
        Conjunto u = new Conjunto(1);
        for(int i = 0; i < conjunto.size(); i++)
        {
            u.Inserir(conjunto.get(i));  // Percorre a lista e insere com a maxQnt = 1
        }
        return u.conjunto;
    }

}





