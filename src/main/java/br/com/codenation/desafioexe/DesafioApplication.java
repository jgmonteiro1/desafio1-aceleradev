package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);

		for(int i = 2; i < 350; i++){
			if(i == 15){
				break;
			}
			list.add(list.get(i-1) + list.get(i-2));
		}

		return  list;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}