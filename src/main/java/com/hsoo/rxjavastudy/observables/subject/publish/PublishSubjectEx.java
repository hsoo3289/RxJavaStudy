package com.hsoo.rxjavastudy.observables.subject.publish;

import io.reactivex.subjects.PublishSubject;

/**
 * 
 * @author hsoo3
 * @since 2018.10.16
 * PublishSubject�� ���� ������ �����Ͱ� ������ �ȳѱ�
 */

public class PublishSubjectEx {
	
	public static void main(String[] args) {
		PublishSubject<String> subject = PublishSubject.create();
		
		subject.subscribe(data -> System.out.println("subscriber #1 data:"+data));
		subject.onNext("1");
		subject.onNext("3");
		subject.subscribe(data -> System.out.println("subscriber #2 data:"+data));
		subject.onNext("5");
		subject.onComplete();
	}
}
