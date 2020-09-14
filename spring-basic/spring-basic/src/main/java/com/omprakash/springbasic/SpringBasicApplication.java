package com.omprakash.springbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicApplication {

	public static void main(String[] args) {
		
		BinarySearchImpl binarySearch=new BinarySearchImpl(new QuickSort());
		int result=binarySearch.binarySearch(new int[] {12,3,4,6}, 3);
		System.out.println(result);
		
		
//		SpringApplication.run(SpringBasicApplication.class, args);
	}

}
