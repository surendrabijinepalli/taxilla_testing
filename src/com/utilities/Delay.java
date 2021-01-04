package com.utilities;

public class Delay {
	public static void delayminimum(){
		try {
			Thread.sleep(10000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void delaymedium(){
		try {
			Thread.sleep(20000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void delaylarge()
	{
		try {
			Thread.sleep(40000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
