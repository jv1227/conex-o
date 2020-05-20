/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Main.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Leticia
 */
public class DAOCliente extends AbstractTableModel{
    private List<Cliente> dados = new ArrayList<>();
    private String[] colunas = {"Nome","CPF","Contato","Endereço"};
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
                return dados.get(linha).getNome();
            case 1:
                return dados.get(linha).getCpf();
            case 2: 
                return dados.get(linha).getContato();
            case 3: 
                return dados.get(linha).getEndereco();
        }
        
        return null;
        
    }
    
    public void addRow(Cliente c){
        this.dados.add(c);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public void addRow(Object[] ler) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}


