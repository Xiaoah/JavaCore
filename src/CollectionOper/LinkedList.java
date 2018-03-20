package CollectionOper;

import java.util.*;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class LinkedList {
	public static void main(String[] args)
	{
		List<String> a = new java.util.LinkedList<>();
		a.add("a");
		a.add("aa");
		a.add("aaa");
		
		List<String> b = new java.util.LinkedList<>();
		b.add("b");
		b.add("bb");
		b.add("bbb");
		b.add("bbbb");
		b.add("bbbbb");
		
		ListIterator<String> aIter = a.listIterator();
		Iterator<String> bIter = b.iterator();
		
		while(bIter.hasNext())
		{
			if(aIter.hasNext())
			{
				aIter.next();
			}
			aIter.add(bIter.next());
		}
		System.out.println(a);
		
		bIter = b.iterator();
		while(bIter.hasNext())
		{
			bIter.next();
			if(bIter.hasNext())
			{
				bIter.next();
				bIter.remove();               //删除的iterator越过的元素
			}
		}
		
		System.out.println(b);
	}
}



