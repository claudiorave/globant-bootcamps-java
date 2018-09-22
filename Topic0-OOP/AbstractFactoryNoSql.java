//2.Create a abstract factory example for diferent type of SQL connections. See this example.

public class AbstractNoSQLFactory {
	
   @Override
   public SQLFactory getNoSQLFactory(String noSqlFactoryType){
   
      if(sqlType == null){
         return null;
      }		
      
      if(sqlType.equalsIgnoreCase("MONGODB")){
         return new MongoDBFactory();
                 
      }else if(sqlType.equalsIgnoreCase("CASSANDRA")){
         return new CassandraFactory();
      }
      
      return null;
   }
   
}

