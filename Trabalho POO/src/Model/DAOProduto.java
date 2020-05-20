/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import Main.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Leticia
 */
public class DAOProduto extends AbstractTableModel{
    private List<Produto> dados = new ArrayList<>();
    private String[] colunas = {"Descrição","Quantidade","Preço","Código"};
@Override
    public String getColumnName(int column) {
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case 0:
                return dados.get(linha).getDescricao();
            case 1:
                return dados.get(linha).getQuantidade();
            case 2: 
                return dados.get(linha).getPreco();
            case 3: 
                return dados.get(linha).getCodigo();
        }
        
        return null;
        
    }
    
    public void addRow(Produto p){
        this.dados.add(p);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    
}


