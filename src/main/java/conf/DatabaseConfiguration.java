//package conf;
//import java.sql.*;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//public class DatabaseConfiguration {
//	private static final Logger logger = LogManager.getLogger(DatabaseConfiguration.class);
//	
//	String accessDBURLPrefix = 
//	"jdbc:oracle:thin:@10.1.66.16:6696/FCUBSPRE;User Id=salesportal;Password=moving123;"
//	+ "PERSIST SECURITY INFO=True;Pooling=true;Connection Lifetime=60";
//
//    public Connection getConnection() throws ClassNotFoundException, SQLException {
//        logger.info("Creating DB connection");
//        Class.forName("oracle.jdbc.OracleDriver");
//        return DriverManager.getConnection(accessDBURLPrefix);
//    }
//
//    public void closeConnection(Connection con){
//        if(con!=null){
//            try {
//                con.close();
//                logger.info("Closing DB connection");
//            } catch (SQLException e) {
//                logger.error("Error while closing connection",e);
//            }
//        }
//    }
//
//    public void closePreparedStatement(PreparedStatement ps) {
//        if(ps!=null){
//            try {
//                ps.close();
//                logger.info("Closing Prepared Statement");
//            } catch (SQLException e) {
//                logger.error("Error while closing prepared statement",e);
//            }
//        }
//    }
//
//    public void closeResultSet(ResultSet rs) {
//        if(rs!=null){
//            try {
//                rs.close();
//                logger.info("Closing Result Set");
//            } catch (SQLException e) {
//                logger.error("Error while closing result set",e);
//            }
//        }
//    }
//}
