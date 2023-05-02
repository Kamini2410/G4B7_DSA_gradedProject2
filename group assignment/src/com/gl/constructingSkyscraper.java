package com.gl;
import java.util.*;

class MyComparator implements Comparator

{

    public int compare(Object obj1,Object obj2)

    {

     Integer i1=(Integer)obj1;

     Integer i2=(Integer)obj2;

     return i2.compareTo(i1);

    }

}

public class constructingSkyscraper 

{

    public static void main(String[] args)  

    {

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the totla no. of floors");

     int n=sc.nextInt();

     int max=n;

     Queue<Integer> queue=new PriorityQueue<Integer>(new MyComparator());
     

     Integer disks[]=new Integer[n];

     for(int i=0;i<n;i++)

     {
System.out.println("Enter floor for day-"+i);
      disks[i]=sc.nextInt();
     
      queue.add(disks[i]);
      Queue<Integer> tempQueue=new PriorityQueue<Integer>(new MyComparator());
      tempQueue.addAll(queue);

      while(!tempQueue.isEmpty() &&tempQueue.peek()==max)

        {

   

          System.out.print(tempQueue.poll() + " ");
         
          
          max--;
         

        }max=n;
     

   

      System.out.println();

      }
   
     sc.close();
   }



}