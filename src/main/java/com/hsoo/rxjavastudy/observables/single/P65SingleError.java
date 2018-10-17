package com.hsoo.rxjavastudy.observables.single;

import io.reactivex.Observable;

public class P65SingleError{
	
	public static void main (String[] args) {
		Observable.just("Hello Single", "err").single("default item").subscribe(System.out::println);
	}
}
