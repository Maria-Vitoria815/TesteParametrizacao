package teste;
public class Conta {

    String username;
    String email;
    String senha;

    public Conta() {
    }

    public Conta(String username, String email, String senha) {
        this.username = username;
        this.email = email;
        this.senha = senha;
    } 

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Username: " + username + ", Email: " + email;
    }

}