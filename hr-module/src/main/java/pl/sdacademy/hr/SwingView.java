package pl.sdacademy.hr;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class SwingView {
	private static final HrManagerSwingAdapter adapter = new HrManagerSwingAdapter(new HrManager());
	private static DefaultTableModel tableModel = new DefaultTableModel();

	public static void main(String[] args) {

		tableModel.addColumn("First Name");
		tableModel.addColumn("Last Name");
		tableModel.addColumn("Date of birth");


		SwingUtilities.invokeLater(new Runnable() {


			@Override
			public void run() {
				// prepare the jframe
				final JFrame jFrame = new JFrame();
				LayoutManager layout = new GridLayout(3, 1);
				jFrame.setLayout(layout);
				jFrame.setTitle("HrManager");
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				// content
				addFirstRow(jFrame);
				addSecondRow(jFrame);
				addThirdRow(jFrame);


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
		JPanel lastNameFilter = new JPanel();
		lastNameFilter.add(new JLabel("Last Name"));
		lastNameFilter.add(new JTextField("lastName"));
		lastNameFilter.add(new JButton("OK"));
		lastNameFilter.setAlignmentX(0);
		row.add(lastNameFilter);

		JPanel phraseFilter = new JPanel();
		phraseFilter.add(new JLabel("Phrase"));
		phraseFilter.add(new JTextField("phrase"));
		phraseFilter.add(new JButton("OK"));
		row.add(phraseFilter);

		jFrame.add(row);

	}
}

