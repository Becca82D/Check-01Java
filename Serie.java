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

    //list<Temporada>temporadas
    //list<Personaje> personajes

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
}

//Serie conecta con IAcciones y Usuario