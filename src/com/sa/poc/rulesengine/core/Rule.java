package com.sa.poc.rulesengine.core;

import java.util.function.Function;

/**
 * @param <T> Data input
 * @param <TR> Response of the rule execution
 */
public class Rule<T, TR> {
    /**
     * Name of this rule
     */
    public String name;
    /**
     * Data that this rule is going to need for
     * running business logic
     */
    public T fact;
    /**
     * Condition/ business logic that this rule
     * going to execute
     */
    public Function<T, TR> condition;

    /**
     * @return run a rule and return result
     */
    public TR run() {
        return condition.apply(fact);
    }
}