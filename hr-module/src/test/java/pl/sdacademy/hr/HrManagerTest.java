package pl.sdacademy.hr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class HrManagerTest {

	HrManager hrManager;

	@BeforeEach
	void setup (){
		hrManager = new HrManager();
	}

	@DisplayName("should create non-null new employee when is given first name, last name and date of " +
		"birth")
	@Test
	void test0 (){
		//given

		//when
		String firstName = "Jan";
		String lastName = "Kowalski";
		String dateOfBirth = "01-10-1980";
		Employee employee = hrManager.create(firstName, lastName, dateOfBirth);

		//then
		assertThat(employee).isNotNull();
	}

	@DisplayName("should create a new employee with ALL fields: first name, last name and date of " +
		"birth")
	@Test
	void test1 (){
		//given
		String firstName = "Jan";
		String lastName = "Kowalski";
		String dateOfBirth = "01-10-1980";

		//when

		Employee employee = hrManager.create(firstName, lastName, dateOfBirth);

		//then
		assertThat(employee.getFirstName()).isEqualTo(firstName);
		assertThat(employee.getLastName()).isEqualTo(lastName);
		assertThat(employee.getDateOfBirth()).isEqualTo(dateOfBirth);
	}

	@DisplayName("Should check if new Employee is add to the database")
	@Test
	void test2 (){
		//given
		String firstName = "Jan";
		String lastName = "Kowalski";
		String dateOfBirth = "01-10-1980";
		Employee newEmployee = hrManager.create(firstName, lastName, dateOfBirth);

		//when
		List<Employee> allEmployees = hrManager.findAll();

		//then
		assertThat(allEmployees).containsOnly(newEmployee);

	}

	@DisplayName("Should check if two new Employees are added to the database")
	@Test
	void test3 (){
		//given
		Employee jan = hrManager.create("Jan", "Kowalski", "01-10-1980");
		Employee marian = hrManager.create("Marian", "Nowak", "21-05-1970");

		//when
		List<Employee> allEmployees = hrManager.findAll();

		//then
		assertThat(allEmployees).containsOnly(jan, marian);

	}

	@DisplayName("Should find single employee with given last name")
	@Test
	void test4(){
		//given
		Employee jan = hrManager.create("Jan", "Kowalski", "01-10-1980");
		Employee marian = hrManager.create("Marian", "Nowak", "21-05-1970");
		//Employee zenon = hrManager.create("Zenon", "Kowalski", "01-10-1970");

		//when
		List<Employee> foundEmployees = hrManager.searchByLastName("Kowalski");

		//then
		assertThat(foundEmployees).containsOnly(jan);
	}

	@DisplayName("Should find employees with given last name")
	@Test
	void test5(){
		//given
		Employee jan = hrManager.create("Jan", "Kowalski", "01-10-1980");
		Employee marian = hrManager.create("Marian", "Nowak", "21-05-1970");
		Employee zenon = hrManager.create("Zenon", "Kowalski", "01-10-1970");

		//when
		List<Employee> foundEmployees = hrManager.searchByLastName("Kowalski");

		//then
		assertThat(foundEmployees).containsOnly(jan, zenon);

	}

	@DisplayName("Should find no employee when there is no employee with given last name")
	@Test
	void test6(){
		//given
		Employee jan = hrManager.create("Jan", "Kowalski", "01-10-1980");
		Employee marian = hrManager.create("Marian", "Nowak", "21-05-1970");
		Employee zenon = hrManager.create("Zenon", "Kowalski", "01-10-1970");

		//when
		List<Employee> foundEmployees = hrManager.searchByLastName("Iksiński");

		//then
		assertThat(foundEmployees).isEmpty();

	}

	@DisplayName("Should find two employees when their first name matches given search phrase")
	@Test
	void test7(){
		//given
		Employee jan = hrManager.create("Jan", "Kowalski", "01-10-1980");
		Employee marianNowak = hrManager.create("Marian", "Nowak", "21-05-1970");
		Employee zenon = hrManager.create("Zenon", "Kowalski", "01-10-1970");
		Employee marianKowalski = hrManager.create("Marian", "Kowalski", "21-10-1975");

		//when
		List<Employee> foundEmployees = hrManager.searchByPhrase("Marian");

		//then
		assertThat(foundEmployees).containsOnly(marianKowalski, marianNowak);

	}

	@DisplayName("Should find two employees when their last name matches given search phrase")
	@Test
	void test8(){
		//given
		Employee jan = hrManager.create("Jan", "Kowalski", "01-10-1980");
		Employee marianNowak = hrManager.create("Marian", "Nowak", "21-05-1970");
		Employee zenon = hrManager.create("Zenon", "Kowalski", "01-10-1970");
		Employee marianKowalski = hrManager.create("Marian", "Iksiński", "21-10-1975");

		//when
		List<Employee> foundEmployees = hrManager.searchByPhrase("Kowalski");

		//then
		assertThat(foundEmployees).containsOnly(jan, zenon);

	}

	@DisplayName("Should find two employees when their dateOfBirth matches given search phrase")
	@Test
	void test9(){
		//given
		Employee jan = hrManager.create("Jan", "Kowalski", "01-10-1980");
		Employee marianNowak = hrManager.create("Marian", "Nowak", "21-05-1970");
		Employee zenon = hrManager.create("Zenon", "Kowalski", "01-10-1970");
		Employee marianKowalski = hrManager.create("Marian", "Iksiński", "21-10-1975");

		//when
		List<Employee> foundEmployees = hrManager.searchByPhrase("1970");

		//then
		assertThat(foundEmployees).containsOnly(marianNowak, zenon);

	}

}