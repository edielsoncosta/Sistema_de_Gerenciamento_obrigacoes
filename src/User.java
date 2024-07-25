public class User {
    private String nomeUsuario;
    private String email;

    public User(String nomeUsuario, String email) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "nome: "
                + nomeUsuario
                + "\nemail: "
                + email;
    }
}
