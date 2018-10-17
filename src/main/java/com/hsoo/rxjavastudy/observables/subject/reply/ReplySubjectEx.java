package com.hsoo.rxjavastudy.observables.subject.reply;

import io.reactivex.subjects.ReplaySubject;

/**
 * 구독시 이전의 모든 데이터를 받고 향후 발생 데이터를 받는다.
 * @author hsoo3
 * @since 20181016
 * 
 */

public class ReplySubjectEx {
	
	public static void main(String[] args) {
		
		ReplaySubject<String> subject = ReplaySubject.create();
		subject.subscribe(data -> System.out.println("subscriber #1 data:"+data));
		subject.onNext("1");
		subject.onNext("3");
		subject.subscribe(data -> System.out.println("subscriber #2 data:"+data));
		subject.onNext("5");
		subject.onComplete();
		
	}
}
