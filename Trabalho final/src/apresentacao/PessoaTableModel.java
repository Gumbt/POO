package apresentacao;

import java.util.List;


import javax.swing.table.AbstractTableModel;
import dados.Contribuinte;

public class PessoaTableModel extends AbstractTableModel {

	List<Contribuinte> pessoas;
	private String[] colunas = {"CPF", "Nome", "Endereço",
			"Cidade","Estado"};
	
	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		return pessoas.size();
	}
	
	public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
	
	public boolean isCellEditable(int linha, int coluna) {
	    if (coluna < 1) {
	    	return false;
	    } 
	    else {
	    	return true;
	    }
	}
	
	public void setValueAt(Object valor, int linha, int coluna) {
		
		switch (coluna) {
		case 0:
			pessoas.get(linha).setCpf((int)valor);
			break;
		case 1:
			pessoas.get(linha).setNome((String)valor);
			break;
		case 2:
			pessoas.get(linha).setEndereco((String)valor);
			break;
		case 3:
			pessoas.get(linha).setIdade((int)valor);
			break;
		case 4:
			pessoas.get(linha).setContaBancaria((int)valor);
			break;
		}
	    fireTableCellUpdated(linha, coluna);
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
        switch(coluna){
	        case 0: return pessoas.get(linha).getCpf();
	        case 1: return pessoas.get(linha).getNome();
	        case 2: return pessoas.get(linha).getEndereco();
	        case 3: return pessoas.get(linha).getIdade();
	        case 4: return pessoas.get(linha).getContaBancaria();
        }   
        return null;
	}

    public String getColumnName(int num){
        return this.colunas[num];
    }
 
	public PessoaTableModel(List<Contribuinte> p) {
		pessoas = p;
		
		
	}
}
