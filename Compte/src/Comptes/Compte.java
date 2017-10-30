package Comptes;





import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Compte {
private String nom;
private float solde;
private int num;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public float getSolde() {
	try {connecter();
		
		Statement stat=conn.createStatement();//executeQuery select...
		
		ResultSet rs=stat.executeQuery("select * from compte where numCompte="+num);
		
		while(rs.next()){
			 nom=rs.getString("nom");
			 num=rs.getInt("numCompte");
			 solde=rs.getFloat("solde");
			
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return solde;
}
public void setSolde(float solde) {
	this.solde = solde;
}


Connection conn;
static String url="jdbc:mysql://localhost:3306/mabase";
static String user="root";
static String pwd="";
static Properties prop=new Properties();//car il va etre utiliser dans un class static
static{
try {
	prop.load(Compte.class.getResourceAsStream("/config.properties"));
	url=prop.getProperty("url");
	user=prop.getProperty("user");
	pwd=prop.getProperty("pwd");
} catch (IOException e) {
	// TODO Auto-generated catch bloc
	e.printStackTrace();
}

}

public void connecter(){

try {try {
	Class.forName("com.mysql.jdbc.Driver");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	conn=DriverManager.getConnection(url,user,pwd);
	if(conn!=null)
		System.out.println("connection etablie");
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}

}
