package test;

public class SQLInjection {
	
	public static void main(String args[])
	{
		String userId = "135"; 
		String sqlQuery = "select * from user where userId = " + userId;  // fortify will give sql injection
		
		/* 
		 * userId=135: This part will match table rows having userId value as ‘135’.
		 * hacker will put 1=1: This part will be always evaluate as true. So Query will return all the rows of the table.
		 * 
		 * try with Input password: ‘ or ‘1’=’1
		 * 
		 * #####################
		 * 
		 * Preventing SQL Injection in Java Code
		 * simplest solution is to use PreparedStatement instead of Statement to execute the query. 
		 * 
		 * String query = "select * from user where username=? and password = ?";
		 */
		
	}

}
