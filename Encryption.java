import java.util.*;
class Encryption{
    
     
    

    static ArrayList<Integer> primes = 
       new ArrayList<Integer>(); 
      
      
   
    static void sieve()  
    {  primes.add(1); 
       
        boolean [] IsPrime = new boolean[1000];  
          
        for(int i = 0; i < 1000; i++) 
            IsPrime[i] = true; 
          
        for (int p = 2; p * p < 1000; p++)  
        {  
           
            if (IsPrime[p] == true)  
            {  
                  
                for (int i = p * p; i < 1000; i += p)  
                    IsPrime[i] = false;  
            }  
        }  
      
        
        for (int p = 2; p <1000; p++)  
        if (IsPrime[p] == true)  
                primes.add(p); 
    }  
      

    public static void main (String[] args)  
    { 
          
       int a[]=new int[200];
       int j=0;
       sieve();
       for(int i=65;i<91;i++){
           a[i]=primes.get(j);
           a[i+32]=primes.get(j);
           j++;
       }
       Scanner s=new Scanner(System.in);
       String str=s.nextLine();
       String ans=new String();
       for(int i=0;i<str.length();i++){
           ans=ans+Integer.toHexString(a[str.charAt(i)]);
       
           
       }
       System.out.println(ans);
       
    } 
}