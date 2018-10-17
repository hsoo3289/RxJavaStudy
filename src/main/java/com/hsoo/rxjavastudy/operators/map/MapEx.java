package com.hsoo.rxjavastudy.operators.map;

import java.util.Scanner;

import com.hsoo.rxjavastudy.Log;

import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;

public class MapEx {
	
	public static void mapEx() {
		Function<String, String> getDiamond = ball -> ball+"¡Þ";
		
		String[] balls = {"1", "2", "3", "5"};
		Observable<String> source = Observable.fromArray(balls).map(getDiamond);
		
		source.subscribe(Log::i);
	}
	
	public static void mappingType() {
		Function<String, Integer> ballToIndex = ball -> {
			switch(ball) {
			case "RED": return 1;
			case "YELLOW": return 2;
			case "GREEN": return 3;
			case "BLUE": return 4;
			default: return -1;
			}
		};
		
		String[] balls = {"RED", "YELLOW", "GREEN", "BLUE" };
		Observable<Integer> source = Observable.fromArray(balls).map(ballToIndex);
		source.subscribe(System.out::println);
	}
	
	public static void flatMap() {
		Function<String, Observable<String>> getDoubleDiamonds = ball -> {
			System.out.println("ball:"+ball);
			Observable<String> ob = Observable.just(ball+"¡Þ", ball+"¡Þ¤±");
			System.out.println(ob.toString());
			return ob;
		};
		
		String[] balls = { "1", "3", "5" };
		Observable<String> source = Observable.fromArray(balls).flatMap(getDoubleDiamonds);
		source.subscribe(Log::i);
	}
	
	public static void times () {
		Scanner in = new Scanner(System.in);
		System.out.println("9 * 9");
		int dan = Integer.parseInt(in.nextLine());
		for (int row=1; row<=9; ++row) {
			System.out.println(dan + " * " + row + " = " + dan * row );
		}
	}
	
	public static void p92forToObservable() {
		Scanner in = new Scanner (System.in);
		System.out.println("gugudan input:");
		int dan = Integer.parseInt(in.nextLine());
		
		Observable<Integer> source = Observable.range(1, 9);
		source.subscribe(row -> System.out.println(dan + " * "+row+" = "+dan * row));
		source.doOnComplete(() -> in.close());
	}
	
	public static void p93_99danWithFlatMap() {
		Scanner in = new Scanner(System.in);
		System.out.println("input:");
		int dan = in.nextInt();
		in.close();
		
		Function<Integer, Observable<String>> f = new Function<Integer, Observable<String>> () {
			@Override
			public Observable<String> apply(Integer num) throws Exception {
				return Observable.range(1, 9).map(row -> num + " * " + row + " = " + num * row);
			}
		};
		
		Observable<String> source = Observable.just(dan).flatMap(f);
		source.subscribe(System.out::println);
	}
	
	public static void p95_FunctionToLanda() {
		Scanner in = new Scanner(System.in);
		System.out.print("input:");
		int dan = in.nextInt();
		in.close();
		
		Observable<String> source = Observable.just(dan)
				.flatMap(num -> Observable.range(1, 9).map(row -> num + " * " + row + " = " + num * row));
		source.subscribe(System.out::println);
	}
	
	public static void p97ResultSelector () {
		Scanner in = new Scanner(System.in);
		System.out.println("input:");
		int dan = in.nextInt();
		in.close();
		
		Observable<String> source = Observable.just(dan)
				.flatMap((num) -> Observable.range(1,9),
						(num, row) -> dan + " * " + row + " = " + dan * row);
		source.subscribe(System.out::println);
	}
	
	public static void main(String[] args) {
//		mapEx();
//		mappingType();
//		flatMap();
//		times();
//		p92forToObservable();
//		p93_99danWithFlatMap();
//		p95_FunctionToLanda();
		p97ResultSelector();
	}
}
