package com.sa.poc.rulesengine.rules;

import com.sa.poc.rulesengine.domain.ChildDomainPojoOne;
import com.sa.poc.rulesengine.domain.ChildDomainPojoTwo;
import com.sa.poc.rulesengine.domain.RulesResponse;
import com.sa.poc.rulesengine.core.Rule;
import com.sa.poc.rulesengine.core.RulesBuilder;

/**
 * This is the class where the actual rules should be defined
 * Rules can be grouped based on category/product or whatever
 * ways it is supposed to be grouped!!
 */
public class SimpleDemoRules {
    /**
     * @return Rule object
     * Since rules are defined specifically here, you can pass specific objects here!!
     */
    public Rule<ChildDomainPojoOne,RulesResponse> thisIsaSampleRule(ChildDomainPojoOne data) {
        // you can get data for this rule here as well if you do not want the data to come from the outside...
        return new RulesBuilder<ChildDomainPojoOne, RulesResponse>()
                .withName("My First Rule")
                .withFact(data)
                .withCondition((fact) -> {
                    //use of combinator pattern is advisable
                    System.out.println("This is a simple rule condition demo with data :" + fact);
                    RulesResponse rulesResponse = new RulesResponse();
                    rulesResponse.errorMessage = "No errors found!!!";
                    rulesResponse.status = true;
                    return rulesResponse;
                })
                .build();
    }

    /**
     * @param data - data for this rule
     * @return the rules response
     */
    public Rule<ChildDomainPojoTwo,RulesResponse> thisIsaSampleRule2(ChildDomainPojoTwo data) {
        // you can get data for this rule here as well if you do not want the data to come from outside...
        return new RulesBuilder<ChildDomainPojoTwo, RulesResponse>()
                .withName("My Second Rule")
                .withFact(data)
                .withCondition((fact) -> {
                    System.out.println("This is a simple rule condition demo with data :" + fact.toString());
                    RulesResponse rulesResponse = new RulesResponse();
                    rulesResponse.errorMessage = "OOPS something does not seem right here!!";
                    rulesResponse.status = false;
                    return rulesResponse;
                })
                .build();
    }
}