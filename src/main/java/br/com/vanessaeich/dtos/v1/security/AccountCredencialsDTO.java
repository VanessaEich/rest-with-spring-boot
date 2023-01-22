package br.com.vanessaeich.dtos.v1.security;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Vanessa Eich on 22/01/2023
 */
public class AccountCredencialsDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;

    private String password;

    public AccountCredencialsDTO(String username, String password) {
        this.username = username;
        this.password = password;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountCredencialsDTO that = (AccountCredencialsDTO) o;
        return Objects.equals(username, that.username) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}
