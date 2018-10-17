package com.hsoo.rxjavastudy.observables.basic;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;

public class P55 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		
		
		Observable<Integer> source = Observable.fromIterable(list);
		source.subscribe(System.out::println);
	}
}
