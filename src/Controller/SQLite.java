package Controller;

import Model.History;
import Model.Logs;
import Model.Product;
import Model.User;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class SQLite {
    
    public int DEBUG_MODE = 0;
    String driverURL = "jdbc:sqlite:" + "database.db";
    
    public void createNewDatabase() {
        try (Connection conn = DriverManager.getConnection(driverURL)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("Database database.db created.");
            }
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void createHistoryTable() {
        String sql = "CREATE TABLE IF NOT EXISTS history (\n"
            + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
            + " username TEXT NOT NULL,\n"
            + " name TEXT NOT NULL,\n"
            + " stock INTEGER DEFAULT 0,\n"
            + " timestamp TEXT NOT NULL\n"
            + ");";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table history in database.db created.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void createLogsTable() {
        String sql = "CREATE TABLE IF NOT EXISTS logs (\n"
            + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
            + " event TEXT NOT NULL,\n"
            + " username TEXT NOT NULL,\n"
            + " desc TEXT NOT NULL,\n"
            + " timestamp TEXT NOT NULL\n"
            + ");";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table logs in database.db created.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
     
    public void createProductTable() {
        String sql = "CREATE TABLE IF NOT EXISTS product (\n"
            + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
            + " name TEXT NOT NULL UNIQUE,\n"
            + " stock INTEGER DEFAULT 0,\n"
            + " price REAL DEFAULT 0.00\n"
            + ");";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table product in database.db created.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
     
    public void createUserTable() {
        String sql = "CREATE TABLE IF NOT EXISTS users (\n"
            + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
            + " username TEXT NOT NULL UNIQUE,\n"
            + " password TEXT NOT NULL,\n"
            + " role INTEGER DEFAULT 2,\n"
            + " locked INTEGER DEFAULT 0\n"
            + ");";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table users in database.db created.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void dropHistoryTable() {
        String sql = "DROP TABLE IF EXISTS history;";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table history in database.db dropped.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void dropLogsTable() {
        String sql = "DROP TABLE IF EXISTS logs;";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table logs in database.db dropped.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void dropProductTable() {
        String sql = "DROP TABLE IF EXISTS product;";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table product in database.db dropped.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void dropUserTable() {
        String sql = "DROP TABLE IF EXISTS users;";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table users in database.db dropped.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void addHistory(String username, String name, int stock, String timestamp) {
        String sql = "INSERT INTO history(username,name,stock,timestamp) VALUES(?, ?, ?, ?)";
        
        try (Connection conn = DriverManager.getConnection(driverURL);
//            Statement stmt = conn.createStatement()){
//            stmt.execute(sql);
            
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, username);
            stmt.setString(2, name);
            stmt.setInt(3, stock);
            stmt.setString(4, timestamp == null ? new Timestamp(new Date().getTime()).toString():timestamp);
            stmt.executeUpdate();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void addLogs(String event, String username, String desc, String timestamp) {
        String sql = "INSERT INTO logs(event,username,desc,timestamp) VALUES(?, ?, ?, ?)";
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, event);
            stmt.setString(2, username);
            stmt.setString(3, desc);
            stmt.setString(4, timestamp == null ? new Timestamp(new Date().getTime()).toString():timestamp);
            stmt.executeUpdate();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void addProduct(String name, int stock, double price) {
        String sql = "INSERT INTO product(name,stock,price) VALUES('" + name + "','" + stock + "','" + price + "')";
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()){
            stmt.execute(sql);
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void purchaseProduct(String name, int stock) {
        String sql = "UPDATE product SET stock=? WHERE name=?";
        
        try{
            Connection conn = DriverManager.getConnection(driverURL);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, stock);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    // added edit product
//    public void updateUser(String username, String password, int role, int locked, String SecQuestion, String SecAnswer, int FailLog){
//        String sql = "UPDATE users SET password=?, role=?, locked=?, SecQuestion=?, SecAnswer=?, FailLog=? WHERE username=?";
//            
//        try{
//            Connection conn = DriverManager.getConnection(driverURL);
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            pstmt.setString(1, password);
//            pstmt.setInt(2, role);
//            pstmt.setInt(3, locked);
//            pstmt.setString(4, SecQuestion);
//            pstmt.setString(5, SecAnswer);
//            pstmt.setInt(6, FailLog);
//            pstmt.setString(7, username);
//            pstmt.executeUpdate();
//            
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
    
    public void editProduct(String name, int stock, float price, int id) {
//        String sql = "INSERT INTO product(name,stock,price) VALUES('" + name + "','" + stock + "','" + price + "')";
        String sql = "UPDATE product SET name=?, stock=?, price=? WHERE id=?";
        
        try{
            Connection conn = DriverManager.getConnection(driverURL);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setInt(2, stock);
            pstmt.setFloat(3, price);
            pstmt.setInt(4, id);
            pstmt.executeUpdate();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
//    public void removeUser(String username) {
//        String sql = "DELETE FROM users WHERE username='" + username + "';";
//
//        try (Connection conn = DriverManager.getConnection(driverURL);
//            Statement stmt = conn.createStatement()) {
//            stmt.execute(sql);
//            System.out.println("User " + username + " has been deleted.");
//        } catch (Exception ex) {
//            System.out.print(ex);
//        }
//    }
    
    public void deleteProduct(String name) {
        String sql = "DELETE FROM product WHERE name='" + name + "';";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Product " + name + " has been deleted.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void addUser(String username, String password, String SecQuestion, String SecAnswer) {
        
//        String sql = "INSERT INTO users(username,password, SecQuestion, SecAnswer) VALUES('" + username + "','" + password + "' ,'" + SecQuestion + "','" + SecAnswer + "')";
//        
//        System.out.println(sql);
        String sql = "INSERT INTO users(username,password,SecQuestion,SecAnswer) VALUES(?,?,?,?)";
       try (Connection conn = DriverManager.getConnection(driverURL);
//            Statement stmt = conn.createStatement()){
//            stmt.execute(sql);
            
      PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setString(1, username);
      pstmt.setString(2, password);
      pstmt.setString(3, SecQuestion);
      pstmt.setString(4, SecAnswer);
      pstmt.executeUpdate();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    
    
    public ArrayList<History> getHistory(){
        String sql = "SELECT id, username, name, stock, timestamp FROM history";
        ArrayList<History> histories = new ArrayList<History>();
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                histories.add(new History(rs.getInt("id"),
                                   rs.getString("username"),
                                   rs.getString("name"),
                                   rs.getInt("stock"),
                                   rs.getString("timestamp")));
            }
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return histories;
    }
    
    public ArrayList<Logs> getLogs(){
        String sql = "SELECT id, event, username, desc, timestamp FROM logs";
        ArrayList<Logs> logs = new ArrayList<Logs>();
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                logs.add(new Logs(rs.getInt("id"),
                                   rs.getString("event"),
                                   rs.getString("username"),
                                   rs.getString("desc"),
                                   rs.getString("timestamp")));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return logs;
    }
    
    public ArrayList<Logs> getUserLogs(String username){
    String sql = "SELECT id, event, username, desc, timestamp FROM logs where username=?";
    ArrayList<Logs> logs = new ArrayList<Logs>();

    try {
        Connection conn = DriverManager.getConnection(driverURL);
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, username);

        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            logs.add(new Logs(rs.getInt("id"),
                               rs.getString("event"),
                               rs.getString("username"),
                               rs.getString("desc"),
                               rs.getString("timestamp")));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return logs;
    }
    
    public ArrayList<Product> getProduct(){
        String sql = "SELECT id, name, stock, price FROM product";
        ArrayList<Product> products = new ArrayList<Product>();
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                products.add(new Product(rs.getInt("id"),
                                   rs.getString("name"),
                                   rs.getInt("stock"),
                                   rs.getFloat("price")));
            }
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return products;
    }
    
    public ArrayList<User> getUsers(){
        String sql = "SELECT id, username, password, role, locked, SecQuestion, SecAnswer, SessionID FROM users";
        ArrayList<User> users = new ArrayList<User>();
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                users.add(new User(rs.getInt("id"),
                                   rs.getString("username"),
                                   rs.getString("password"),
                                   rs.getInt("role"),
                                   rs.getInt("locked"),
                                   rs.getString("SecQuestion"),
                                   rs.getString("SecAnswer"),
                                    rs.getString("SessionID")));
            }
        } catch (Exception ex) {}
        return users;
    }
    
    public void addUser(String username, String password, int role) {
        String sql = "INSERT INTO users(username,password,role) VALUES('" + username + "','" + password + "','" + role + "')";
        
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()){
            stmt.execute(sql);
            
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void removeUser(String username) {
        String sql = "DELETE FROM users WHERE username='" + username + "';";

        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("User " + username + " has been deleted.");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void updateUser(String username, String password, int role, int locked, String SecQuestion, String SecAnswer, String SessionID){
        String sql = "UPDATE users SET password=?, role=?, locked=?, SecQuestion=?, SecAnswer=?, SessionID=? WHERE username=?";
            
        try{
            Connection conn = DriverManager.getConnection(driverURL);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, password);
            pstmt.setInt(2, role);
            pstmt.setInt(3, locked);
            pstmt.setString(4, SecQuestion);
            pstmt.setString(5, SecAnswer);
            pstmt.setString(6, SessionID);
            pstmt.setString(7, username);
            pstmt.executeUpdate();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean checkUser(String username, String password){
        String sql = "SELECT id, username, password, role, locked, SecQuestion, SecAnswer, SessionID FROM users WHERE username=? AND password=?";
        User user = new User();
            
        try{
            Connection conn = DriverManager.getConnection(driverURL);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, Secure.encrypt(password));
            
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getInt("role"),
                        rs.getInt("locked"),
                        rs.getString("SecQuestion"),
                        rs.getString("SecAnswer"),
                        rs.getString("SessionID"));
            }
            if(user.getId() != 0)
                return true;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean checkIfUsernameTaken(String username){
        String sql = "SELECT id, username, password, role, locked, SecQuestion, SecAnswer, SessionID FROM users WHERE username=? COLLATE NOCASE";
        User user = new User();
            
        try{
            Connection conn = DriverManager.getConnection(driverURL);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getInt("role"),
                        rs.getInt("locked"),
                        rs.getString("SecQuestion"),
                        rs.getString("SecAnswer"),
                        rs.getString("SessionID"));
            }
            if(user.getId() != 0)
                return true;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public User getUser(String username){
        String sql = "SELECT id, username, password, role, locked, SecQuestion, SecAnswer, SessionID FROM users WHERE username=?";
        User user = new User();
            
        try{
            Connection conn = DriverManager.getConnection(driverURL);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getInt("role"),
                        rs.getInt("locked"),
                        rs.getString("SecQuestion"),
                        rs.getString("SecAnswer"),
                        rs.getString("SessionID"));
            }
            if(user.getId() != 0)
                return user;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Product getProduct(String name){
        String sql = "SELECT name, stock, price FROM product WHERE name='" + name + "';";
        Product product = null;
        try (Connection conn = DriverManager.getConnection(driverURL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            product = new Product(rs.getString("name"),
                                   rs.getInt("stock"),
                                   rs.getFloat("price"));
        } catch (Exception ex) {
            System.out.print(ex);
        }
        return product;
    }
}