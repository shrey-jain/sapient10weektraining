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
      
       
       int j=0;
      
       sieve(); 
       char x='A';
      
       String a[]=new String[26];
       for(int i=0;i<26;i++){
           
           a[i]=""+x+"-"+Integer.toHexString(primes.get(j));
           x++;
           j++;
           
       }
       Scanner s=new Scanner(System.in);
       String str=s.nextLine();
     
     String st=str.toUpperCase();
       String ans=new String();
       for(int i=0;i<str.length();i++){
          int index=st.charAt(i)-65;
           ans=ans+a[index].substring(2);
       
           
       }
       System.out.println(ans);
       
    } 
}