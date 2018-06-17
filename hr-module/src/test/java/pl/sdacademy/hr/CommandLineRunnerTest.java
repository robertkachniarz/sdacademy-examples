package pl.sdacademy.hr;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class CommandLineRunnerTest {

	@DisplayName("should reject input data when 3 arguments are given and firstName is not given")
	@Test
	void test00(){
		//given
		String[] args = {"lastName=Kowalski", "dateOfBirth=15-09-1995", "anything"};
		HrManager hrManager = new HrManager();

		//then
		//przekazujemy funkcję, która bedzie wywoływana póxniej, nie teraz

		assertThatThrownBy(() -> CommandLineRunner.load(args, hrManager))

			//when
			.isInstanceOf(IllegalArgumentException.class);

	}

	@DisplayName("should check if firstName, lastName, birthOfDate is given then database isn't empty")
	@Test
	void test01(){
		//given
		HrManager hrManager = new HrManager();
		String[] args = {"firstName=Jan", "lastName=Kowalski", "dateOfBirth=15-09-1995"};

		//when
		CommandLineRunner.load(args, hrManager);

		//then
		assertThat(hrManager.findAll()).isNotEmpty();

	}
	@DisplayName("should reject input data when only lastName is not given")
	@Test
	void test02(){
		//given
		String[] args = {"firstName=Jan", "dateOfBirth=15-09-1995", "anything"};
		HrManager hrManager = new HrManager();

		//then
		//przekazujemy funkcję, która bedzie wywoływana póxniej, nie teraz

		assertThatThrownBy(() -> CommandLineRunner.load(args, hrManager))

			//when
			.isInstanceOf(IllegalArgumentException.class);

	}
	@DisplayName("should reject input data when 3 arguments are given and date of birth is not given")
	@Test
	void test03(){
		//given
		String[] args = {"firstName=Jan", "lastName=Kowalski", "anything"};
		HrManager hrManager = new HrManager();

		//then
		//przekazujemy funkcję, która bedzie wywoływana póxniej, nie teraz

		assertThatThrownBy(() -> CommandLineRunner.load(args, hrManager))

			//when
			.isInstanceOf(IllegalArgumentException.class);

	}

	@DisplayName("Should check if firstname, lastname, dateOfBirth isn't empty than database contains single " +
		"employee with the same firstname, lastName, dateOfBirth")
	@Test
		void test04()

	{
		//given
		HrManager hrManager = new HrManager();
		String[] args = {"firstName=Jan", "lastName=Kowalski", "dateOfBirth=15-09-1995"};

		//when
		CommandLineRunner.load(args, hrManager);

		//then
		Employee employee = hrManager.findAll().get(0);
		assertThat(employee.getFirstName()).isEqualTo("Jan");
		assertThat(employee.getLastName()).isEqualTo("Kowalski");
		assertThat(employee.getDateOfBirth()).isEqualTo("15-09-1995");
	}

	@DisplayName("Should return list of text representation of all Employees from database")
	@Test
	void test05()

	{
		//given
		HrManager hrManager = new HrManager();
		String[] args = {"firstName=Jan", "lastName=Kowalski", "dateOfBirth=15-09-1995"};
		CommandLineRunner.load(args, hrManager);

		//when
		List<String> allEmployees = CommandLineRunner.list(hrManager);

		//then
		Employee employee = hrManager.findAll().get(0);
		assertThat(allEmployees).containsOnly("Jan Kowalski, 15-09-1995");

	}



}
