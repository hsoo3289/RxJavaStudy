package com.hsoo.rxjavastudy;

import java.util.concurrent.Callable;

import io.reactivex.Observable;

public class P58 {

	public static void main(String[] args) {
//		Callable<String> callable = new Callable<String>() {
//
//			@Override
//			public String call() throws Exception {
//				Thread.sleep(1000);
//				return "Hello world";
//			}
//			
//		};

		Callable<String> callable = () -> {
			Thread.sleep(1000);
			return "Hello world";
		};

		Observable<String> source = Observable.fromCallable(callable);
		source.subscribe(System.out::println);
	}
}
