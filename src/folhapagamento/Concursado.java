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
public class Concursado extends Funcionarios {
    


    public Concursado(int codigo, int tipo, double salario, int tempo){
    
        this.codigo = codigo;
        this.tipo = tipo;
        this.salario = salario;
        this.tempo = tempo;
        this.bonificação = 200;  
    }
        public void calculaAcrescimo(){
           
        }
        public void imprimeContrato(){
    
        System.out.println("________CONTRACHEQUE_CONCURSADOS_______");
        System.out.println("CÓDIGO DO FUNCIONÁRIO: " + this.codigo);
        System.out.println("FORMA DE INGRESSO: Concursado");
        System.out.println("TEMPO DE SERVIÇO: " + this.tempo + " anos de contratação");
        System.out.println("SALARIO BASE DO FUNCIONARIO: R$" + this.salario);
        System.out.println("VALOR TOTAL DE BONIFICAÇÃO: "+ (this.tempo * this.bonificação));
        System.out.println("SALARIO TOTAL: "+ (this.salario + this.tempo * this.bonificação));
        }
}
