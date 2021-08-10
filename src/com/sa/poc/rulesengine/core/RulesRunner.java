package com.sa.poc.rulesengine.core;

import java.util.List;

/**
 * @param <TR> response/result of the rules execution
 */
public interface RulesRunner<TR> {
    /**
     * @param rule input rules object
     * @return RulesRunner object
     */
    RulesRunner<TR> addRule(Rule<?, TR> rule);
    /**
     * @return List of rules results
     */
    List<TR> runAllRules();

}
