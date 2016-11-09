package com.jaredluo.springlearning.multibean;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MultiBeanInvoker {

	@Autowired
	private List<MultiBean> list;

	@Autowired
	private Map<String, MultiBean> map;

	@Autowired
	@Qualifier("multiBeanTwo")
	private MultiBean bean;

	public void say() {
		if (null != list && 0 != list.size()) {
			System.out.println("List:");
			for (MultiBean bean : list) {
				System.out.println(bean.getClass().getName());
			}
		}

		System.out.println();

		if (null != map && 0 != map.size()) {
			System.out.println("Map:");
			for (Entry<String, MultiBean> entry : map.entrySet()) {
				System.out.println(entry.getKey() + "    " + entry.getValue().getClass().getName());
			}
		}

		System.out.println();

		if (null != bean) {
			System.out.println(bean.getClass().getName());
		} else {
			System.out.println("bean is null");
		}
	}
}
