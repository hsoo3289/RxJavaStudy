package com.hsoo.rxjavastudy;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

public class P49 {
	public static void main(String[] args) {
		Observable<Integer> source = Observable.create(new ObservableOnSubscribe<Integer>() {

			@Override
			public void subscribe(ObservableEmitter<Integer> e) throws Exception {
				e.onNext(100);
				e.onNext(200);
				e.onNext(300);
				e.onComplete();
			}
		});

		source.subscribe(System.out::println);
		source.subscribe(System.out::println);
	}
}
