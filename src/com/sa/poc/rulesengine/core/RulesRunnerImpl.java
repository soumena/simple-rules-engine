package com.sa.poc.rulesengine.core;

import java.util.ArrayList;
import java.util.List;
/**
 * This class is responsible for assembling and
 * firing/executing the rules
 */
public class RulesRunnerImpl<TR> implements RulesRunner<TR> {
    private final List<Rule<?, TR>> rules = new ArrayList<>();
    /**
     * @param rule - rules object
     * @return RulesRunner object
     */
    @Override
    public RulesRunner<TR> addRule(Rule<?, TR> rule) {
        rules.add(rule);
        return this;
    }
    /**
     * @return list of responses of the rules
     */
    @Override
    public List<TR> runAllRules() {
        List<TR> rulesResponse = new ArrayList<>();
        this.rules.forEach(rule -> {
            System.out.println("Executing Rule: " + rule.name + "...");
            rulesResponse.add(rule.run());
        });
        return rulesResponse;
    }
}
