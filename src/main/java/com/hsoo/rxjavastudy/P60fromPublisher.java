package com.hsoo.rxjavastudy;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

import io.reactivex.Observable;

public class P60fromPublisher {

	public static void main(String[] args) {

		Publisher<String> publisher = new Publisher<String>() {

			@Override
			public void subscribe(Subscriber<? super String> s) {
				s.onNext("Hello Observable from Publisher.");
				s.onComplete();
			}
		};

		// Observable<String> source = Observable.fromPublisher(publisher);
		// source.subscribe(System.out::println);

		Observable.fromPublisher(publisher).subscribe(System.out::println);
	}
}
