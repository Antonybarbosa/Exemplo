/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableModels;

import entidades.Pedido;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author clemerson.medeiros
 */
public class TableModelPedido extends AbstractTableModel {

    private List<Pedido> dadosPedido;
    private final String[] colunas = {"Código", "Pedido", "Cliente", "data", "status"}; // colunas

    public TableModelPedido(List<Pedido> lista) {
        dadosPedido = lista;
    }

    public void addRow(Pedido p) {
        this.dadosPedido.add(p);
        this.fireTableDataChanged();
    }

    public Pedido getPedido(int row) {
        return dadosPedido.get(row);
    }

    public void update(Pedido pedido, int row) {
        dadosPedido.set(row, pedido);
        this.fireTableDataChanged();
    }

    public void setList(List<Pedido> pedidos) {
        this.dadosPedido = pedidos;
        this.fireTableDataChanged();
    }

    public void remove(int row) {
        dadosPedido.remove(row);
        this.fireTableDataChanged();
    }

    @Override
    public String getColumnName(int num) {
        return this.colunas[num];
    }

    @Override
    public int getRowCount() {
        return dadosPedido.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return dadosPedido.get(linha).getIdPedido();
            case 1:
                return dadosPedido.get(linha).getCodVendedor().getNome();// eu quero que informe o nome do vendedor na tabela
            case 2:
                return dadosPedido.get(linha).getCodCliente().getNome(); // eu quero que informe o nome do cliente na tabela
            case 3:
                return dadosPedido.get(linha).getDataPedido();
            case 4:
                return dadosPedido.get(linha).getStatusPedido();
        }
        return null;
    }
}
