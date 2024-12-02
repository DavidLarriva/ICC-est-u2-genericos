package Models.Genericos;

public class Caja <T> {

    private T objeto ;

    public T getT() {
        return objeto;
    }

    public void guardar(T objeto) {
        this.objeto = objeto;
    }

    

}
