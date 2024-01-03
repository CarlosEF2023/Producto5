package modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")

public class Usuario {

        @Id
        @Column(name="nombre")
        private String username;
        @Column(name="contrasenya")
        private String password;

    /** Getters
     *
     * @return
     */

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    /** Setters
     *
     * @param username
     */

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /** Constructor
     *
     * @param username
     * @param password
     */

    public Usuario(String username, String password) {
    super();
        this.username = username;
        this.password = password;

    }

    public Usuario() {

    }

    /** ToString
     *
     * @return
     */

    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}




