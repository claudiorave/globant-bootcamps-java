// 4. Create a builder example for database connection.

public interface DBConnectionBuilder {
	public void buildAccessUrl();

	public void buildPassword();

	public void buildUser();

	public DBConnection getDBConnection();
}