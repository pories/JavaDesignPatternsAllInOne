
public class ObjectFactory {

	public static IAbstractionInterface1 Create(boolean TORF) {
		if (TORF) {
			return new ConcreteBusinessObject1("Mike");
		} else {
			return new ConcreteBusinessObject2("Pories");
		}
	}
}