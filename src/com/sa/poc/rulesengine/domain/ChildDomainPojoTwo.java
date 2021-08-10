package com.sa.poc.rulesengine.domain;

/**
 * Sample child level POJO
 */
public class ChildDomainPojoTwo extends ParentDomainPojo {
    /**
     * some property of this pojo
     */
    public String prop5;
    /**
     * some property of this pojo
     */
    public String prop6;

    /**
     * @return for printing the values of the attributes
     */
    @Override
    public String toString() {
        return "ChildDomainPojoTwo{" +
                "prop1='" + prop1 + '\'' +
                ", prop2='" + prop2 + '\'' +
                ", prop5='" + prop5 + '\'' +
                ", prop6='" + prop6 + '\'' +
                '}';
    }
}