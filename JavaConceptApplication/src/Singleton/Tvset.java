package Singleton;

public class Tvset {

	private static Tvset tvsetObj = null;

	private Tvset() {

		System.out.println("Object is created");
	}

	public static Tvset geTvset() {

		if (tvsetObj == null)
			synchronized (Tvset.class) {
				if (tvsetObj == null) // double checking to remove object duplicate issue
				    tvsetObj = new Tvset();
			}
		return tvsetObj;
	}

}
