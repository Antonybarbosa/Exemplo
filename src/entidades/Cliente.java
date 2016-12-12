/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author clemerson.medeiros
 */
public class Cliente {

    private Short idCliente;
    private String nome;
    
    public Cliente(){
        
    }

    public Short getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setIdCliente(Short idCliente) {
        this.idCliente = idCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
