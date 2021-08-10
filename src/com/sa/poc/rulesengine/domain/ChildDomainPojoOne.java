package com.sa.poc.rulesengine.domain;

/**
 * Sample top level POJO
 */
public class ChildDomainPojoOne extends ParentDomainPojo {
    /**
     * some property of this pojo
     */
    public String prop3;
    /**
     * some property of this pojo
     */
    public String prop4;

    /**
     * @return for printing the values of the attributes
     */
    @Override
    public String toString() {
        return "ChildDomainPojoOne{" +
                "prop1='" + prop1 + '\'' +
                ", prop2='" + prop2 + '\'' +
                ", prop3='" + prop3 + '\'' +
                ", prop4='" + prop4 + '\'' +
                '}';
    }
}