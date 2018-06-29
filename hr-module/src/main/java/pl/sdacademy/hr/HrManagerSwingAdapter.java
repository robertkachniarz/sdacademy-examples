package pl.sdacademy.hr;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class HrManagerSwingAdapter {
	private HrManager hrManager;

	public HrManagerSwingAdapter(HrManager hrManager) {
		this.hrManager = hrManager;
	}

	public void addNewEmployee(DefaultTableModel tableModel, String firstName, String lastName, String dateOfBirth) {
		Employee newEmployee = hrManager.create(firstName, lastName, dateOfBirth);
		tableModel.addRow(new Object[]{newEmployee.getFirstName(), newEmployee.getLastName(), newEmployee.getDateOfBirth()});
	}
	public void searchByLastNameFilter(DefaultTableModel tableModel, String lastName){
		List<Employee> searchedEmployees = hrManager.searchByLastName(lastName);
		tableModel.getDataVector().clear();
		for (Employee employee : searchedEmployees) {
			tableModel.addRow(new Object[]{employee.getFirstName(), employee.getLastName(), employee
				.getDateOfBirth()});
		}
	}

	public void searchByPhraseFilter(DefaultTableModel tableModel, String phrase){
		List<Employee> searchedEmployees = hrManager.searchByPhrase(phrase);
		tableModel.getDataVector().clear();
		for (Employee employee : searchedEmployees) {
			tableModel.addRow(new Object[]{employee.getFirstName(), employee.getLastName(), employee
				.getDateOfBirth()});
		}
	}

	public void clearFilters(DefaultTableModel tableModel){
		tableModel.getDataVector().clear();
		List<Employee> allEmployees = hrManager.findAll();
		for (Employee employee : allEmployees){
			tableModel.addRow(new Object[]{employee.getFirstName(), employee.getLastName(), employee
				.getDateOfBirth()});
		}
	}


	public void sortByFirstName(DefaultTableModel tableModel) {
		tableModel.getDataVector().clear();
		List<Employee> allEmployees = hrManager.sortByFirstName();
		for (Employee employee : allEmployees){
			tableModel.addRow(new Object[]{employee.getFirstName(), employee.getLastName(), employee
				.getDateOfBirth()});
		}
	}

	public void sortByLastName(DefaultTableModel tableModel) {
		tableModel.getDataVector().clear();
		List<Employee> allEmployees = hrManager.sortByLastName();
		for (Employee employee : allEmployees){
			tableModel.addRow(new Object[]{employee.getFirstName(), employee.getLastName(), employee
				.getDateOfBirth()});
		}
	}
}

