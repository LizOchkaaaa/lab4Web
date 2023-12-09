package com.example.back.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
public class NewUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;


    public NewUser() {

    }

    public static NewUser fromEntity(NewUser foundUser) {
        NewUser result = new NewUser();
        result.setUsername(foundUser.getUsername());
        result.setPassword(foundUser.getPassword());
        return result;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
