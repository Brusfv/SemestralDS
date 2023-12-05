package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	public static void main(String[] args) {
        
        conectar();
    }

public static void conectar() {
	Connection conn= null;
	String driver="com.mysql.jdbc.Driver";
	try {
		Class.forName(driver);
		System.out.println("Driver cargado con éxito");
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Patricia05**");
			if(conn!=null) {
				System.out.println("Conexión realizada con éxito");
		   }
		}catch(SQLException e) {
			System.out.println("Ha ocurrido un error al intentar conectar con la base de datos"+e.getMessage());
		}
	}catch(Exception e) {
		System.out.println("Ha ocurrido un error al cargar el Driver"+e.getMessage());
	}
}
}