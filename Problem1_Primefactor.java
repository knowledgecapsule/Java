package com.jai.java8.learnings;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Primefactor {

	static Set primeFactorsList = new HashSet();
	public static void main(String[] args) {
		System.out.println(primeFactor(32));
		Stream<Integer> list = Stream.iterate(1,x->x+1).filter(x -> 2%x==0).limit(10);
		long number = 32l;
		if(LongStream.rangeClosed(2,(long)Math.sqrt(number)).noneMatch(i->number%i==0))
			System.out.println("True");
	 }

	public static Set primeFactor(int number)
	{
		if(number > 0)
		{
			int i = 2;
			while(i <= number/2)
			{
				if(number%i == 0)
				{
					if(i>7 || i%2==0)
						primeFactor(i);
					else
						primeFactorsList.add(i);
				}
				i++;
			}
		}
		if(!(primeFactorsList.size() > 0))
			primeFactorsList.add(number);
		return primeFactorsList;
	}
}
