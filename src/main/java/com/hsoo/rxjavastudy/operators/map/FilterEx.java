package com.hsoo.rxjavastudy.operators.map;

import io.reactivex.Observable;
import io.reactivex.Single;

public class FilterEx {
	
	
	private static void p98Filter () {
		String[] strs = { "1. circle", "2. diamonds", "3. triangles", "4. diamonds", "5. circle", "6. hexagon" };
		Observable<String> source = Observable.fromArray(strs)
				.filter(obj -> obj.endsWith("le"));
		source.subscribe(System.out::println);
	}
	
	private static void P99filter () {
		Integer[] data = {100, 34, 27, 99, 50};
		Observable<Integer> source = Observable.fromArray(data)
				.filter(num -> num % 2 == 0);
		source.subscribe(System.out::println);
	}
	
	private static void p99ObservableFilters() {
		Integer[] numbers = { 100, 200, 300, 400, 500 };
		Single<Integer> source = Observable
				.fromArray(numbers)
				.first(2);
		source.subscribe(System.out::println);
	}
	
	public static void main(String[] args) {
//		p98Filter();
//		P99filter();
		p99ObservableFilters();
	}

}
