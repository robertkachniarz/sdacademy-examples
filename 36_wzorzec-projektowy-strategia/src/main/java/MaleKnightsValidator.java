/* Przyjmuje tylko rycerzy o imionach brzmiących męsko
 * (pomijamy Barnabę itp.)
 */
class MaleKnightsValidator implements KnightValidator{

	public boolean validate(Knight knight){
		String name = knight.getName();
		return name.charAt(name.length()-1)!='a';
	}

}