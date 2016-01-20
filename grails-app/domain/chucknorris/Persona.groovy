package chucknorris

class Persona {
    
    String nombre
    String apellidos

    static constraints = {
        apellidos nullable:true
    }
}
