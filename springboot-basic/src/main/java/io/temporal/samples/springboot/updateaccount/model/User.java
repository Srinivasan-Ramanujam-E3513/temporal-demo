package io.temporal.samples.springboot.updateaccount.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User {

    @NonNull
    @JsonProperty("userId")
    private String userId;

    @NonNull
    @JsonProperty("userEmail")
    private String userEmail;

    @NonNull
    @JsonProperty("firstName")
    private String firstName;

    @NonNull
    @JsonProperty("lastName")
    private String lastName;

    protected String userName;

    public String getUserName() {
        return this.userName = getFirstName() + getLastName();
    }

    @Override
    public String toString() {
        return "UserID: " + userId + ", UserName: " + userName + ", userEmail: " + userEmail;
    }

}
