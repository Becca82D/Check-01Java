public class Actor extends Persona {
    private String apellido;

    public Actor(){

    }

    public Actor(String apellido){
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString(){
        return 'Actor{' +
                'apellido' + apellido +
                '}';
    }


}

//actor ==> persona

//para cotejar que el personaje no se repita ==>Actor ==> persona