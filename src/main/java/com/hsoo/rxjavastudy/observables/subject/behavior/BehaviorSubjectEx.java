package com.hsoo.rxjavastudy.observables.subject.behavior;

import io.reactivex.subjects.BehaviorSubject;

/**
 * 
 * @author hsoo3
 * @since 20181016
 * AsyncSubject�� ���� ��� ��(onComplete ��) �� ���� subscriber���� ����
 * BehaviorSubject �� ���� �� ���� �ް� Update �ø��� ����
 */

public class BehaviorSubjectEx {
	public static void main(String[] args) {
		BehaviorSubject<String> subject = BehaviorSubject.createDefault("6");
		subject.subscribe(data -> System.out.println("subscriber #1 data:"+data));
		subject.onNext("1");
		subject.onNext("3");
		subject.subscribe(data -> System.out.println("subscriber #2 data:"+data));
		subject.onNext("5");
		subject.onComplete();
	}
}
