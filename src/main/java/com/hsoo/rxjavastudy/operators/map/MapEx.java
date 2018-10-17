package com.hsoo.rxjavastudy.operators.map;

import com.hsoo.rxjavastudy.Log;

import io.reactivex.Observable;
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
			Observable<String> ob = Observable.just(ball+"¡Þ");
			System.out.println(ob.toString());
			return ob;
		};
		
		String[] balls = { "1", "3", "5" };
		Observable<String> source = Observable.fromArray(balls).flatMap(getDoubleDiamonds);
		source.subscribe(Log::i);
	}
	
	public static void main(String[] args) {
//		mapEx();
//		mappingType();
		flatMap();
		
	}
}
