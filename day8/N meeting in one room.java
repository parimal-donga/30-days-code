/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
  
public class GFG {
    int f;
    int e;
    int i;
    public GFG (){
    f=0;e=0;i=0;
  }
  public GFG (int a, int b, int c){
    f=a;e=b;i=c;
  }
  public int getE(){
      return e;
  }
	public static void main (String[] args) throws Exception{
		//code
		BufferedReader s = new BufferedReader (new InputStreamReader (System.in));
		int tt = Integer.parseInt(s.readLine());
		while(tt-->0){
		    int n = Integer.parseInt(s.readLine());
		    String [] kk = s.readLine().split(" ");
		    String [] kk2 = s.readLine().split(" ");
		    //GFG ans [] = new GFG [n];
		    ArrayList <GFG> meet = new ArrayList<GFG>();
		    for(int i=0;i<n;i++){
		        meet.add(new GFG(Integer.parseInt(kk[i]),Integer.parseInt(kk2[i]),i+1));
		    }
		    Comparator<GFG> comp=Comparator.comparing(GFG::getE);  
		    Collections.sort(meet,comp);
		    System.out.print(meet.get(0).i+ " ");
		    int fulluntil = meet.get(0).e;
		    for(int i=1;i<n;i++){
		        if(fulluntil>meet.get(i).f)continue;
		        fulluntil = meet.get(i).e;
		        System.out.print(meet.get(i).i+ " ");
		    }
		    System.out.println();
		}
		return;
	}
}
