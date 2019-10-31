package apresentacao;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.JPanel;
import javax.swing.JLabel;
import dados.Contribuinte;

public class TelaPrincipal extends JFrame {
	JTabbedPane pane;
	JPanel painel1, painel2;
	JTable tabela1;
	PessoaTableModel pessoaTableModel;
	
	public TelaPrincipal() {
		pane = new JTabbedPane();
		
		painel1 = new JPanel();
		painel2 = new JPanel();
		
		painel1.add(new JLabel("Aba 1"));
		painel2.add(new JLabel("Aba 2"));
		
		
		pessoaTableModel = new PessoaTableModel(criaListaPessoa());
		
		tabela1 = new JTable();
		tabela1.setModel(pessoaTableModel);
		
		
		TableColumn colunaEstado = tabela1.getColumnModel().getColumn(4);

		JComboBox comboBox = new JComboBox();
		comboBox.addItem("SC");
		comboBox.addItem("RS");
		comboBox.addItem("PR");
		comboBox.addItem("SP");
		comboBox.addItem("RJ");
		comboBox.addItem("MG");
		colunaEstado.setCellEditor(new DefaultCellEditor(comboBox));
		tabela1.setFillsViewportHeight(true);
		
		pane.addTab("Aba 1",null,tabela1,"Informação Aba 1");

		
		pane.addTab("Aba 2",null,painel1,"Informação Aba 1");
		pane.addTab("Aba 3", null, painel2, "Informação Aba 2");
		
		Container c = getContentPane();
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.add(pane, BorderLayout.CENTER);
	}
	
	private List<Contribuinte> criaListaPessoa() {
		List pessoas = new ArrayList<Contribuinte>();
		
		for (int i = 0; i < 10; i++) {
			Contribuinte p = new Contribuinte();
			p.setCpf(i);
			p.setNome("Pessoa "+i);
			p.setEndereco("Endereço "+i);
			p.setIdade(i);
			p.setContaBancaria(3424);
			pessoas.add(p);
		}
		return pessoas;
	}
	
}
