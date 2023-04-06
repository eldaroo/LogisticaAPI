package swissteam.logistic.model.auth;

public class RegisterRequest {
    private String firstname;
    private String password;
    private String email;

    public RegisterRequest(String firstname, String password, String email) {
        this.firstname = firstname;
        this.password = password;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String username) {
        this.firstname = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
