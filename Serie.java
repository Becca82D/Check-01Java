import interfaces.IAcciones;

public class Serie implements IAcciones {

    private Integer id;
    private String titulo;
    private String genero;
    private Integer anio;
    private String sinopsis;

    private List<Temporada> temporadas;
    private List<Personaje> personajes;

    public Serie() {

    }

    public Serie(Integer id, String titulo, String genero, Integer anio, String sinopsis, List<Teporada> temporadas, List<Personaje> personajes){
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.sinopsis = sinopsis;
        this.temporadas = temporadas;
        this.personajes = personajes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

// IAcciones <== Serie  ==> Usuario