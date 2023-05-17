public class primenumbersbetween1to100 
{
    public static void main(String args[])
    {
    int i;int flag=0;int j;
    for(i=1;i<=100;i++)
    {
        for(j=2;j<=i-1;j++)
        {
            if(i%j==0){
         flag=flag+1;
        }
    }
    if(flag==0)
        System.out.println(i);
        else
        flag=0;
    }
    
    

    }
    
}

