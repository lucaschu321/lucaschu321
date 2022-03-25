package dataStructure;

import java.util.*;
import java.util.PriorityQueue;



public class Test {

public static void main(String[] args) {
	ArrayList<Data> movieList = new ArrayList<>();
	Data one = new Data("spiderman", 100);
	Data two = new Data("Batman", 200);
	Data three = new Data("Jocker", 500);
	Data four = new Data("Ironman", 400);
	movieList.add(one);
	movieList.add(two);
	movieList.add(three);
	movieList.add(four);
	BestMovie result = new BestMovie();
	System.out.println(result.FindTop3Movie(movieList));
//	ArrayList<String> result1 = result.FindTop3Movie(movieList);
//	System.out.println(result1);
	}
	


}

//class BestMovie {
//	
//	ArrayList<Data> movieList;
//	ArrayList<String> FindTop3Movie (ArrayList<Data>  movieList) {
//	ArrayList<String> res = new ArrayList<>();
//	PriorityQueue<Data>	heap = new PriorityQueue<>((n1,n2) -> n1.count - n2.count);
//	
//	for(int i = 0; i < movieList.size(); i++) {
//	heap.add(movieList.get(i));
//	if(heap.size() > 3) {
//		heap.poll();
//	}
//}
//while(!heap.isEmpty()) {
//	res.add(heap.poll().movieName);//getMovieName());
//	//return heap.poll().movieName;
//}
//return res;
}
}
class Data{
	String movieName;
	int count;
	

	public Data(String movieName, int count) {
		this.movieName = movieName;
		this.count = count;
	}
//	public String getMovieName() {
//		return this.movieName;
//	}
//	
//	public int getCount() {
//		return this.count;
//	}
}





	





