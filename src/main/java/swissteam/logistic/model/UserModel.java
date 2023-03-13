package swissteam.logistic.model;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity(name = "user")
public class UserModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, length = 50)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, length = 50)
    private String email;
    @Column(nullable = false)
    private String roles;

    public String getPassword() {
        return password;
    }

    public String getRoles() {
        return roles;
    }

    public String getUsername() {
        return username;
    }

}
