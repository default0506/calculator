package com.cloudsoftware.calculator;
import org.springframework.stereotype.Service;
@Service
public class Calculator{
	int sum(int a, int b){
		return a + b;	
	}

	int multi(int a, int b){
		return a*b;
	}
}
