package com.sa.poc.rulesengine.rules;

import com.sa.poc.rulesengine.domain.RulesResponse;
import com.sa.poc.rulesengine.core.RulesRunner;
import com.sa.poc.rulesengine.core.RulesRunnerImpl;
import com.sa.poc.rulesengine.service.RulesDataMockService;

import java.util.List;

/**
 * This class assembles all the rules in a specific sequence
 * and run all rules at once.It also captures response from
 * the all executed rules
 */
public class SimpleDemoRulesOrchestrator {
    /**
     * Orchestrate and run all rules in specific order
     */
    public void orchestrateSimpleDemoRules() {
        final RulesRunner<RulesResponse> simpleDemoRulesRunner = new RulesRunnerImpl<>();
        final SimpleDemoRules rules = new SimpleDemoRules();
        final RulesDataMockService rulesDataMockService = new RulesDataMockService();

        List<RulesResponse> rulesResponses =
                simpleDemoRulesRunner
                        .addRule(rules.thisIsaSampleRule(rulesDataMockService.getChildDomainPojoOneMockData()))
                        .addRule(rules.thisIsaSampleRule2(rulesDataMockService.getChildDomainPojoTwoMockData()))
                        .runAllRules();

        System.out.println("Responses....");
        rulesResponses.forEach(res -> System.out.println(res.status + " -- " + res.errorMessage));
    }
}
