package com.maheshshittlani.class202324;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessLogic {
	@Autowired
	private Dependency1 dependency1;
	@Autowired
	private Dependency2 dependency2;
	
	
//	@Autowired - default
//	public BusinessLogic(Dependency1 dependency1, Dependency2 dependency2) {
//		this.dependency1 = dependency1;
//		this.dependency2 = dependency2;
//	}
	
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		this.dependency1 = dependency1;
//	}
//	
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		this.dependency2 = dependency2;
//	}
	
	@Override
	public String toString() {
		return "BusinessLogic [dependency1=" + dependency1 + ", dependency2=" + dependency2 + "]";
	}
	
}
