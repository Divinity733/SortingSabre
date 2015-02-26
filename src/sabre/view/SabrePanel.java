package sabre.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import sabre.controller.SabresController;
import sabre.view.TableCellWrapRenderer;

public class SabrePanel extends JPanel
{
	private SabresController baseControl;
	private JTable sortTable;
	private JLabel randomLabel;
	private SpringLayout baseLayout;
	private JScrollPane tablePane;
	private TableCellWrapRenderer myCell;
	private JButton sortButt;
	private JButton searchButt;
	private JTextArea displayArea;
	private JTextField inputField;
	
	public SabrePanel(SabresController baseController)
	{
		this.baseControl = baseController;
		baseLayout = new SpringLayout();
		randomLabel = new JLabel("Look!  2D!");
		myCell = new TableCellWrapRenderer();
		
		setupPane();
		setupPanel();
		setupLayout();
		heyListen();
	}
	
	private void setupPane()
	{
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(randomLabel);
		this.add(tablePane);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.EAST, randomLabel, -401, SpringLayout.EAST, this);
	}
	
	private void heyListen()
	{
		
	}
}