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

public class Dependente {

    public Dependente(int idade) {
        this.idade = idade;
    } 
    
    public int idade;

        public boolean estaNaIdadeLimite(int idade){

        if(this.idade < idade){
            return true;
        }
            return false;
    }

}
