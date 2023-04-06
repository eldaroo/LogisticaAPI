package swissteam.logistic.model.auth;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class AuthenticationRequest {
    private String email;
    private String password;

}
