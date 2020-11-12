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
      public double acrescimo;
   
      
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
        return 0;
        }
        public void imprimeContrato(){
        System.out.println("CÓDIGO DO FUNCIONÁRIO: " + this.codigo);
        }
         public void imprimeContratoA(){
        System.out.println("SALARIO BASE DO FUNCIONARIO: R$" + this.salario);
        System.out.println("VALOR TOTAL DE BONIFICAÇÃO: "+ (this.tempo * this.bonificação));
        }
      
}    
