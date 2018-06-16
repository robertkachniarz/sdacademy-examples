import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import pl.sdacademy.tdd.Anagram;

import java.util.Set;

import static org.assertj.core.api.Assertions.*;

public class AnagramTest {
	@Disabled
	@Test
	void siep(){
		//given
		String str = "pies";
		//when
		Set<String> piescidelko = Anagram.converter(str);
		//then
		assertThat(piescidelko).contains("siep");
	}
	@Disabled
	@Test
	void epis(){
		//given
		String str = "pies";
		//when
		Set<String> piescidelko = Anagram.converter(str);
		//then
		assertThat(piescidelko).contains("epis");
	}
	@Test
	void allJo(){
		//given
		String str = "jo";
		//when
		Set<String> piescidelko = Anagram.converter(str);
		//then
		assertThat(piescidelko).containsOnly("oj");
	}
	@Test
	void allOo(){
		//given
		String str = "jo";
		//when
		Set<String> piescidelko = Anagram.converter(str);
		//then
		assertThat(piescidelko).containsOnly("oo");
	}
	@Test
	void allKot(){
		//given
		String str = "kot";
		//when
		Set<String> piescidelko = Anagram.converter(str);
		//then
		assertThat(piescidelko).containsOnly("kot", "kto", "tko", "tok", "okt", "otk");
	}

	@Test
	void allPies(){
		//given
		String str = "pies";
		//when
		Set<String> piescidelko = Anagram.converter(str);
		//then
		assertThat(piescidelko).containsOnly("pies", "pise", "peis", "pesi", "psie", "psei");
	}

}
