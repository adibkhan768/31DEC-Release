package com.nt.beans;

import java.util.Date;

public class BlueDart {
	public BlueDart() {
		System.out.println("BlueDart.0-param constructor");
		System.out.println("This is the default constructor");
		System.out.println("This constructor provided by jdk");
	}
	public void deliver(int oid) {
		System.out.println(oid+" order is delivered to customer on "+new Date()+" by BlueDart");
	}

}
