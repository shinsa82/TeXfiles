package injectors;

import binders.SimpleModule;

import com.google.inject.Guice;
import com.google.inject.Injector;
import components.IDataSource;

public class SimpleInjector {
	public static void main(String[] args) {
		System.out.println("creating injector");
		Injector injector = Guice.createInjector(new SimpleModule());
		System.out.println("obtaining an instance");
		IDataSource ds = injector.getInstance(IDataSource.class);
		System.out.println(ds + " has obtained");
	}
}
