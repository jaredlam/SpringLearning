package com.jaredluo.test.beanannotation.injection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.jaredluo.springlearning.beanannotation.injection.AnnotationInjectionService;
import com.jaredluo.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotationInjection extends UnitTestBase{

	public TestBeanAnnotationInjection() {
		super("classpath:spring-beanannotation.xml");
	}
	
	@Test
	public void annotationInjection(){
		AnnotationInjectionService service = getBean("annotationInjectionService");
		service.save("This is auotwired");
	}

}
