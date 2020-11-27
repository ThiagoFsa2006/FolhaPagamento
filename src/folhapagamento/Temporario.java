/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folhapagamento;

/**
 *
 * @author thiag
 */
public class Temporario extends Funcionarios {

       
     public Temporario(int codigo, int tipo, double salario, int tempo){
    
        this.codigo = codigo;
        this.tipo = tipo;
        this.salario = salario;
        this.tempo = tempo;
        this.bonificação = 15;
        this.acrescimo = 50;
        
     }
        public double calculaAcrescimo(){
        
        return this.obtemDependentesNaIdadeLimite(18)* this.acrescimo;
    }
        public double calculaValorMensal(){
        
        return this.calculaAcrescimo() + this.salario + (this.bonificação* this.tempo);
    }
        
        public void imprimeContrato(){
    
        System.out.println("________CONTRACHEQUE_TEMPORARIOS_______");
        super.imprimeContrato();
        System.out.println("FORMA DE INGRESSO: Temporário");
        System.out.println("TEMPO DE SERVIÇO: " + this.tempo + " meses de contratação");
        super.imprimeContratoA();
        System.out.printf("ACRESCIMOS DEPENDENTES: R$ %.2f \n", this.calculaAcrescimo());
        System.out.printf("SALARIO TOTAL: R$ %.2f \n", this.calculaValorMensal());
        System.out.println("---------------------------------------");
    
    }

}
