package chucknorris

import grails.transaction.Transactional

@Transactional
class PruebaCodenarcService {

    def prueba() {

        //codenarc BitwiseOperatorInConditional
        def sonia = new Persona(name:"Sonia")
        def rafa = new Persona(name:"Rafa")
        if ( sonia.name > 5 & rafa.name > 5 ) {
            println "todos los nombres son largos"
        }
        
        //codenarc EmptyCatchBlock
        try{
            throw new IOException()
        }
        catch (Exception e){
//        catch (Exception eCatchVacio){
            
        }
        
        //codenarc CouldBeElvis
        Integer numDiasAño
        if (!numDiasAño) {           
            numDiasAño = 365
        }
        numDiasAño?:365
        
        //codenarc DuplicateStringLiteral
        String coche1.color = "verde"
        String coche2.color = "verde"
        
    }
}
