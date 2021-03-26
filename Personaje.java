
public class Personaje extends Serie{

    private Integer id; //autoincrement 1000
    private String actor;
    private String nombrePersonaje;

    public Personaje(){

    }

    public Personaje(Integer id, String actor, String nombrePersonaje){
        this.id = id;
        this.actor = actor;
        this.nombrePersonaje = nombrePersonaje;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    @Override
    public String toString(){
        return "Personaje{" +
                'personaje=' + personaje +
                ', actor=' + actor +
                ', nombrePersonaje=' + nombrePersonaje
                '}';
    }

}