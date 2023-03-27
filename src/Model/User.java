package Model;

public class User {
    private int id;
    private String username;
    private String password;
    private int role = 2;
    private int locked = 0;
    private String SecQuestion;
    private String SecAnswer;
    private String SessionID;
    private String login_time;
    
//    private Product product[]; 
    
    
    public User(){
        this.id = 0;
    }
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public User(int id, String username, String password, int role, int locked, String SecQuestion, String SecAnswer, String SessionID, String login_time){
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.locked = locked;
        this.SecQuestion = SecQuestion;
        this.SecAnswer = SecAnswer;
        this.SessionID = SessionID;
        this.login_time = login_time;
    }
//    public Product getProduct() {
//        return product[];
//    }

//    public void setProduct(Product product[]) {
//        this.product = product;
//    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getLocked() {
        return locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }
    
    public String getSecQuestion() {
        return SecQuestion;
    }

    public void setSecQuestion(String SecQuestion) {
        this.SecQuestion = SecQuestion;
    }
    
    public String getSecAnswer() {
        return SecAnswer;
    }

    public void setSecAnswer(String SecAnswer) {
        this.SecAnswer = SecAnswer;
    }
 
    public String getSessionID() {
        return SessionID;
    }

    public void setSessionID(String SessionID) {
        this.SessionID = SessionID;
    }
    
    public String getLogin_Time(){
        return login_time;
    }
    
    public void setLogin_Time(String login_time){
        this.login_time = login_time;
    }
    
}
