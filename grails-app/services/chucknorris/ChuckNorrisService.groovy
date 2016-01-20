package chucknorris

import grails.transaction.Transactional

@Transactional
class ChuckNorrisService {
    
    List<Persona> golpeDeBarba(List<Persona> personas) {
        return personas[0..<-1]
    }

    
    List<Persona> patadaVoladora(List<Persona> personas) {

        return []
    }
    
    
    String saludo(Boolean esFeliz){
        
        if (esFeliz){
            return "yo soy tu padre"
        }
        else{
            return "muere gusano"
        }
    }
    
    
    List<Persona> mediaPatadaVoladora(List<Persona> personas){
        
        List<Persona> supervivientes = []
        
        personas.eachWithIndex{ persona, i ->
            
            if (i % 2 == 0){
                supervivientes += persona
            }
        }
        
        return supervivientes      
    }
    
    
    
    
}
