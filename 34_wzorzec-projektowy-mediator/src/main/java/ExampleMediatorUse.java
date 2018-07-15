public class ExampleMediatorUse {
	public static void main(String[] args) {
		Kolega rene = new Kolega("rene");
		Kolega toni = new Kolega("toni");
		Kolega kim = new Kolega("kim");

		Mediator m = new RzeczywistyMediator();
		m.zarejestrujKolege(rene);
		m.zarejestrujKolege(toni);
		m.zarejestrujKolege(kim);

		kim.wyslij("toni", "Hello world.");
		rene.wyslij("kim", "Witaj!");
	}
}
