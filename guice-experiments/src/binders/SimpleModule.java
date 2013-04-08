package binders;

import com.google.inject.AbstractModule;

import components.DatabaseDataSource;
import components.IDataSource;

public class SimpleModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(IDataSource.class).to(DatabaseDataSource.class);
	}
}
