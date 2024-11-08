package creationalDesignPattern.Factory;

public class WorkerFactory {

	@SuppressWarnings("unchecked")
	public static <T extends Worker> T createWorker(Class<T> classname) {
		if(classname.equals(Boss.class)) {
			return (T) new Boss();
		}
		else if(classname.equals(Minion.class)) {
			return (T) new Minion();
		}
		return null;
	}
	
}
