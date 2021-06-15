
package padroesdecriacao.builder;


public class Morador {
  
    private int numApartamento;
    private String nome;
    private String cpf;
    private String rg;
    private String celular;
    private String email;
    
        public Morador() {
        this.numApartamento = 0;
        this.nome = "";
    }

    public int getNumApartamento() {
        return numApartamento;
    }

    public void setNumApartamento(int numApartamento) {
        this.numApartamento = numApartamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
       
    
        
    
}
