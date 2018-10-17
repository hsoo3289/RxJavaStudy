package com.hsoo.rxjavastudy.observables.basic;

import io.reactivex.Observable;

public class FirstExample {
	public void emit() {
		Observable.just("Hello", "RxJava2!!")
		.subscribe(System.out::println);
	}
	
	public static void main(String[] args) {
		FirstExample demo = new FirstExample();
		demo.emit();
	}
}
