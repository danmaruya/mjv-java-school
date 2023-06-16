package entidades;

public class Contato {
    private String email;
    private Long telefone;
    private Long celular;
    private boolean seWhatsApp;

    public Contato() {
    }

    public Contato(String email, Long telefone, Long celular, boolean seWhatsApp) {
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.seWhatsApp = seWhatsApp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public boolean isSeWhatsApp() {
        return seWhatsApp;
    }

    public void setSeWhatsApp(boolean seWhatsApp) {
        this.seWhatsApp = seWhatsApp;
    }

}
