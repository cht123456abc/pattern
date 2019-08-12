package singleton;

public class StaticInnerClassSingleton {
	
	private StaticInnerClassSingleton() {
		
	}
	
	private static class SingletonHelper {
		private static final StaticInnerClassSingleton SINGLETON = new StaticInnerClassSingleton();
	}
	
	public static StaticInnerClassSingleton getInstance() {
		return SingletonHelper.SINGLETON;
	}
}
