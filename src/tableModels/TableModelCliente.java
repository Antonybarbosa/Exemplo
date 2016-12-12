/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableModels;

import entidades.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author clemerson.medeiros
 */
public class TableModelCliente extends AbstractTableModel {

    private List<Cliente> dadosCliente;
    private final String[] colunas = {"Código", "Nome"}; // colunas

    public TableModelCliente(List<Cliente> lista) {
        dadosCliente = lista;
    }

    public void addRow(Cliente p) {
        this.dadosCliente.add(p);
        this.fireTableDataChanged();
    }

    public Cliente getCliente(int row) {
        return dadosCliente.get(row);
    }

    public void update(Cliente cliente, int row) {
        dadosCliente.set(row, cliente);
        this.fireTableDataChanged();
    }
    
    public void setList(List<Cliente> dadosCliente){
        this.dadosCliente = dadosCliente;
        this.fireTableDataChanged();
    }

    public void remove(int row) {
        dadosCliente.remove(row);
        this.fireTableDataChanged();
    }

    @Override
    public String getColumnName(int num) {
        return this.colunas[num];
    }

    @Override
    public int getRowCount() {
        return dadosCliente.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return dadosCliente.get(linha).getIdCliente();
            case 1:
                return dadosCliente.get(linha).getNome();
        }
        return null;
    }
}
