package com.hsoo.rxjavastudy;

import io.reactivex.Observable;

public class P53 {

	public static void main(String[] args) {
		Integer[] arr = {100, 200, 300};
		Observable<Integer> source = Observable.fromArray(arr);
		source.subscribe(System.out::println);
		
//		source.subscribe(new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) throws Exception {
//				System.out.println(t);
//
//			}
//			
//		});
	}
}
