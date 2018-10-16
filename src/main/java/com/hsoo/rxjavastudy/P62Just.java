package com.hsoo.rxjavastudy;


import io.reactivex.Single;

public class P62Just {

	public static void main(String[] args) {
		Single<String> source = Single.just("Hello Single");
		source.subscribe(System.out::println);
	}
}
