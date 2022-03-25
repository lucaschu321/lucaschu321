package dataStructure;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Test1 {
	
	
}
//	public class Practice01 {
//
//	    public static List<String> FindTop3Movie(ArrayList<Data> movieList) {
//	            ArrayList<String> res = new ArrayList();
//	            PriorityQueue<Data> minheap = new PriorityQueue<>((n1, n2) -> n1.getCount() - n2.getCount());
//	            for (int i = 0; i < movieList.size(); i++) {
//	                minheap.add(movieList.get(i));
//	                if (minheap.size() > 3) {
//	                    minheap.poll();
//	                }
//	            }
//	            while (!minheap.isEmpty()) {
//	                res.add(minheap.poll().getMovieName());
//	            }
//	            return res;
//	    }
//
//	    public static void main(String[] args) {
//	        List<Data> movieList = new ArrayList<>();
//	        Data one = new Data("one", 100);
//	        Data two = new Data("two", 200);
//	        Data three = new Data("three", 300);
//	        Data four = new Data("four", 400);
//	        movieList.add(one);
//	        movieList.add(two);
//	        movieList.add(three);
//	        movieList.add(four);
//	        for (int i = 0; i < movieList.size();i++) {
//	            System.out.println("Movie Name: " + movieList.get(i).getMovieName() + " count:" + movieList.get(i).getCount());
//	        }
//	        System.out.println(FindTop3Movie((ArrayList<Data>) movieList));
//
//	    }
//	    }
//
//	class Data {
//	    private String movieName;
//	    private int count;
//
//	    Data(String movieName, int count) {
//	        this.movieName = movieName;
//	        this.count = count;
//	    }
//
//	    public String getMovieName(){
//	        return this.movieName;
//	    }
//
//	    public int getCount(){
//	        return this.count;
//	    }
//
//	}
//}
