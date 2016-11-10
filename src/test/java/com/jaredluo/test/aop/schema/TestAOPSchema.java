package com.jaredluo.test.aop.schema;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

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
}
