package sabre.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import sabre.controller.SabresController;
import sabre.view.TableCellWrapRenderer;

public class SabrePanel extends JPanel
{
	private SabresController baseControl;
	// private JTable tableData;
	private SpringLayout baseLayout;
	private JScrollPane textPane;
	private JButton sortButt;
	private JButton arraySortButt;
	private JButton doubleSortButt;
	private JButton quickSortButt;
	private JButton clearText;
	private JTextArea displayArea;
	private JTextField inputField;
	
	// private JScrollPane tablePane;
	// private TableCellWrapRenderer myCellRender;
	
	public SabrePanel(SabresController baseController)
	{
		this.baseControl = baseController;
		
		sortButt = new JButton("Sort");
		arraySortButt = new JButton("Array Sort");
		doubleSortButt = new JButton("Double Sort");
		quickSortButt = new JButton("Quick Sort");
		clearText = new JButton("Clear");
		inputField = new JTextField(20);
		baseLayout = new SpringLayout();
		displayArea = new JTextArea(15, 35);
		textPane = new JScrollPane(displayArea);
		// myCellRender = new TableCellWrapRenderer();
		
		// setupTable();
		setupPane();
		setupPanel();
		setupLayout();
		heyListen();
	}
	
	// private void setupTable()
	// {
	// String[] colHeader = { "Column 1", "Column 2" };
	//
	// tableData = new JTable(new DefaultTableModel(baseControl.getMySabre(), colHeader));
	//
	// for (int col = 0; col < tableData.getColumnCount(); col++)
	// {
	// tableData.getColumnModel().getColumn(col).setCellRenderer(myCellRender);
	// }
	//
	// tablePane = new JScrollPane(tableData);
	// }
	
	private void setupPane()
	{
		displayArea.setLineWrap(true);
		displayArea.setWrapStyleWord(true);
		displayArea.setEditable(false);
		displayArea.setBackground(Color.BLACK);
		displayArea.setForeground(Color.WHITE);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.YELLOW);
		this.add(textPane);
		this.setSize(700, 400);
		this.add(sortButt);
		this.add(arraySortButt);
		this.add(doubleSortButt);
		this.add(quickSortButt);
		this.add(clearText);
		this.add(inputField);
		inputField.setBackground(Color.RED);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 150, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, textPane, -100, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 270, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, sortButt, 41, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, sortButt, -500, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sortButt, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, quickSortButt, -61, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, quickSortButt, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, doubleSortButt, -61, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, doubleSortButt, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, sortButt, -61, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 98, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 0, SpringLayout.WEST, sortButt);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, 168, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, clearText, 1, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, quickSortButt, 195, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, quickSortButt, -323, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, doubleSortButt, 375, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, doubleSortButt, -200, SpringLayout.EAST, this);
	}
	
	private void heyListen()
	{
		sortButt.addActionListener(new ActionListener()
		{
			public void actionPerformed(
					ActionEvent click)
			{
				String rawArray = "";
				for (int number : baseControl.getWholeNumbers())
				{
					rawArray += number + " ";
				}
				baseControl.getMySabre().selectionSort(baseControl.getWholeNumbers());
				rawArray += baseControl.getMySabre().sortingTime(baseControl.getMySabre().getSortTime());
				for (int number : baseControl.getWholeNumbers())
				{
					rawArray += number + " ";
				}
				displayArea.setText(rawArray);
			}
		});
		
		arraySortButt.addActionListener(new ActionListener()
		{
			public void actionPerformed(
					ActionEvent click)
			{
				String rawArray = "";
				for (int number : baseControl.getArrayList())
				{
					rawArray += number + " ";
				}
				baseControl.getMySabre().arrayListSort(baseControl.getArrayList());
				rawArray += baseControl.getMySabre().sortingTime(baseControl.getMySabre().getSortTime());
				for (int number : baseControl.getArrayList())
				{
					rawArray += number + " ";
				}
				displayArea.setText(rawArray);
			}
		});
		
		doubleSortButt.addActionListener(new ActionListener()
		{
			public void actionPerformed(
					ActionEvent click)
			{
				String rawArray = "";
				for (double number : baseControl.getRealNumbers())
				{
					rawArray += number + " ";
				}
				baseControl.getMySabre().doubleSelectionSort(baseControl.getRealNumbers());
				rawArray += baseControl.getMySabre().sortingTime(baseControl.getMySabre().getSortTime());
				for (double number : baseControl.getRealNumbers())
				{
					rawArray += number + " ";
				}
				displayArea.setText(rawArray);
			}
		});
		
		quickSortButt.addActionListener(new ActionListener()
		{
			public void actionPerformed(
					ActionEvent click)
			{
				String rawArray = "";
				for (int number : baseControl.getWholeNumbersQuick())
				{
					rawArray += number + " ";
				}
				baseControl.getMySabre().sort(baseControl.getWholeNumbersQuick());
				rawArray += baseControl.getMySabre().sortingTime(baseControl.getMySabre().getSortTime());
				for (int number : baseControl.getWholeNumbersQuick())
				{
					rawArray += number + " ";
				}
				displayArea.setText(rawArray);
			}
		});
		
		clearText.addActionListener(new ActionListener()
		{
			public void actionPerformed(
					ActionEvent click)
			{
				displayArea.setText(null);
			}
		});
	}
}