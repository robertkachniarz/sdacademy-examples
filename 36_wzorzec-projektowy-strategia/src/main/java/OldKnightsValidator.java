/* Przyjmuje tylko rycerzy w wieku ponad 60 lat
 */
class OldKnightsValidator implements KnightValidator{

	public boolean validate(Knight knight){

		return knight.getAge()>60;
	}

}
