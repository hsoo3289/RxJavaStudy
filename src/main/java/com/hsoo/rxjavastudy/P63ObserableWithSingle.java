package com.hsoo.rxjavastudy;

import io.reactivex.Observable;
import io.reactivex.Single;

public class P63ObserableWithSingle {

	public static void main(String[] args) {
		// 1. Observable ��ü���� Single ��ü �����ϱ�
		Observable<String> source = Observable.just("Hello Single");
		Single.fromObservable(source).subscribe(System.out::println);
		
		// 2. Single() �Լ��� ���� Observable ��ü ��ȯ
		Observable.just("Hello Single").single("default item").subscribe(System.out::println);
		
		// 3. Array���� first() �Լ��� ���� ��ȯ
		String[] colors = { "Red", "blue", "Gold" };
		// String[] colors = {}; => "default value" �� ����.
		Observable.fromArray(colors).first("defaultvalue").subscribe(System.out::println);
		
		// 4. empty() ���� Single ��ü ����
		Observable.empty().single("default value").subscribe(System.out::println);
		
		// 5. take() �Լ����� Single ��ü ����
		Observable.just(new String("item1"), new String("item2"))
		.take(1).single(new String("default")).subscribe(System.out::println);
		
		
	}
}
