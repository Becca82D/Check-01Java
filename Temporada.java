public class Temporada {

    private Integer id; //autoincremetar 0
    private Integer numero;
    private Boolean inicio;
    private Boolean fin;

    private List<Capitulos> capitulos;

    public Temporada(){

    }

    public Temporada(Integer id, Integer numero, Boolean inicio, Boolean fin, ){
        this.id = id;
        this.numero = numero;
        this.inicio = inicio;
        this.fin = fin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    //list<Capitulos>capitulos
    //agregarCapitulo(capitulo capitulo) : void ==> temporada
    // capitulosVistos(): int retorna ==> capitulos ==> temporada
    //eliminar(int) ==> temporada ==> cómo sé quién la está viendo? ==> error
}

//temporada conecta con Serie y Capitulo