package components;

public class DatabaseDataSource implements IDataSource {
	public DatabaseDataSource() {
		System.out.println(this + " loaded");
	}

	@Override
	public int getData() {
		return 0;
	}
}
