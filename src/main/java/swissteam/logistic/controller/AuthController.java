package swissteam.logistic.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import swissteam.logistic.exception.ApiRequestException;
import swissteam.logistic.model.LoginForm;
import swissteam.logistic.service.JpaUserDetailsService;

import java.security.Principal;

@RestController
@RequestMapping("/auth")
@DependsOn("securityFilterChain")
public class AuthController {

    @Autowired
    private JpaUserDetailsService userDetailsService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginForm form, HttpServletRequest request, HttpServletResponse response) {
        try {
            request.login(form.getUsername(), form.getPassword());
        } catch (ServletException e) {
            throw new ApiRequestException(e.getMessage(), HttpStatus.UNAUTHORIZED);
        }

        Authentication loggedInUser = (Authentication) request.getUserPrincipal();
        String username = loggedInUser.getName();

        return ResponseEntity.ok(username);
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null) {
            new SecurityContextLogoutHandler().logout(request, response, authentication);
        }
        return "redirect:/login?logout";
    }

    @GetMapping("/current-user")
    public CurrentUser getCurrentUser(@AuthenticationPrincipal User user) {
        return new CurrentUser(user.getUsername(), user.getAuthorities().toArray());
    }

    @GetMapping("/userinfo")
    public ResponseEntity<?> getUserInfo(Principal user){
        UserDetails userObj= userDetailsService.loadUserByUsername(user.getName());
        CurrentUser userInfo =new CurrentUser(userObj.getUsername(), userObj.getAuthorities().toArray());
        return ResponseEntity.ok(userInfo);
    }

    public record CurrentUser(String nickname, Object roles) {}
}
