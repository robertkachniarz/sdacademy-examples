package pl.sdacademy.hr;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class SwingView {
	private static final HrManagerSwingAdapter adapter = new HrManagerSwingAdapter(new HrManager());
	private static DefaultTableModel tableModel = new DefaultTableModel();

	public static void main(String[] args) {

		tableModel.addColumn("First Name");
		tableModel.addColumn("Last Name");
		tableModel.addColumn("Date of birth");
		adapter.sortByLastName(tableModel);


		SwingUtilities.invokeLater(new Runnable() {


			@Override
			public void run() {
				// prepare the jframe
				JFrame jFrame = new JFrame();
				LayoutManager layout = new GridLayout(6, 1);
				jFrame.setLayout(layout);
				jFrame.setTitle("HrManager");
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


				// menuBar
				JMenuBar menuBar = new JMenuBar();


				//Build the first menu.
				JMenu menu = new JMenu("File");
				menu.setMnemonic(KeyEvent.VK_A);
				menu.getAccessibleContext().setAccessibleDescription(
					"Menu File");
				menuBar.add(menu);

				//a group of JMenuItems
				JMenuItem menuItem = new JMenuItem("Load employees",
					KeyEvent.VK_T);
				menuItem.setAccelerator(KeyStroke.getKeyStroke(
					KeyEvent.VK_1, ActionEvent.ALT_MASK));
				menuItem.getAccessibleContext().setAccessibleDescription(
					"Load all employees from file");
				menuItem.addActionListener(e -> {
					adapter.loadAllEmployeesFromFile(tableModel);
				});
				menu.add(menuItem);

				jFrame.add(menuBar);

				// content
				addFirstRow(jFrame);
				addSecondRow(jFrame);
				addThirdRow(jFrame);
				addFourthRow(jFrame);
				addFifthRow(jFrame);


				// pack and show
				jFrame.setPreferredSize(new Dimension(640, 480));
				jFrame.pack();
				jFrame.setVisible(true);
				//jFrame.setBounds(400, 200, 640, 480);
			}


		});
	}

	private static void addFirstRow(JFrame jFrame) {
		//populate row

		// populate row
		JPanel row = new JPanel();
		JButton addButton = new JButton("Add");
		JTextField firstNameTextField = new JTextField("firstName");
		JTextField lastNameTextField = new JTextField("lastName");
		JTextField dateOfBirthTextField = new JTextField("dateOfBirth");
		addButton.addActionListener(e -> {
			adapter.addNewEmployee(tableModel, firstNameTextField.getText(), lastNameTextField.getText(),
				dateOfBirthTextField.getText());
		});

		row.add(addButton);

		row.add(new JLabel("First Name"));
		row.add(firstNameTextField);
		row.add(new JLabel("Last Name"));
		row.add(lastNameTextField);
		row.add(new JLabel("Date of birth"));
		row.add(dateOfBirthTextField);

		//add row  to JFrame
		jFrame.add(row);

	}
	private static void addSecondRow(JFrame jFrame) {

		JTable table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);
		jFrame.add(scrollPane);

	}

	private static void addThirdRow(JFrame jFrame) {
		JPanel row = new JPanel();

		LayoutManager layout = new GridLayout(3, 1);
		row.setLayout(layout);

		row.add(new JLabel("Filters"));
		JButton okButton = new JButton("OK");
		JPanel lastNameFilter = new JPanel();
		lastNameFilter.add(new JLabel("Last Name"));
		JTextField lastNameField = new JTextField("lastname");
		lastNameFilter.add(lastNameField);
		lastNameFilter.add(okButton);

		okButton.addActionListener(e -> {
			adapter.searchByLastNameFilter(tableModel, lastNameField.getText());
		});

		lastNameFilter.setAlignmentX(0);
		row.add(lastNameFilter);

		JPanel phraseFilter = new JPanel();
		JButton phraseOkButton = new JButton("OK");
		JTextField phrase = new JTextField("Phrase");
		phraseFilter.add(new JLabel("Phrase"));
		phraseFilter.add(phrase);
		phraseFilter.add(phraseOkButton);
		phraseOkButton.addActionListener(e -> {adapter.searchByPhraseFilter(tableModel, phrase.getText());});
		row.add(phraseFilter);

		jFrame.add(row);

	}
	private static void addFourthRow(JFrame jFrame) {

		JPanel row = new JPanel();
		JButton clearButton = new JButton("Clear Filters");
		row.add(clearButton);
		clearButton.addActionListener(e -> {
			adapter.clearFilters(tableModel);
		});



		jFrame.add(row);

	}

	private static void addFifthRow(JFrame jFrame) {

		JPanel row = new JPanel();
		JButton sortByFirstNameButton = new JButton("Sort by first name");
		JButton sortByLastNameButton = new JButton("Sort by last name");
		row.add(sortByFirstNameButton);
		row.add(sortByLastNameButton);
		sortByFirstNameButton.addActionListener(e -> {
			adapter.sortByFirstName(tableModel);
		});
		sortByLastNameButton.addActionListener(e -> {
			adapter.sortByLastName(tableModel);
		});

		jFrame.add(row);

	}
}

