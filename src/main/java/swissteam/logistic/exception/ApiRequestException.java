package swissteam.logistic.exception;

import org.springframework.http.HttpStatus;
import com.google.gson.Gson;

public class ApiRequestException extends RuntimeException{

    private final HttpStatus httpStatus;
    private static final Gson gson = new Gson();

    public ApiRequestException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public Object getErrorMessage() {
        return gson.toJson(getMessage());
    }
}
