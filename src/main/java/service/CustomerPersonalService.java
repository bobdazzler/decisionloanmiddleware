//package service;
//
//import java.sql.SQLException;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.stereotype.Service;
//
//import conf.DatabaseConfiguration;
//@Service
//public class CustomerPersonalService {
//	private static final Logger logger = LogManager.getLogger(CustomerPersonalService.class);
//public DatabaseConfiguration conf = new DatabaseConfiguration();
//
//public void testingDbConnection() {
//	try {
//		conf.getConnection();
//		logger.info("connected");
//		
//	} catch (ClassNotFoundException e) {
//		
//		logger.error("error occured class not found",e);
//	} catch (SQLException e) {
//		
//		logger.error("an sql error occured",e);
//	}
//	
//}
//}
