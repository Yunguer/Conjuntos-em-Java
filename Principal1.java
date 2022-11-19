/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Questao1;
import java.util.*;

/**
 *
 * @author Usuário
 */
public class Principal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner sc = new Scanner(System.in);
        int x = 0,y = 0,ct = 0,op = 0;
           
        Conjunto A = null;  // Setando os conjuntos
        Conjunto B = null;
        Conjunto C = null;
        Conjunto D = null;
        Conjunto E = null;
        
        while(op != -1)
        {
            System.out.println("O que deseja fazer?");
            System.out.println("Deseja criar um conjunto? (1)\nDeseja inserir um valor ao um conjunto? (2)\nDeseja imprimir um conjunto? (3)\nSair (-1)");
            op = sc.nextInt();
            if(op == 1)
            {
                if(ct == 0)
                {
                    System.out.println("Digite o maxQnt para o Conjunto A"); // Cria conjunto A
                    x = sc.nextInt();
                    A = new Conjunto(x);
                }
                if(ct == 1)
                {
                    System.out.println("Digite o maxQnt para o Conjunto B"); // Cria conjunto B
                    x = sc.nextInt();
                    B = new Conjunto(x);
                }
                if(ct == 2)
                {
                    System.out.println("Como deseja criar o conjunto C? (1 = Normal) (2 = Uniao) (3 = Intersecao)");
                    y = sc.nextInt();
                    if(y == 1)
                    {
                        System.out.println("Digite o maxQnt para o Conjunto C"); // Cria conjunto C
                        x = sc.nextInt();
                        C = new Conjunto(x);
                    }
                    if(y == 2)
                    {
                        System.out.println("Fazendo a Uniao de A com B"); // Cria conjunto C com A U B
                        C = A.Uniao(B);
                    }
                    if(y == 3)
                    {
                        System.out.println("Fazendo a Intersecao de A com B"); // Cria conjunto C com A I B
                        C = A.Intersecao(B);
                    }        
                } 
                if(ct == 3)
                {
                    System.out.println("Como deseja criar o conjunto C? (1 = Normal) (2 = Uniao) (3 = Intersecao)");
                    y = sc.nextInt();
                    if(y == 1)
                    {
                        System.out.println("Digite o maxQnt para o Conjunto C"); // Cria conjunto D
                        x = sc.nextInt();
                        D = new Conjunto(x);
                    }
                    if(y == 2)
                    {
                        System.out.println("Qual Uniao Deseja fazer? (1 = A U B) (2 = A U C) (3 = B U C)");
                        x = sc.nextInt();
                        if(x == 1)
                        {
                            D = A.Uniao(B); // Cria conjunto D por A U B
                        }
                        if(x == 2)
                        {
                            D = A.Uniao(C); // Cria conjunto D por A U C
                        }
                        if(x == 3)
                        {
                            D = B.Uniao(C); // Cria conjunto D por B U C
                        } 
                    }
                    if(y == 3)
                    {
                        System.out.println("Qual Intersecao Deseja fazer? (1 = A U B) (2 = A U C) (3 = B U C)");
                        x = sc.nextInt();
                        if(x == 1)
                        {
                            D = A.Intersecao(B); // Cria conjunto D por A I B
                        }
                        if(x == 2)
                        {
                            D = A.Intersecao(C); // Cria conjunto D por A I C
                        }
                        if(x == 3)
                        {
                            D = B.Intersecao(C); // Cria conjunto D por B I C
                        }
                    }  
                }
                if(ct == 4)
                {
                    System.out.println("Como deseja criar o conjunto E? (1 = Normal) (2 = Uniao) (3 = Intersecao)");
                    y = sc.nextInt();
                    if(y == 1)
                    {
                        System.out.println("Digite o maxQnt para o Conjunto E"); // Cria conjunto E
                        x = sc.nextInt();
                        E = new Conjunto(x);
                    }
                    if(y == 2)
                    {
                        System.out.println("Qual Uniao Deseja fazer? (1 = A U B) (2 = A U C) (3 = A U D) (4 = B U C) (5 = B U D) (6 = C U D) ");
                        x = sc.nextInt();
                        if(x == 1)
                        {
                            E = A.Uniao(B); // Cria conjunto E por A U B
                        }
                        if(x == 2)
                        {
                            E = A.Uniao(C); // Cria conjunto E por A U C
                        }
                        if(x == 3)
                        {
                            E = A.Uniao(D); // Cria conjunto E por A U D
                        }
                        if(x == 4)
                        {
                            E = B.Uniao(C); // Cria conjunto E por B U C
                        }
                        if(x == 5)
                        {
                            E = B.Uniao(D); // Cria conjunto E por B U D
                        }
                        if(x == 6)
                        {
                            E = C.Uniao(D); // Cria conjunto E por C U D
                        }
                    }
                    if(y == 3)
                    {
                        System.out.println("Qual Intersecao Deseja fazer? (1 = A U B) (2 = A U C) (3 = A U D) (4 = B U C) (5 = B U D) (6 = C U D) ");
                        x = sc.nextInt();
                        if(x == 1)
                        {
                            E = A.Intersecao(B); // Cria conjunto E por A I B
                        }
                        if(x == 2)
                        {
                            E = A.Intersecao(C); // Cria conjunto E por A I C
                        }
                        if(x == 3)
                        {
                            E = A.Intersecao(D); // Cria conjunto E por A I D
                        }
                        if(x == 4)
                        {
                            E = B.Intersecao(C); // Cria conjunto E por B I C
                        }
                        if(x == 5)
                        {
                            E = B.Intersecao(D); // Cria conjunto E por B I D
                        }
                        if(x == 6)
                        {
                            E = C.Intersecao(D); // Cria conjunto E por C I D
                        }
                    }    
                }
                if(ct == 5)
                {
                    System.out.println("Limite de Conjuntos Atingidos");
                }
                ct++;
            }
            if(op == 2)
            {
                System.out.println("Em qual conjunto deseja inserir? (1 = A) (2 = B) (3 = C) (4 = D) (5 = E)"); // Insere elemento nos conjuntos
                y = sc.nextInt();
                if(y == 1)
                {   
                    System.out.println("Qual numero desja inserir?");
                    x = sc.nextInt();
                    A.Inserir(x);
                }
                if(y == 2)
                {   
                    System.out.println("Qual numero desja inserir?");
                    x = sc.nextInt();
                    B.Inserir(x);
                }
                if(y == 3)
                {   
                    System.out.println("Qual numero desja inserir?");
                    x = sc.nextInt();
                    C.Inserir(x);
                }
                if(y == 4)
                {   
                    System.out.println("Qual numero desja inserir?");
                    x = sc.nextInt();
                    D.Inserir(x);
                }
                if(y == 5)
                {   
                    System.out.println("Qual numero desja inserir?");
                    x = sc.nextInt();
                    E.Inserir(x);
                }
            }
            if(op == 3)
            { 
                System.out.println("Qual conjunto deseja imprimir? (1 = A) (2 = B) (3 = C) (4 = D) (5 = E)"); // Imprimir os conjuntos com get.Unicos
                y = sc.nextInt();
                if(y == 1)
                {   
                    ArrayList print =  A.getUnicos();
        
                    for(int i = 0; i < print.size(); i++)
                    {   
                        System.out.println(print.get(i));
                    }
                }
                if(y == 2)
                {   
                    ArrayList print =  B.getUnicos();
        
                    for(int i = 0; i < print.size(); i++)
                    {   
                        System.out.println(print.get(i));
                    }
                }
                if(y == 3)
                {   
                    ArrayList print =  C.getUnicos();
        
                    for(int i = 0; i < print.size(); i++)
                    {   
                        System.out.println(print.get(i));
                    }
                }
                if(y == 4)
                {   
                    ArrayList print =  D.getUnicos();
        
                    for(int i = 0; i < print.size(); i++)
                    {   
                        System.out.println(print.get(i));
                    }
                }
                if(y == 5)
                {   
                    ArrayList print =  E.getUnicos();
        
                    for(int i = 0; i < print.size(); i++)
                    {   
                        System.out.println(print.get(i));
                    }
                }
            }
        }  
    }
}
