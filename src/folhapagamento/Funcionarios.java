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
      
      public int associaDependente (Dependente d){
    
          if (Dependentes.size() > 5) {
              System.out.println("Você passou do limite de dependentes!!"); 
          }
          else{
              Dependentes.add(d);
             
          }
          return 0;
      
      }
      public int obtemDependentesNaIdadeLimite(int idade){
        
         int totalTransferencia = 0;
         
         for (Dependente x : this.Dependentes){  
             
         if (x.estaNaIdadeLimite(idade)){
          
         }totalTransferencia++;
         }
         return totalTransferencia;
      } 
      public double calculaSalario(){
      double totSal = this.salario + this.bonificação*this.tempo;
          return totSal;
      }
}    
