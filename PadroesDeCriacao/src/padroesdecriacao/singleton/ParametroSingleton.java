package padroesdecriacao.singleton;

public class ParametroSingleton {

    private ParametroSingleton() {};
    private static ParametroSingleton instance = new ParametroSingleton();
    public static ParametroSingleton getInstance() {
        return instance;
    }

    private String modelo;
    private String placa;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    


    
}
