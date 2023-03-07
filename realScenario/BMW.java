package realScenario;

public abstract class BMW extends Yokahama {
	public abstract void custmerspec();

	@Override
	public void cardesign() {
		System.out.println("car designed and assembled successfully");

	}

	@Override
	public void internalpartsdesign() {
		System.out.println("internal parts designed successfully");

	}

	@Override
	public void exterdesign() {
		System.out.println("external parts designed successfully");

	}
}
