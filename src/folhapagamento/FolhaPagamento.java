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
    
    public static ArrayList<Funcionarios> Funcionario;

    
    public static void main(String[] args) {

       System.out.println("Digite a quantidade de funcionarios");
       Scanner teclado = new Scanner(System.in);
       int qtdeFuncionarios = teclado.nextInt(); teclado.nextLine();

       Funcionario = new ArrayList<Funcionarios>();
 
       
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
            
            ArrayList<Dependente> Dependentes = new ArrayList<Dependente>();
            
            int i = 0;
           
            while (i < qdDependentes) {

               System.out.println("Informe a idade dos dependentes: ");
               int idade = teclado.nextInt();teclado.nextLine();
               
               Dependente d = new Dependente(idade);
            
               Dependentes.add(d);
              
              i++;
            }
                    if (tipo == 1){
                    System.out.println("Digite o salario base do funcionário: ");
                    double salario = teclado.nextDouble();

                    System.out.println("Digite o numero de anos de serviço: ");
                    int tempo = teclado.nextInt(); teclado.nextLine();

                    Concursado concur = new Concursado(codigo, tipo, salario, tempo);
                    for(Dependente d : Dependentes){ 
                     concur.associaDependente(d);
                    }
                    Funcionario.add(concur);
                    }
                    else{
                    System.out.println("Digite o salario base do funcionário: ");
                    double salario = teclado.nextDouble();

                    System.out.println("Digite o numero de meses de serviço: ");
                    int tempo = teclado.nextInt(); teclado.nextLine();  

                    Temporario temp = new Temporario(codigo, tipo, salario, tempo);
                    for(Dependente d :Dependentes){
                    temp.associaDependente(d);
                            }
                    Funcionario.add(temp);
                            }
                    c++;
                    } 

                    for(Funcionarios Funcionarios: Funcionario){
                        Funcionarios.imprimeContrato();
                    }
                  
       }
    }

       
             




    
 
