package com.hsoo.rxjavastudy.observables.basic;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import io.reactivex.Observable;

public class P59 {

	public static void main(String[] args) {
		Future<String> future = Executors.newSingleThreadExecutor().submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
				Thread.sleep(1000);
				return "Hello future";
			}

		});

		// Observable<String> source = Observable.fromFuture(future);
		// source.subscribe(System.out::println);

		Observable.fromFuture(future).subscribe(System.out::println);
	}
}
