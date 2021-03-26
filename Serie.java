import interfaces.IAcciones;

public class Serie implements IAcciones {

    private Integer id;
    private String titulo;
    private String genero;
    private Integer anio;
    private String sinopsis;

    //list<Temporada>temporadas
    //list<Personaje> personajes
}

//Serie conecta con IAcciones y (padre) Usuario