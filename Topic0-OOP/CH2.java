/*You have a database with different kinds of operations (SELECT, UPDATE, DELETE, etc), 
and after the execution of each one of these, several Loggers which log this action in detail. 
Which design pattern would you use and why? Implement it.

Answer: Builder pattern seems the fittest for this purpose. Every operation (DELETE, SELECT, FROM) would then have its own Concrete builder
 to implement the query. 
*/

public interface DBOperationBuilder {
	
	public void buildOperation();
	
	public void buildWHERE();

	public void buildFROM();
	
	public void buildORDERBY();


	public DBOperator getDBOperator();
}