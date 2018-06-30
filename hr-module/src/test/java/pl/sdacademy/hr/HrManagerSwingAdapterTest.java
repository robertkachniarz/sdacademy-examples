package pl.sdacademy.hr;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.table.DefaultTableModel;
import java.util.Arrays;
import java.util.List;

public class HrManagerSwingAdapterTest {

	@DisplayName("Should add to tableModel new row matching employee created by hrManager given Jan Kowalski " +
		"11-10-1990 ")
	@Test
	void test01(){
		//given
		DefaultTableModel tableModel = new DefaultTableModel();
		tableModel.addColumn("First Name");
		tableModel.addColumn("Last Name");
		tableModel.addColumn("Date of birth");
		HrManagerSwingAdapter adapter = new HrManagerSwingAdapter(fakeHrManager());

		//when

		adapter.addNewEmployee(tableModel, "Jan", "Kowalski", "11-10-1990");

		//then
		Object firstNameFromTableModel = tableModel.getValueAt(0, 0);
		Assertions.assertThat(firstNameFromTableModel).isEqualTo("Zoltan");
		Object lastNameFromTableModel = tableModel.getValueAt(0, 1);
		Assertions.assertThat(lastNameFromTableModel).isEqualTo("Bloodhammer");
		Object dateOfBirthFromTableModel = tableModel.getValueAt(0, 2);
		Assertions.assertThat(dateOfBirthFromTableModel).isEqualTo("11-10-1990");
	}

	private HrManager fakeHrManager(){
		return new HrManager(){
			@Override
			Employee create(String firstName, String lastName, String dateOfBirth){
				if(firstName.equals("Jan") && lastName.equals("Kowalski") && dateOfBirth.equals
					("11-10-1990"))
					return new Employee("Zoltan", "Bloodhammer", "11-10-1990");
				throw new IllegalArgumentException("Bad arguments");
			}
		};
	}

	@DisplayName("should add two rows to empty table model matching sorted HrManager data ")
	@Test
	void test02(){
		//given
		// create empty table model
		DefaultTableModel tableModel = new DefaultTableModel();
		tableModel.addColumn("First Name");
		tableModel.addColumn("Last Name");
		tableModel.addColumn("Date of Birth");
		HrManagerSwingAdapter adapter = new HrManagerSwingAdapter(fakeSortHrManager());
		//when
		adapter.sortByFirstName(tableModel);
		//then
		//row 0
		Object firstNameFromTableModel = tableModel.getValueAt(0, 0);
		Assertions.assertThat(firstNameFromTableModel).isEqualTo("Tomek");
		Object lastNameFromTableModel = tableModel.getValueAt(0, 1);
		Assertions.assertThat(lastNameFromTableModel).isEqualTo("Tomczuk");
		Object dateOfBirth = tableModel.getValueAt(0, 2);
		Assertions.assertThat(dateOfBirth).isEqualTo("09-09-1999");
		// row1
		Object firstNameFromTableMode2 = tableModel.getValueAt(1, 0);
		Assertions.assertThat(firstNameFromTableMode2).isEqualTo("Igor");
		Object lastNameFromTableMode2 = tableModel.getValueAt(1, 1);
		Assertions.assertThat(lastNameFromTableMode2).isEqualTo("Nowak");
		Object dateOfBirth2 = tableModel.getValueAt(1, 2);
		Assertions.assertThat(dateOfBirth2).isEqualTo("08-08-1899");
	}

	private HrManager fakeSortHrManager() {
		return new HrManager(){
			@Override
			public List<Employee> sortByFirstName() {
				return Arrays.asList(new Employee("Tomek", "Tomczuk", "09-09-1999"),
					new Employee("Igor", "Nowak", "08-08-1899"));

			}
		};
	}

	@DisplayName("Should replace all existing rows ")
	@Test
	void test03 (){
		//given
		//create empty table model
		DefaultTableModel tableModel = new DefaultTableModel();
		tableModel.addColumn("First Name");
		tableModel.addColumn("Last Name");
		tableModel.addColumn("Date of Birth");
		tableModel.addRow(new Object[]{"George", "Martin", "11-10-2010"});
		HrManagerSwingAdapter adapter = new HrManagerSwingAdapter(fakeSortHrManager2());
		//when
		adapter.sortByLastName(tableModel);
		//then
		//row 0
		Object firstNameFromTableModel = tableModel.getValueAt(0, 0);
		Assertions.assertThat(firstNameFromTableModel).isEqualTo("Tomek");
		Object lastNameFromTableModel = tableModel.getValueAt(0, 1);
		Assertions.assertThat(lastNameFromTableModel).isEqualTo("Tomczuk");
		Object dateOfBirth = tableModel.getValueAt(0, 2);
		Assertions.assertThat(dateOfBirth).isEqualTo("09-09-1999");
		// row1
		Object firstNameFromTableMode2 = tableModel.getValueAt(1, 0);
		Assertions.assertThat(firstNameFromTableMode2).isEqualTo("Igor");
		Object lastNameFromTableMode2 = tableModel.getValueAt(1, 1);
		Assertions.assertThat(lastNameFromTableMode2).isEqualTo("Nowak");
		Object dateOfBirth2 = tableModel.getValueAt(1, 2);
		Assertions.assertThat(dateOfBirth2).isEqualTo("08-08-1899");

	}

	private HrManager fakeSortHrManager2() {
		return new HrManager(){
			@Override
			public List<Employee> sortByLastName() {
				return Arrays.asList(new Employee("Tomek", "Tomczuk", "09-09-1999"),
					new Employee("Igor", "Nowak", "08-08-1899"));

			}
		};
	}
}
