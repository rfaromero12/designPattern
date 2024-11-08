package creationalDesignPattern.Factory;

public class Boss implements Worker{

	@Override
	public void work() {
		System.out.println("Trabajar siendo jefe es lo mejor");
	}
	
	public void earn() {
		System.out.println("A cobrar");
	}
}
