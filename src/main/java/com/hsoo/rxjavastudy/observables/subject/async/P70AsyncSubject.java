package com.hsoo.rxjavastudy.observables.subject.async;

import io.reactivex.functions.Consumer;
import io.reactivex.subjects.AsyncSubject;

public class P70AsyncSubject {
	public static void main (String[] args) {
		AsyncSubject<String> subject = AsyncSubject.create();
		
		
		
		subject.subscribe(new Consumer<String>() {
				@Override
				public void accept(String t) throws Exception {
					System.out.println("subscriber #1 data:"+t);
				}
			}
		);
		subject.onNext("1");
		subject.onNext("3");
		subject.subscribe((s) -> System.out.println("subscriber #2 data:"+s));
		subject.onNext("5");
		subject.onComplete();
	}
}
