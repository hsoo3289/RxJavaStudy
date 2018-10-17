package com.hsoo.rxjavastudy.observables.subject.async;

import io.reactivex.Observable;
import io.reactivex.subjects.AsyncSubject;

public class P70FromArray {
	
	public static void main(String[] args) {
		Float[] temp = {10.1f, 13.4f, 12.5f};
		Observable<Float> ob = Observable.fromArray(temp);
		
		AsyncSubject<Float> subject = AsyncSubject.create();
		subject.subscribe(data -> System.out.println("subscriber #1 data:"+data));
		
		ob.subscribe(subject);
	}

}
