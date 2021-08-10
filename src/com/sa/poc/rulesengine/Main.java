package com.sa.poc.rulesengine;

import com.sa.poc.rulesengine.rules.SimpleDemoRulesOrchestrator;

public class Main {

    //TODO:- bit confusing at this time,so lets go back to drawing board
    // and see how best can this be handled!!

    public static void main(String[] args) {

        // Composition of Rules object
        // Rules -> define rules
        // Facts -> date required for the rules
        // Execution -> run the rules!!

        //Rules builder service should except the rule constituents and build the rules through rules builder class...
        //Rules orchestrator should orchestrates the execution sequence of the rule
        //Orchestrators execute/run all should execute the rules

         new SimpleDemoRulesOrchestrator().orchestrateSimpleDemoRules();
    }
}














