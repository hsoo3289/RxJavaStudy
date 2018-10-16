package com.hsoo.rxjavastudy;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import io.reactivex.Observable;

public class P56 {
	public static void main(String[] args) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(100);
		queue.add(new String("ORD-1"));
		queue.add(new String("ORD-2"));
		queue.add(new String("ORD-3"));
		
		Observable<String> source = Observable.fromIterable(queue);
		source.subscribe(System.out::println);
	}
}
