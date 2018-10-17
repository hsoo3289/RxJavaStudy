package com.hsoo.rxjavastudy.observables.subject.async;

import io.reactivex.subjects.AsyncSubject;

public class P71SubjectOnComplete {

	public static void main (String[] args) {
		AsyncSubject<Integer> subject = AsyncSubject.create();
		subject.onNext(10);
		subject.onNext(11);
		subject.subscribe(System.out::println);
		subject.onNext(12);
		subject.onComplete();
		subject.onNext(13);
		subject.subscribe(System.out::println);
		subject.subscribe(System.out::println);
		
	}
}
