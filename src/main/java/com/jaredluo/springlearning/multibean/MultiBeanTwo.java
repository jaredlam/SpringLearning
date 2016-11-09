package com.jaredluo.springlearning.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)
public class MultiBeanTwo implements MultiBean {

}
