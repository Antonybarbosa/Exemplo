/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableModels;

import entidades.Vendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author clemerson.medeiros
 */
public class TableModelVendedor extends AbstractTableModel {

    private List<Vendedor> dadosVendedor;
    private final String[] colunas = {"Código", "Nome", "Telefone"}; // colunas

    public TableModelVendedor(List<Vendedor> lista) {
        dadosVendedor = lista;
    }

    public void addRow(Vendedor v) {
        this.dadosVendedor.add(v);
        this.fireTableDataChanged();
    }

    public Vendedor getVendedor(int row) {
        return dadosVendedor.get(row);
    }

    public void update(Vendedor vendedor, int row) {
        dadosVendedor.set(row, vendedor);
        this.fireTableDataChanged();
    }

    public void setList(List<Vendedor> vendedores) {
        this.dadosVendedor = vendedores;
        this.fireTableDataChanged();
    }

    public void remove(int row) {
        dadosVendedor.remove(row);
        this.fireTableDataChanged();
    }

    @Override
    public String getColumnName(int num) {
        return this.colunas[num];
    }

    @Override
    public int getRowCount() {
        return dadosVendedor.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return dadosVendedor.get(linha).getIdVendedor();
            case 1:
                return dadosVendedor.get(linha).getNome();
            case 2:
                return dadosVendedor.get(linha).getTelefone();
        }
        return null;
    }
}
