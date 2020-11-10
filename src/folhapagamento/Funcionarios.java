/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folhapagamento;

import java.util.ArrayList;

/**
 *
 * @author thiag
 */
public class Funcionarios {
    
      public int codigo;
      public int tipo;
      public double salario;
      public int tempo;
      public double bonificação;
   
      
      public ArrayList<Dependente> Dependentes = new ArrayList<Dependente>();
      
      public int associaDependente (int dependente){
      if (Dependentes.size() > 5){
         
          Dependente d = new Dependente(dependente);
          d.Dependentes.add(d);
       } else {
          System.out.println("O limite de dependentes é 5");
      }
        return 0;  
    }
      public int obtemDependentesNaIdadeLimite(int idade){
        
         int totalTransferencia = 0;
         
         for (Dependente x : Dependentes){  
         if (x.estaNaIdadeLimite()){
          
         }totalTransferencia++;
         }
         return totalTransferencia;
      }              
}    
