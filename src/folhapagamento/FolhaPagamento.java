/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folhapagamento;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thiag
 */
public class FolhaPagamento {
    
    public static ArrayList<Concursado> Concursado;
    public static ArrayList<Temporario> Temporario;
    
    public static void main(String[] args) {

       System.out.println("Digite a quantidade de funcionarios");
       Scanner teclado = new Scanner(System.in);
       int qtdeFuncionarios = teclado.nextInt(); teclado.nextLine();

       Concursado = new ArrayList<Concursado>();
       Temporario = new ArrayList<Temporario>();
       
       int c = 0;
       
       while(c < qtdeFuncionarios){
            System.out.println("Digite o codigo do funcionario: ");
            int codigo = teclado.nextInt(); teclado.nextLine();
       
            System.out.println("Digite o tipo de contratação: ");
            System.out.println("1 - Funcionário Concursado");
            System.out.println("2 - Funcionário Temporário");
            int tipo = teclado.nextInt(); teclado.nextLine();
            
            System.out.println("Quantos dependentes sao? ");
            int qdDependentes = teclado.nextInt();teclado.nextLine();
            
            int i = 0;
           
            while (i < qdDependentes) {

               System.out.println("Informe a idade do individuo: ");
               int idade = teclado.nextInt();teclado.nextLine();
               
               Dependente d = new Dependente(idade);
               d.associaDependente(idade);
               d.Dependentes.add(d);
               
              i++;
            }
                    if (tipo == 1){
                    System.out.println("Digite o salario base do funcionário: ");
                    double salario = teclado.nextDouble();

                    System.out.println("Digite o numero de anos de serviço: ");
                    int tempo = teclado.nextInt(); teclado.nextLine();

                    Concursado concur = new Concursado(codigo, tipo, salario, tempo);

                    Concursado.add(concur);
                    } 
                    else{
                    System.out.println("Digite o salario base do funcionário: ");
                    double salario = teclado.nextDouble();

                    System.out.println("Digite o numero de meses de serviço: ");
                    int tempo = teclado.nextInt(); teclado.nextLine();  

                    Temporario temp = new Temporario(codigo, tipo, salario, tempo);

                   
                    Temporario.add(temp);
                    }      
                    c++;
                    } 

                    for(Concursado Funcionarios: Concursado){
                        Funcionarios.imprimeContrato();
                    }

                    for(Temporario Funcionarios: Temporario){
                        Funcionarios.imprimeContrato();
                        
    }
             
}
}


    
 
