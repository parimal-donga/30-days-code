/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws Exception {
		//code
		InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);  
		int n,i,x,y;
		int tt =Integer.parseInt(br.readLine());
		while(tt-->0){
		    n =Integer.parseInt(br.readLine());
		    int ar[]=new int [n];
		    String [] ok = br.readLine().split(" ");
		    for(i=0;i<n;i++){
		        ar[i]=Integer.parseInt(ok[i]);
		    }
		    x=ar[0];y=ar[0];
		    for(i=1;i<n;i++){
		        if(ar[i]>ar[i]+x)x=ar[i]; else x= ar[i]+x;
		        if(x>y)y=x;
		    }
		    System.out.println(y);
		}
	}
}
