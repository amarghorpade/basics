package com.scp.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public class HashMapDemo<T> {

	/*
	 * 1st 
	 */
	public T getValueFromKey(HashMap<T, T> hmap, T val)throws NoSuchElementException
	{
		T returnVal = null;
		Set<Entry<T, T>> Hset = hmap.entrySet();
		Iterator itr = Hset.iterator();
		while (itr.hasNext())
		{
			Entry<T, T> entry = (Entry<T, T>) itr.next();
			if (entry.getValue() == null)
			{
				T o = entry.getValue();
				if (o == val)
				{
					returnVal= entry.getKey();
					break;
				}
			} 
			else 
			{
				if (entry.getValue().equals(val)) 
				{
					returnVal= entry.getKey();
					break;
				}
			}
		}
		return returnVal;
	}

	public T getValueFromKeyForEach(HashMap<T,T> hmapforeach, T val)throws NoSuchElementException
	{
		Set<Entry<T,T>> Hset = hmapforeach.entrySet();
		T returnVal = null;
		Iterator itr = Hset.iterator();
		for(Entry<T,T> m:Hset )
		{
			Entry<T, T> entry = (Entry<T,T>) itr.next();
			if (entry.getValue() == null)
			{
				T o = entry.getValue();
				if (o == val)
				{
					returnVal= entry.getKey();
					break;
				}
			} 
			else 
			{
				if (entry.getValue().equals(val)) 
				{
					returnVal= entry.getKey();
					break;
				}
			}
		}
		return returnVal;
	}
	
	public T getValueFromKeyForLoop(HashMap<T,T> hmapForLoop,T obj) throws NoSuchElementException
	{
		T returnVal = null;
		Set<T> keySet= hmapForLoop.keySet();
		Iterator<T> setItr= keySet.iterator();
		while (setItr.hasNext()) 
		{
			T o= hmapForLoop.get(setItr.next());
			//System.out.println("values are----"+o);
			if(o==null)
			{	
			if(o==obj)	
				{
					returnVal=setItr.next();
					break;
				}
			}
			else if(o==obj)
			{
				returnVal=setItr.next();
				break;
			}	
		}
		return returnVal;
	}
	
	public static void main(String[] args) {
		HashMap<String, String> hmap = new HashMap();
		hmap.put("four", "abhi");
		hmap.put("one", null);
		hmap.put("two", "mahesh");
		hmap.put("three", null);
		

		HashMapDemo hm = new HashMapDemo();
//		System.out.println("Excepted Key-- "+hm.getValueFromKey(hmap, null));
//		System.out.println("Excepted Key-- "+hm.getValueFromKeyForEach(hmap, null));
		System.out.println("Excepted Key-- "+hm.getValueFromKeyForLoop(hmap, null));
	}
}