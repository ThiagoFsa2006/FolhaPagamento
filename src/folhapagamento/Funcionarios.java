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
      public double acrescimoDependente;
   
      
      public ArrayList<Dependente> Dependentes = new ArrayList<Dependente>();
      
      public boolean associaDependente (Dependente d){
          
          if (Dependentes.size() > 5){
              System.out.println("Limite de 5 dependentes!!!");
              return false;
              } 
          else {
              Dependentes.add(d);
              return true;
               }
      
      }
      public void contarDependentes(Dependente e){
   
      }
}
