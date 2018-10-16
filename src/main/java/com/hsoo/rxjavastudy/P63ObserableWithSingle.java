package com.hsoo.rxjavastudy;

import io.reactivex.Observable;
import io.reactivex.Single;

public class P63ObserableWithSingle {

	public static void main(String[] args) {
		// 1. Observable 객체에서 Single 객체 생성하기
		Observable<String> source = Observable.just("Hello Single");
		Single.fromObservable(source).subscribe(System.out::println);
		
		// 2. Single() 함수를 통해 Observable 객체 변환
		Observable.just("Hello Single").single("default item").subscribe(System.out::println);
		
		// 3. Array에서 first() 함수를 통해 변환
		String[] colors = { "Red", "blue", "Gold" };
		// String[] colors = {}; => "default value" 가 찍힘.
		Observable.fromArray(colors).first("defaultvalue").subscribe(System.out::println);
		
		// 4. empty() 에서 Single 객체 생성
		Observable.empty().single("default value").subscribe(System.out::println);
		
		// 5. take() 함수에서 Single 객체 생성
		Observable.just(new String("item1"), new String("item2"))
		.take(1).single(new String("default")).subscribe(System.out::println);
		
		
	}
}
