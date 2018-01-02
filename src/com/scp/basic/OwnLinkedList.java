package com.scp.basic;
import java.util.LinkedList;

public class OwnLinkedList
{
	 MyNode head;
	 MyNode tail;
	public void addNode(MyNode node)
	{
		if(head==null)
		{
			head=node;
			tail=node;
			System.out.println(node.data);
		}	
		else
		{
			tail.next=node;
			tail=node;
		System.out.println(node.data);
		}
	}
	
	static class MyNode
	{
		int data;
		MyNode next;
	
		 public MyNode(int data, MyNode next)
		{
			super();
			this.data = data;
			this.next = next;	
		}
 	}
	public static void main(String[] args) 
	{
		OwnLinkedList ol=new OwnLinkedList();
		MyNode mn= new MyNode(10,null);
		MyNode mn1= new MyNode(20,null);
		MyNode mn2= new MyNode(30,null);
		ol.addNode(mn);
		ol.addNode(mn1);
		ol.addNode(mn2);
		ol.addNode(mn);
		ol.addNode(mn1);
		ol.addNode(mn2);
		ol.addNode(mn);
		ol.addNode(mn1);
		ol.addNode(mn2);
		ol.addNode(mn);
		ol.addNode(mn1);
		ol.addNode(mn2);
		ol.addNode(mn);
		ol.addNode(mn1);
		ol.addNode(mn2);
		ol.addNode(mn);
		ol.addNode(mn1);
		ol.addNode(mn2);
	}

}