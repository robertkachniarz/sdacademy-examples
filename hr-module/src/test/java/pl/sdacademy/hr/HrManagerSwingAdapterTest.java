package pl.sdacademy.hr;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.table.DefaultTableModel;

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

}
