package com.jaredluo.test.aop.schema;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.jaredluo.springlearning.aop.schema.AccessCount;
import com.jaredluo.springlearning.aop.schema.SchemaBiz;
import com.jaredluo.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPSchema extends UnitTestBase {

	public TestAOPSchema() {
		super("classpath:spring-schema-aop.xml");
	}

	@Test
	public void testAOP() {
		SchemaBiz schemaBiz = getBean("schemaBiz");
		schemaBiz.biz();
	}

	@Test
	public void testAOPAround() {
		SchemaBiz schemaBiz = getBean("schemaBiz");
		schemaBiz.biz1();
	}

	@Test
	public void testAOPAroundWithArgs() {
		SchemaBiz schemaBiz = getBean("schemaBiz");
		schemaBiz.biz2("Jared", 10);
	}

	@Test
	public void testIntroduction() {
		AccessCount accessCount = (AccessCount)getBean("schemaBiz");
		accessCount.count();
	}
}
