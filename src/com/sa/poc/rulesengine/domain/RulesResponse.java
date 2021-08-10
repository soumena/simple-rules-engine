package com.sa.poc.rulesengine.domain;

/**
 * Rules response
 */
public class RulesResponse {
    /**
     * Status of the rules execution, this can be either true or false
     */
    public boolean status;
    /**
     * Error message in case of a rule fails
     */
    public String errorMessage;
}
