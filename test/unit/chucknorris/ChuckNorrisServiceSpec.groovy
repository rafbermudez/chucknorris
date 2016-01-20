package chucknorris

import grails.test.mixin.TestFor
import spock.lang.Specification


@TestFor(ChuckNorrisService)
class ChuckNorrisServiceSpec extends Specification {
    
    void "golpeDeBarba mata una persona"() {
        
        given: "lista de personas"
        List<Persona> personas = [
            new Persona(name:"Pedro"), 
            new Persona(name:"Juan"), 
            new Persona(name:"Rafa")
        ]
          
        when: "ejecuto golpeDeBarba"
        List<Persona> personasTrasEjecucion = service.golpeDeBarba(personas)
          
        then: "Muere una persona"
        personasTrasEjecucion.size() == personas.size()-1
    }
//    
//
    void "patadaVoladora mata a todas las personas"() {
        
        given: "lista de personas"
        List<Persona> personas = [
            new Persona(name:"Pedro"), 
            new Persona(name:"Juan"), 
            new Persona(name:"Rafa")
        ]
          
        when: "ejecuto patadaVoladora"
        List<Persona> personasTrasEjecucion = service.patadaVoladora(personas)
          
        then: "Muere una persona"
        personasTrasEjecucion.size() == 0
    }
//    
//    
    void "saludo feliz"(){
        
        when:"es feliz"
        def saludo = service.saludo(true)
        
        then:"es tu padre"
        saludo == "yo soy tu padre"
    }
//    
//    
    void "saludo infeliz"(){
        
        when:"es infeliz"
        def saludo = service.saludo(false)
        
        then:"muere gusano"
        saludo == "muere gusano"
    }
//    
//    
    void "mediaPatadaVoladora mata a todas las personas pares"() {
        
        given: "ciertas personas"
        
        def sonia = new Persona(name:"Sonia") 
        def marta = new Persona(name:"Marta")
        def rafa = new Persona(name:"Rafa")
        def pedro = new Persona(name:"Pedro")
          
        when: "ejecuto mediaPatadaVoladora"
        List<Persona> personasTrasEjecucion = service.mediaPatadaVoladora([rafa, pedro, sonia])
          
        then: "Muere una persona"
        personasTrasEjecucion.size() == 2
        //personasTrasEjecucion == [rafa, sonia]
        
    }
    
    
}
