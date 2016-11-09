package com.jaredluo.springlearning.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 2)
public class MultiBeanOne implements MultiBean {

}
