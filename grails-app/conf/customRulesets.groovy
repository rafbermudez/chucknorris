ruleset {
    ruleset('rulesets/basic.xml'){
        include 'BitwiseOperatorInConditional'
        
                
        include 'EmptyCatchBlock'
        include 'EmptyCatchBlock'{
            ignoreRegex = 'eCatchVacio'
        }
    }
        
        
    ruleset('rulesets/convention.xml'){
        include 'CouldBeElvis'
    }
        
        
        ruleset('rulesets/dry.xml'){
            include 'DuplicateStringLiteral'
            //            DuplicateStringLiteral{
            //                doNotApplyToClassNames = '*Spec'
            //            }
        }
    
        
        ruleset('rulesets/formatting.xml'){
            include 'LineLength'
            LineLength { length = 100 }
        }
        
        
    ruleset('rulesets/size.xml'){
        MethodSize {
            maxLines = 5
            doNotApplyToClassNames = '*Spec'
        }
    }
}


