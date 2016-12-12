/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author clemerson.medeiros
 */
public class Pedido {

    private Short idPedido;
    private Vendedor codVendedor; // eu relacionar o vendedor ao pedido, se preferir pode armazenar apenas o ID do vendedor
    private Cliente codCliente; // o mesmo para cliente
    private Date dataPedido;
    private String statusPedido;
    
    public Pedido(){
        
    }

    public Short getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Short idPedido) {
        this.idPedido = idPedido;
    }

    public Vendedor getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(Vendedor codVendedor) {
        this.codVendedor = codVendedor;
    }

    public Cliente getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Cliente codCliente) {
        this.codCliente = codCliente;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }

}
