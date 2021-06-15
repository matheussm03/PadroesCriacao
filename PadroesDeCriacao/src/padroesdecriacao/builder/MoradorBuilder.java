
package padroesdecriacao.builder;


public class MoradorBuilder {
    

    private Morador morador;

    public MoradorBuilder() {
        morador = new Morador();
    }

    public Morador build() {
        if (morador.getNumApartamento() == 0) {
            throw new IllegalArgumentException("Apartamento Invalido");
        }
        if (morador.getNome().equals("")) {
            throw new IllegalArgumentException("Nome invalido");
        }
        return morador;
    }

    public MoradorBuilder setNumApartamento(int numApartamento) {
        morador.setNumApartamento(numApartamento);
        return this;
    }

    public MoradorBuilder setNome(String nome) {
        morador.setNome(nome);
        return this;
    }

    public MoradorBuilder setCpf(String cpf) {
        morador.setCpf(cpf);
        return this;
    }

    public MoradorBuilder setRg(String rg) {
        morador.setRg(rg);
        return this;
    }

    
    public MoradorBuilder setCelular(String celular) {
        morador.setCelular(celular);
        return this;
    }
    
    public MoradorBuilder setEmail(String email) {
        morador.setEmail(email);
        return this;
    }


}
