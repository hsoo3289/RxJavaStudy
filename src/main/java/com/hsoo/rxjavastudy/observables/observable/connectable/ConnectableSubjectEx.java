package com.hsoo.rxjavastudy.observables.observable.connectable;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

public class ConnectableSubjectEx {

	public static void main(String[] args) throws Exception {
		String[] data = {"1", "2", "3"};
		Observable<String> balls = Observable.interval(100L, TimeUnit.MILLISECONDS)
				.map(Long::intValue)
				.map(i -> data[i])
				.take(data.length);
		
		ConnectableObservable<String> source = balls.publish();
		source.subscribe(d -> System.out.println("Subscriber #1 data:"+d));
		source.subscribe(d -> System.out.println("Subscriber #2 data:"+d));
		source.connect();
		
		Thread.sleep(250);
		source.subscribe(d -> System.out.println("Subscriber #3 data:"+d));
		Thread.sleep(100);
	}
}
