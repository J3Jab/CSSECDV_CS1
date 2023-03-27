package Model;

public class User {
    private int id;
    private String username;
    private String password;
    private int role = 2;
    private int locked = 0;
    private String SecQuestion;
    private String SecAnswer;
    private int FailLog;
    private int session_id;
//    private Product product[]; 
    
    
    public User(){
        this.id = 0;
    }
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public User(int id, String username, String password, int role, int locked, String SecQuestion, String SecAnswer, int FailLog){
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.locked = locked;
        this.SecQuestion = SecQuestion;
        this.SecAnswer = SecAnswer;
        this.FailLog = FailLog;
    }
    
    public int getSessionId() {
        return session_id;
    }

    public void setSessionId(int session_id) {
        this.session_id = session_id;
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
 
    public int getFailLog() {
        return FailLog;
    }

    public void setFailLog(int FailLog) {
        this.FailLog = FailLog;
    }
    
}
