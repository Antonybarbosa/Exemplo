package classesQuaisquer;


import entidades.Cliente;
import entidades.Pedido;
import entidades.Vendedor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clemerson.medeiros
 */
public class ClasseDosDados {
 
    //Essa classe não é para existir, serve apenas para demostrar a aplicação com dados dos clientes, vendedor e/ou pedido
    //La na construção da consulta, onde trabalho com esta classe, deverá ser substituido pela classe DAO que vc utiliza para pegar dados do banco
    
    public ClasseDosDados(){
        
    }
    
    public List<Cliente> getListCliente(){
        List<Cliente> lista = new ArrayList();
        for (int i = 0; i < 10; i++) {
            Cliente cliente = new Cliente(); //eu construo um novo cliente e adiciono os seguintes dados:
            cliente.setIdCliente(Short.parseShort(String.valueOf(i))); // este é o lado ruim de usar Short, tem q converter para C%$#@$#
            cliente.setNome("NomeCliente"+i); // defino o nome do cliente, coloquei o numero para identificarmos com mais facilidade
            lista.add(cliente); //adiciono o cliente na lista
        }
        return lista;
    }
    
    public List<Pedido> getListPedido(){
        List<Pedido> lista = new ArrayList();
        for (int i = 0; i < 10; i++) {
            Pedido pedido = new Pedido(); //eu construo um novo Pedido e adiciono os seguintes dados:
            List<Cliente> listaCliente = getListCliente(); // eu peguei a lista dos clientes para q assim possa instanciar um cliente ao pedido
            List<Vendedor> listaVendedor = getListVendedor();
            pedido.setIdPedido(Short.parseShort(String.valueOf(i))); 
            pedido.setCodCliente(listaCliente.get(i)); 
            pedido.setCodVendedor(listaVendedor.get(i));
            pedido.setDataPedido(new Date());
            pedido.setStatusPedido("Aberto");
            lista.add(pedido); 
        }
        return lista;
    }
    
    public List<Vendedor> getListVendedor(){
        List<Vendedor> lista = new ArrayList();
        for (int i = 0; i < 10; i++) {
            Vendedor vendedor = new Vendedor(); 
            vendedor.setIdVendedor(Short.parseShort(String.valueOf(i))); 
            vendedor.setNome("NomeVendedor"+i); 
            vendedor.setTelefone("(4"+i+")356"+(i)+"32"+(i+21)); // só para ficar bonito os telefones
            lista.add(vendedor); 
        }
        return lista;
    }
    
    
}
