package Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonMainClass {

	public static void main(String[] args) {
		
		/*Tvset tvset = Tvset.geTvset();
		
		Tvset tvset1 = Tvset.geTvset();
		
		System.out.println(tvset);
		
		System.out.println(tvset1);*/
		
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		executor.execute(()-> Tvset.geTvset());
		executor.execute(()-> Tvset.geTvset());
		executor.execute(()-> Tvset.geTvset());
		executor.execute(()-> Tvset.geTvset());
		executor.execute(()-> Tvset.geTvset());
		executor.execute(()-> Tvset.geTvset());
		

	}

}
