package com.sa.poc.rulesengine.service;

import com.sa.poc.rulesengine.domain.ChildDomainPojoOne;
import com.sa.poc.rulesengine.domain.ChildDomainPojoTwo;

public class RulesDataMockService {

    public ChildDomainPojoOne getChildDomainPojoOneMockData (){
        ChildDomainPojoOne dataOne = new ChildDomainPojoOne();
        dataOne.prop1 = "r1p1";
        dataOne.prop2 = "r1p2";
        dataOne.prop3 = "r1p3";
        dataOne.prop4 = "r1p4";
        return dataOne;
    }

    public ChildDomainPojoTwo getChildDomainPojoTwoMockData(){
        ChildDomainPojoTwo dataTwo = new ChildDomainPojoTwo();
        dataTwo.prop1 = "r2p1";
        dataTwo.prop2 = "r2p2";
        dataTwo.prop5 = "r2p5";
        dataTwo.prop6 = "r2p6";
        return dataTwo;
    }
}
