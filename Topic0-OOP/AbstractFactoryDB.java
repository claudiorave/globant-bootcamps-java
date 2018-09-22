//2.Create a abstract factory example for diferent type of SQL connections. See this example.

public class AbstractSQLFactory {
	
   @Override
   public SQLFactory getSQLFactory(String sqlFactoryType){
   
      if(sqlType == null){
         return null;
      }		
      
      if(sqlType.equalsIgnoreCase("SQLITE")){
         return new SQLiteFactory();
                 
      }else if(sqlType.equalsIgnoreCase("MYSQL")){
         return new MySQLFactory();
      }
      
      return null;
   }
   
}

