package com.sa.poc.rulesengine.core;

import java.util.function.Function;

/**
 * Rules builder class
 */
public class RulesBuilder<T, TR> {
    /**
     *  Rules object that eventually be build by this builder class
     */
    private final Rule<T, TR> rule = new Rule<>();
    /**
     * @param name - name of the rule
     * @return rules builder instance
     */
    public RulesBuilder<T, TR> withName(String name) {
        rule.name = name;
        return this;
    }
    /**
     * @param condition - business logic to be executed
     * @return rules builder instance
     */
    public RulesBuilder<T, TR> withCondition(Function<T, TR> condition) {
        this.rule.condition = condition;
        return this;
    }
    /**
     * @param fact - data on which this rule is going to be executed!!
     * @return rules builder instance
     */
    public RulesBuilder<T, TR> withFact(T fact) {
        this.rule.fact = fact;
        return this;
    }
    /**
     * @return rules object
     */
    public Rule<T, TR> build() {
        return this.rule;
    }
}